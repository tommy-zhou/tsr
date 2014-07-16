// JavaScript Document
$(function(){
	var left_html = '';
	left_html += '<ul>';
	left_html += '<li><div><img src="static/img/left01.jpg" /></div><ul><li><a href="我的订单.html">订单中心</a></li><li><a href="退换货预约.html">退换货预约</a></li><li><a href="购物车.html">我的购物车</a></li></ul></li>';
	left_html += '<li style="margin-top:10px;"><div><img src="static/img/left02.jpg" /></div><ul><li><a href="wodejifen.html">我的积分</a></li><li><a href="wodeyouhuiquan.html">我的优惠券</a></li><li><a href="我的关注.html">我的关注</a></li></ul></li>';
	left_html += '<li style="margin-top:10px;"><div><img src="static/img/left03.jpg" /></div><ul><li><a href="gerenziliao.html">个人资料</a></li><li><a href="shouhuodizhi.html">地址管理</a></li><li><a href="xiugaimima.html">修改密码</a></li></ul></li>';
	left_html += '</ul>';
	
	$('.leftMenu').html(left_html);	
	
	//当前页面高亮显示
	var leftMenuIndex = $('#leftMenuNo').val();		//获取页面左侧序号
	var leftMenuIndexArr = leftMenuIndex.split('_');
	var leftMenuGrade1 = parseInt(leftMenuIndexArr[0]) - 1;	//一级菜单序号
	var leftMenuGrade2 = parseInt(leftMenuIndexArr[1]) - 1;	//二级菜单序号
	
	$('.leftMenu>ul>li:eq('+leftMenuGrade1+')>ul>li:eq('+leftMenuGrade2+')').addClass('leftMenuHit');
	
})





            	
                
                
            