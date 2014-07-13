package com.rsos.web.bean;

import java.io.Serializable;

/*
 * author:yulu
 * 包装使用 分页时 返回的json数据，便于前端js使用
 * count:返回的记录条数 
 * data:数据
 * nowpage:当前页
 * allcount: 记录总数 (用于分页)
 */
public class PageListJSON  implements Serializable {

	private static final long serialVersionUID = 3959918412662295686L;
	
	private int count;
	private int nowpage;
	private int allcount;
	/**
	 * 数据
	 */
	Object data;
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getNowpage() {
		return nowpage;
	}
	public void setNowpage(int nowpage) {
		this.nowpage = nowpage;
	}
	public int getAllcount() {
		return allcount;
	}
	public void setAllcount(int allcount) {
		this.allcount = allcount;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
}
