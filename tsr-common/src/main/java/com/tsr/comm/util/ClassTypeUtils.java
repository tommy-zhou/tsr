package com.tsr.comm.util;

/**
 * 类型转换工具
 * @author Tommy
 *
 */
public class ClassTypeUtils {
	
	public static boolean  convert(Byte object){
		if(object == null || object == 0){
			return false;
		}else{
			return true;
		}
	}
}
