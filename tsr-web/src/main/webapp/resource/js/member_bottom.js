// JavaScript Document
$(function(){
	var bottom_html = '';
	bottom_html += '<div class="bottomline"></div>';
	bottom_html += '<div class="bottomInfo">';
	bottom_html += '<div style="margin-top:16px;"><a href="">关于我们</a><span class="fen"><img src="static/img/fen.jpg" /></span><a href="">品牌招商</a><span class="fen"><img src="static/img/fen.jpg" /></span><a href="">网站地图</a><span class="fen"><img src="static/img/fen.jpg" /></span><a href="">联系我们</a></div>';
	bottom_html += '<div style="margin-top:16px;">Copyright © 2008-2013 hxshop.com , All Rights Reserved 沪ICP备13024601号-1 使用本网站即表示接受家品会用户协议</div>';
	bottom_html += '<div style="margin:6px 0 22px;">上海红星美凯龙家品会电子商务有限公司版权所有</div>';
	bottom_html += '</div>';
		
	$('.memberBottom').html(bottom_html);
        
})