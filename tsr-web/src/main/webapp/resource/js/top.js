// JavaScript Document
$(function(){
	var top_html = '';
	
	top_html +=	'<div class="userInfo">';
		top_html +=	'<div class="userInfoBox">';
			top_html +=	'<div class="userWelcome">欢迎光临红星家品会， <a href="">[登录]</a>    <a href="">[免费注册]</a></div>';	
			top_html +=	'<div class="userMenu"><a href="">我的订单</a>    <a href="">帮助中心</a>  客服热线： <img src="../resource/img/tel.jpg" style="margin-top:-3px; *margin-top:0px;"></div>';		
		top_html +=	'</div>';
	top_html +=	'</div>';
	
	top_html +=	'<div class="header">';
	
	
	
	top_html +=	'<div class="head_wrap" >';
	
	//top_html +=	'<div style="position:absolute; right:10px; top:10px;"><iframe scrolling="no" width="800" height="90" frameborder="0" src="头信息.html" allowtransparency="true"></iframe></div>';
	
	top_html +=	'<a href="index.html" target="_self" class="logo"><img src="../resource/img/logo.png" alt="红星家品会 - 品牌家具特卖网" /></a>';
	
	top_html +=	'<div class="searchKeys">热门搜索：<a href="">淋浴花洒</a>   <a href="">厨卫五金</a>   <a href="">吸顶灯</a>   <a href="">吊灯</a>   <a href="">油漆/涂料</a>   <a href="">开关插座</a>   <a href="">节能灯</a></div>';
	
	top_html +=	' <div class="search">';
	top_html +=	'<form action="" method=""><input type="text" class="txt_name" value="热门搜索：现代沙发  双人床  儿童床  实木餐桌" /><input type="button"  class="sub_btn" value="" onclick="location.href=\'商品列表页.html\'" /></form></div>';
	top_html +=	'<a href="购物车.html" target="_parent"><span class="shopCar"><div style="position:absolute; left:119px; top:11px;"><span>(</span><span class="shoppingNum">22</span><span>)</span></span></div></span></a>';
	
	//top_html +=	'<a href="" target="_parent"><span class="wddd"></span></a>';
	
	top_html +=	'<div class="bz"><img src="../resource/img/bz.jpg" border="0" usemap="#topMap" ><map name="topMap" id="topMap"><area shape="rect" coords="1,0,96,81" href="../前台html/帮助中心购物保障.html#5_2" /><area shape="rect" coords="96,-1,186,82" href="../前台html/帮助中心购物保障.html#5_6" /><area shape="rect" coords="186,4,283,82" href="../前台html/帮助中心售后服务.html#3_1" /></map></div>';
	
	top_html +=	'</div></div>';
	
	
	top_html +=	'<div class="nav"><div class="nav_wrap"><span id="s_all_cate" class="all_cate">全部商品分类<i></i></span>';
	
	
	//top_html +=	' <ul class="nav_list"><li><a href="index.html"> 首页</a></li><li><a href="品牌专区.html">品牌专区</a></li><li><a href="品牌特卖.html">品牌特卖</a></li><li><a href="最后疯抢.html">最后疯抢</a></li><li><a href="情景展示.html">情景展示</a></li><li><a href="设计师说.html">设计师说</a></li></ul>';
	
	top_html +=	' <ul class="nav_list"><li><a href="index.html"> 首页</a></li><li><a href="http://www.hxshop.com/brand/channel.htm?id=8405 ">热卖推荐</a></li><li><a href="http://www.hxshop.com/brand/channel.htm?id=7449">建材/卫浴</a></li><li><a href="http://www.hxshop.com/brand/channel.htm?id=8452">沙发/软床</a></li><li><a href="http://www.hxshop.com/brand/channel.htm?id=8445">卧室/套房</a></li><li><a href="品牌专区.html">儿童/家纺</a></li></ul>';
	
	
	top_html +=	'<div id="d_cate_wrap" class="cate_wrap"  >';
	
	top_html += '<div class="xlmenuDiv"><table>';
		top_html += '<tr>';
			top_html += '<td class="xlmenuLeft"><img src="../resource/img/lm1.jpg" /></td>';
			top_html += '<td><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=23" target="_blank">床</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=22" target="_blank">床垫</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=116" target="_blank">儿童家具</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=24" target="_blank">柜</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=24" target="_blank">茶几</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=24" target="_blank">家饰家纺</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=24" target="_blank">沙发</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=24" target="_blank">餐桌椅</a></li></ul></td>';
		top_html += '</tr>';
		top_html += '<tr>';
			top_html += '<td class="xlmenuLeft"><img src="../resource/img/lm2.jpg" /></td>';
			top_html += '<td><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=207" target="_blank">水槽</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=229" target="_blank">台盆</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=234" target="_blank">坐便器</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=235" target="_blank">水龙头</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=235" target="_blank">净水器</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=235" target="_blank">浴室柜</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=235" target="_blank">淋浴花酒</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=235" target="_blank">开关插座</a></li></ul></td>';
		top_html += '</tr>';
		top_html += '<tr>';
			top_html += '<td class="xlmenuLeft"><img src="../resource/img/lm3.jpg" /></td>';
			top_html += '<td><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=14" target="_blank">皮沙发</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=10" target="_blank">软床</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=11" target="_blank">净水器</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=11" target="_blank">智能坐便盖</a></li></ul></td>';
		top_html += '</tr>';
		top_html += '<tr>';
			top_html += '<td class="xlmenuLeft"><img src="../resource/img/lm4.jpg" /></td>';
			top_html += '<td><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=2" target="_blank">注册送礼</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=2" target="_blank">春季特卖</a></li></ul></td>';
		top_html += '</tr>';
		
		
		
		
		
		
	top_html += '</table></div>';
	
	/**
	top_html +=	'<h5 class="cate1">家具</h5><ul><li><a href="#" target="_blank">床</a></li><li><a href="#" target="_blank">衣柜</a></li><li><a href="#" target="_blank">儿童家具</a></li><li><a href="#" target="_blank">餐桌</a></li><li><a href="#" target="_blank">床垫</a></li><li><a href="#" target="_blank">电脑桌</a></li><li><a href="#" target="_blank">椅子</a></li><li><a href="#" target="_blank">书桌</a></li><li><a href="#" target="_blank">沙发</a></li></ul>';
	top_html +=	'<h5 class="cate2">建材</h5><ul><li><a href="#" target="_blank">卫浴</a></li><li><a href="#" target="_blank">净水</a></li><li><a href="#" target="_blank">开关</a></li><li><a href="#" target="_blank">涂料</a></li><li><a href="#" target="_blank">水槽</a></li><li><a href="#" target="_blank">厨电</a></li><li><a href="#" target="_blank">五金</a></li><li><a href="#" target="_blank">墙纸</a></li><li><a href="#" target="_blank">门窗</a></li></ul>';
	top_html +=	'<h5 class="cate3">家居</h5><ul><li><a href="#" target="_blank">晾晒</a></li><li><a href="#" target="_blank">枕头/枕芯</a></li><li><a href="#" target="_blank">床品套件</a></li><li><a href="#" target="_blank">台灯</a></li><li><a href="#" target="_blank">窗帘/窗纱</a></li><li><a href="#" target="_blank">精品被芯</a></li><li><a href="#" target="_blank">餐厨</a></li><li><a href="#" target="_blank">地毯/地垫</a></li><li><a href="#" target="_blank">净化</a></li></ul>';
	top_html +=	'<h5 class="cate4">热门推荐</h5><ul><li><a href="#" target="_blank">吊灯</a></li><li><a href="#" target="_blank">吸顶灯</a></li><li><a href="#" target="_blank">奥朵</a></li></ul>';
	top_html +=	'<h5 class="last">所有品牌</h5><ul><li><a href="#" target="_blank">全部品牌分类</a></li></ul>';
	**/
	/**
	top_html +=	'<h5 class="cate1"><a href="http://www.hxshop.com/productList/search.htm?categoryId=15">家具沙发</a></h5><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=16" target="_blank">床</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=23" target="_blank">床垫</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=22" target="_blank">沙发</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=116" target="_blank">餐桌餐椅</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=24" target="_blank">儿童家具</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=155" target="_blank">鞋柜</a></li></ul>';
	
	//<li><a href="http://www.hxshop.com/productList/search.htm?categoryId=152" target="_blank">电视柜</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=160" target="_blank">衣柜</a></li>
	
	top_html +=	'<h5 class="cate2"><a href="http://www.hxshop.com/productList/search.htm?categoryId=28">家装建材</a></h5><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=207" target="_blank">厨房水槽</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=229" target="_blank">座便器</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=234" target="_blank">花洒</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=235" target="_blank">卫浴龙头</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=45" target="_blank">开关插座</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=44" target="_blank">锁具五金</a></li></ul>';
	
	top_html +=	'<h5 class="cate3"><a href="http://www.hxshop.com/productList/search.htm?categoryId=8">家饰软装</a></h5><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=14" target="_blank">灯饰</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=10" target="_blank">壁饰</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=11" target="_blank">摆件</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=65" target="_blank">酒具</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=12" target="_blank">钟饰</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=9" target="_blank">油画</a></li></ul>';
	
	top_html +=	'<h5 class="cate4"><a href="http://www.hxshop.com/productList/search.htm?categoryId=1">家居用品</a></h5><ul><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=2" target="_blank">床品套件</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=2" target="_blank">毛巾浴巾</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=59" target="_blank">地垫地毯</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=4" target="_blank">厨房烹饪</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=68" target="_blank">杯子茶具</a></li><li><a href="http://www.hxshop.com/productList/search.htm?categoryId=63" target="_blank">收纳清洁</a></li></ul>';
	**/
	
	
	
	top_html +=	'</div></div></div>';
	
	

	
	$('.top').html(top_html);
	
	/**
	$('.shopCar').hover(function(){
		$(this).addClass('shopCar2');
	},function(){
		$(this).removeClass('shopCar2');
	})	
	**/
	
	$('.wddd').hover(function(){
		$(this).addClass('wddd2');
	},function(){
		$(this).removeClass('wddd2');
	})	
	
	$('.sub_btn').hover(function(){
		$(this).css('backgroundColor','#ab1628');
	},function(){
		$(this).css('backgroundColor','#e83c50');	
	})
	
	
	
	
	if($.browser.mozilla) { 
		$('input[type=radio]').css('verticalAlign','middle');
		$('input[type=checkbox]').css('verticalAlign','middle');
	} 
	
	
	//当前页导航按钮高亮显示
	var topMenuNo = $('#topMenuNo').val() - 1;
	$('.nav_list>li:eq('+topMenuNo+')>a').addClass('menuHover').siblings().removeClass('menuHover');
	
	
	
	
		
})



	
        
       
            
                
                
            
        
       
            
            
            
            
        
        
       
       
            
            
            
            
            
            