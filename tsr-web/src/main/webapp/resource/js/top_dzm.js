// JavaScript Document
$(function(){
	var top_html = '';
	top_html +=	'<div class="header">';
	top_html +=	'<div class="head_wrap" >';
	top_html +=	'<a href="index.html" target="_self" class="logo"><img src="static/img/logo.png" alt="红星家品会 - 品牌家具特卖网" /></a>';
	top_html +=	' <div class="search">';
	top_html +=	'<form action="" method=""><input type="text" class="txt_name" value="热门搜索：现代沙发  双人床  儿童床  实木餐桌" /><input type="button"  class="sub_btn" value="" onclick="location.href=\'商品列表页.html\'" /></form></div>';
	top_html +=	' <iframe src="iframe1_dzm.html" frameborder="no" style="width:800px;height:15px;float: right; margin-right: 10px;margin-top: 12px;position: absolute;right: 0;">导入错误！</iframe>';
	top_html +=	'<span class="phone"><img src="static/img/phone.png" alt="客服热线：400-688-9333" /></span><iframe style="width:106px;height:30px;position: absolute;right: 49px;top: 68px;" frameborder="no" src="iframe2_dzm.html">导入错误</iframe> <span id="s_city" class="city">上海站</span>';
	top_html +=	'<div id="d_city" class="citys">';
	top_html +=	'<h5>华北东北:</h5><ul><li>北京</li><li>天津</li><li>沈阳</li><li>大连</li><li>长春</li><li>哈尔滨</li><li>石家庄</li><li>太原</li><li>呼和浩特</li><li>廊坊</li></ul>';
	top_html +=	'<h5>华东东北:</h5><ul><li>上海</li><li>杭州</li><li>南京</li><li>苏州</li><li>无锡</li><li>济南</li><li>厦门</li><li>宁波</li><li>福州</li><li>青岛</li><li>合肥</li><li>常州</li><li>扬州</li><li>温州</li><li>绍兴</li><li>嘉兴</li><li>烟台</li><li>威海</li>\<li>镇江</li><li>南通</li><li>金华</li><li>徐州</li><li>潍坊</li><li>淄博</li><li>临沂</li><li>马鞍山</li><li>台州</li><li>泰州</li><li>济宁</li><li>泰安</li></ul>';
	top_html +=	'<h5>中部西部:</h5><ul><li>成都</li><li>武汉</li><li>郑州</li><li>长沙</li><li>南昌</li><li>贵阳</li><li>西宁</li><li>重庆</li><li>西安</li><li>昆明</li><li>兰州</li><li>乌鲁木齐</li><li>银川</li></ul>';
	top_html +=	'<h5>华南地区:</h5><ul><li>广州</li><li>深圳</li><li>香港</li><li>佛山</li><li>珠海</li><li>东莞</li><li>三亚</li><li>海口</li><li>澳门</li><li>南宁</li><li>惠州</li></ul>';
	top_html +=	'<a href="#" target="_blank">更多城市</a></div></div></div>';
	
	
	top_html +=	'<div class="nav"><div class="nav_wrap"><span id="s_all_cate" class="all_cate">全部商品分类<i></i></span>';
	top_html +=	' <ul class="nav_list"><li><a href="index.html"> 首页</a></li><li><a href="品牌专区.html">品牌专区</a></li><li><a href="品牌特卖.html">品牌特卖</a></li><li><a href="#">最后疯抢</a></li><li><a href="#">情景展示</a></li><li><a href="#">设计师说</a></li></ul>';
	top_html +=	'<div id="d_cate_wrap" class="cate_wrap">';
	top_html +=	'<h5 class="cate1">家具</h5><ul><li><a href="#" target="_blank">床</a></li><li><a href="#" target="_blank">衣柜</a></li><li><a href="#" target="_blank">儿童家具</a></li><li><a href="#" target="_blank">餐桌</a></li><li><a href="#" target="_blank">床垫</a></li><li><a href="#" target="_blank">电脑桌</a></li><li><a href="#" target="_blank">椅子</a></li><li><a href="#" target="_blank">书桌</a></li><li><a href="#" target="_blank">沙发</a></li></ul>';
	top_html +=	'<h5 class="cate2">建材</h5><ul><li><a href="#" target="_blank">卫浴</a></li><li><a href="#" target="_blank">净水</a></li><li><a href="#" target="_blank">开关</a></li><li><a href="#" target="_blank">涂料</a></li><li><a href="#" target="_blank">水槽</a></li><li><a href="#" target="_blank">厨电</a></li><li><a href="#" target="_blank">五金</a></li><li><a href="#" target="_blank">墙纸</a></li><li><a href="#" target="_blank">门窗</a></li></ul>';
	top_html +=	'<h5 class="cate3">家居</h5><ul><li><a href="#" target="_blank">晾晒</a></li><li><a href="#" target="_blank">枕头/枕芯</a></li><li><a href="#" target="_blank">床品套件</a></li><li><a href="#" target="_blank">台灯</a></li><li><a href="#" target="_blank">窗帘/窗纱</a></li><li><a href="#" target="_blank">精品被芯</a></li><li><a href="#" target="_blank">餐厨</a></li><li><a href="#" target="_blank">地毯/地垫</a></li><li><a href="#" target="_blank">净化</a></li></ul>';
	top_html +=	'<h5 class="last">热门推荐</h5><ul><li><a href="#" target="_blank">吊灯</a></li><li><a href="#" target="_blank">吸顶灯</a></li><li><a href="#" target="_blank">奥朵</a></li><li><a href="#" target="_blank" class="jia">+分类热销排行</a></li><li><a href="#" target="_blank" class="jia">+品牌热销排行</a></li></ul>';
	top_html +=	'</div></div></div>';
	
	

	
	$('.top').html(top_html);
		
})



	
        
       
            
                
                
            
        
       
            
            
            
            
        
        
       
       
            
            
            
            
            
            