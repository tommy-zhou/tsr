package com.tsr.comm.custom;


import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.springframework.beans.BeanWrapper;
import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.core.MethodParameter;
import org.springframework.web.bind.support.WebArgumentResolver;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import com.tsr.comm.util.DateTimeUtils;
//import com.rsos.comm.util.XSSFilterUtil;
import com.tsr.comm.util.StringUtils;

public class BeanArgumentResolver implements WebArgumentResolver {

	@SuppressWarnings("rawtypes")
	public Object resolveArgument(MethodParameter param, NativeWebRequest request) throws Exception {
		RequestBean requestBean = param.getParameterAnnotation(RequestBean.class);
		
		if (requestBean != null) {
			String _param = requestBean.value();
			if (_param.equals("_def_param_name")) {
				_param = param.getParameterName();
			}
			Class clazz = param.getParameterType();
			Object object = clazz.newInstance();
			HashMap<String, String[]> paramsMap = new HashMap<String, String[]>();
			Iterator<String> itor = request.getParameterNames();
			while (itor.hasNext()) {
				String webParam = itor.next();
				String[] webValue = request.getParameterValues(webParam);
				if (webParam.startsWith(_param+".")) {
					paramsMap.put(webParam, webValue);
				}
			}
			BeanWrapper obj = new BeanWrapperImpl(object);
			obj.registerCustomEditor(Date.class, null, new CustomDateEditor(new SimpleDateFormat(DateTimeUtils.dateTimeString), true));
			obj.registerCustomEditor(String.class, new StringTrimmerEditor(false));
			obj.registerCustomEditor(byte[].class,new ByteArrayMultipartFileEditor());
			
			for (String propName : paramsMap.keySet()) {
				String[] propVals = paramsMap.get(propName);
				
				// System.out.println(propName);
				// TODO 除了密码，其他都要做特殊字符替换处理
				if(!propName.endsWith("Password") && !propName.endsWith("password")){
					
					for (int i = 0; i < propVals.length; i++) {
						
						propVals[i] = StringUtils.replaceHtmlCh(propVals[i]);
						
						// TODO html安全过滤(后台使用富文本编辑器的时候注意！)
						//propVals[i] = XSSFilterUtil.protectAgainstXSS(propVals[i]);
						// System.out.println(propVals[i]);
					}
				}
				
				String[] props = propName.split("\\.");
				if (props.length == 2) {
					obj.setPropertyValue(props[1], propVals);
				} else if (props.length == 3) {
					Object tmpObj = obj.getPropertyValue(props[1]);
					if (tmpObj == null)
						obj.setPropertyValue(props[1], obj.getPropertyType(props[1]).newInstance());
					obj.setPropertyValue(props[1] + "." + props[2], propVals);
				}

			}
			return object;
		} else {
			return WebArgumentResolver.UNRESOLVED;
		}
	}
}
