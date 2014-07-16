$(function(){
	var helpLeftHtml = '';
	helpLeftHtml += '<div class="helpTop"></div><div class="helpBody"><ul>';	
	helpLeftHtml += '<li><div class="helpMenu1"></div><ul><li><a href="帮助中心新手指南.html#1_1">注册新用户</a></li><li><a href="帮助中心新手指南.html#1_2">购物流程</a></li><li><a href="帮助中心新手指南.html#1_3">付款方式</a></li><li><a href="帮助中心新手指南.html#1_4">常见问题</a></li></ul></li>';	
	helpLeftHtml += '<li><div class="helpMenu2"></div><ul><li><a href="帮助中心配送服务.html#2_1">商品验货与签收</a></li><li><a href="帮助中心配送服务.html#2_2">配送范围及运费</a></li></ul></li>';	
	helpLeftHtml += '<li><div class="helpMenu3"></div><ul><li><a href="帮助中心售后服务.html#3_1">7天无理由退换货</a></li><li><a href="帮助中心售后服务.html#3_2">退款说明</a></li><li><a href="帮助中心售后服务.html#3_3">第三方订单售后服务</a></li></ul></li>';	
	helpLeftHtml += '<li><div class="helpMenu4"></div><ul><li><a href="帮助中心自助服务.html#4_1">取消订单</a></li><li><a href="帮助中心自助服务.html#4_2">退换货申请</a></li><li><a href="帮助中心自助服务.html#4_3">在线投诉</a></li><li><a href="帮助中心自助服务.html#4_4">绑定手机/邮箱</a></li><li><a href="帮助中心自助服务.html#4_5">联系我们</a></li></ul></li>';	
	helpLeftHtml += '<li><div class="helpMenu5"></div><ul><li><a href="帮助中心购物保障.html#5_1">关于我们</a></li><li><a href="帮助中心购物保障.html#5_6">24小时发货</a></li><li><a href="帮助中心购物保障.html#5_2">正品保证</a></li><li><a href="帮助中心购物保障.html#5_3">注册协议</a></li><li><a href="帮助中心购物保障.html#5_4">隐私保护</a></li><li><a href="帮助中心购物保障.html#5_5">免责声明</a></li></ul></li>';	
	helpLeftHtml += '</ul> </div><div class="helpBottom"></div>';	
	
	$('.helpLeftMenu').html(helpLeftHtml);
	
	//高亮显示
	var helpIndex = $('#helpLeftNo').val();
	
	$('.helpBody>ul>li:eq('+ (helpIndex-1) +')>ul>li>a').addClass('hit'+helpIndex);
	
	
	/**
	$(window).scroll(function(){
		leftScroll();	
	})
	
	
	function leftScroll(){
		if($(window).scrollTop() >= 160){
			$('.helpLeftMenu').css({'position':'fixed','top':'0px'});
		}else if($(window).scrollTop() < 160){
			$('.helpLeftMenu').css({'position':'relative'});
		}
	}
	**/
	
	
	
})





            
            	
                	
                    
                    
                    
                    
                
           
            