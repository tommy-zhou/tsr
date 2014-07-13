package com.rsos.web.auth;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/*
 * 
 */
public class SysAuthConst {
	
	public  List<SysMenuItemCode> list;
	
	private static final Logger logger = LoggerFactory
			.getLogger(SysAuthConst.class);
	
	public List<String> menuCodeArr;   //系统菜单编码
	public List<String> erpURLArr;   //erp返回的地址 数组
	public List<String> managerURLArr;  //后台菜单跳转页面数组
	
	//初始化，使用Authority初始化
	public SysAuthConst(Authority auth){
		menuCodeArr=auth.menuCodeArr;
		erpURLArr=auth.erpURLArr;
		managerURLArr=auth.managerURLArr;
	}
	//读取数据库的内容 list，初始化权限列表
	//暂时使用常量
	/*
	public static String[] menuCodeArr={
		"1#1",
		"1#2",
		"1#3",
		"2#1",
		"2#2",
		"2#3",
		"2#4",
		"2#5",
		"2#6",
		"2#7",
		"2#8",
		"2#9",
		"2#10",
		"2#11",
		"2#12",
		"2#13",
		"3#1",
		"3#2",
		"3#3",
		"3#4",
		"3#5",
		"3#6",
		"3#7",
		"4#1",
		"4#2",
		"4#3",
		"4#4",
		"4#5",
		"4#6",
		"4#7",
		"4#8",
		"4#9",
		"4#10",
		"4#11",
		"4#12",
		"4#13",
		"4#14",
		"2#14",
		"4#15",
		"3#8",
		"3#9",
		"3#10"

	};
	
	public static String[] erpURLArr={
		"userinfoList",
		"userinfoAdd",
		"userinfoIsBlack",
		"productGoodsList",
		"recycleList",
		"importGoods",
		"filterGoods",
		"addGoods",
		"productInfoList",
		"addProduct",
		"adjustPrice",
		"productStockList",
		"brandList",
		"productTagList",
		"productCategoryList",
		"productAttributesList",
		"contentEdit",
		"mediaList",
		"mediaAdd",
		"channelList",
		"channelAdd",
		"mediaRecycle",
		"couponLotList",
		"orderInfoList",
		"orderDetail",
		"addOrder",
		"orderInfoSearch",
		"orderSuspendList",
		"orderQuestionList",
		"orderReturnList",
		"orderReturnDetail",
		"orderReturnShipList",
		"orderReturnQualityList",
		"orderReturnStorageList",
		"orderReturnCheckList",
		"orderSettleList",
		"orderReturnSettleList",
		"productServiceTotal",
		"ruleList",
		"keyWordList",
		"noticeList",
		"extCategorySettingList"
	};
	
	public static String[] managerURLArr={
		"userinfo/list.htm",
		"userinfo/add.htm",
		"userinfo/isBlack.htm",
		"productGoods/list.htm",
		"recycleList/list.htm",
		"productGoods/importGoods.htm",
		"productGoods/filterGoods.htm",
		"productGoods/addGoods.htm",
		"productInfo/list.htm",
		"productInfo/addProduct.htm",
		"adjust/adjustPrice.htm",
		"productStock/search.htm",
		"brand/list.htm",
		"productTag/list.htm",
		"productCategory/list.htm",
		"productAttributes/list.htm",
		"page/content_edit.htm",
		"page/media_list.htm",
		"page/media_add.htm",
		"page/channelList.htm",
		"page/channel.htm",
		"page/mediaRecycle.htm",
		"coupon/couponLotList.htm",
		"orderInfo/showList.htm",
		"orderItem/orderdetail.htm",
		"orderInfo/addOrder.htm",
		"orderInfo/search.htm",
		"orderSuspend/list.htm",
		"orderQuestion/list.htm",
		"orderReturn/list.htm",
		"refundDetail/show.htm",
		"unShipmentOrderReturn/list.htm",
		"unQualityOrderReturn/list.htm",
		"unStorageOrderReturn/list.htm",
		"unCheckOrderReturn/list.htm",
		"unSettlementOrder/list.htm",
		"unSettlementOrderReturn/list.htm",
		"serviceTotal/list.htm",
		"ruleInfo.htm",
		"keywordsInfo/list.htm",
		"webArticle/list.htm",
		"extCategorySetting/list.htm"
	};
	*/
	public void init(){
		int len=menuCodeArr.size();
		list=new ArrayList<SysMenuItemCode>();
		
		for(int i=0;i<len;i++){
			list.add(new SysMenuItemCode(menuCodeArr.get(i), erpURLArr.get(i), managerURLArr.get(i)));
		}
	}
	
	public SysMenuItemCode getSysMenuItemCodeByErpURL(String erpURL){
		init();
		int len=erpURLArr.size();
		
		//logger.info("erpURL:"+erpURL);
		
		for(int i=0;i<len;i++){
			if(erpURLArr.get(i).equals(erpURL)){
				return list.get(i);
			}
		}
		return null;
	}
	
	//是否需要拦截
	public Boolean isNeedToCheckURL(String url){
		
		init();
		int len=managerURLArr.size();
		for(int i=0;i<len;i++){
			if(managerURLArr.get(i).equals(url)){
				return true;
			}
		}
		
		return false;
	}
	
	//获取所有的菜单ITEM，当权限未开启时使用
	public List<SysMenuItemCode> getAllSysMenuItemCode(){
		init();
		return list;
	}
	
	
}
