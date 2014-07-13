package com.rsos.web.bean;


import java.io.Serializable;

import com.rsos.web.constants.StateCodeConstant;


/**
 * ajax json 返回值包装对象
 * @author Tommy
 *
 */
public class JsonResult implements Serializable {
	
	/**
	 * 序列化ID
	 */
	private static final long serialVersionUID = -7073856910135669765L;
	/**
	 * 操作结果（成功或失败）
	 */
	boolean isOk = true;
	/**
	 * 操作状态码
	 */
	String stateCode = StateCodeConstant.SUCCESS_CODE;
	/**
	 * 操作提示信息
	 */
	String message;
	/**
	 * 备注
	 */
	String comment;
	/**
	 * 数据
	 */
	Object data;

	public boolean isOk() {
		return isOk;
	}

	public String getStateCode() {
		return stateCode;
	}

	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public void setOk(boolean isOk) {
		this.isOk = isOk;
	}
	
}
