
	function alertInfo(method,info){
		$('.alertInfo_wrong').remove();
		$('.alertInfo_corrent').remove();
		
		
		
	
		
		if(method == 1){
			$('body').prepend('<div class="alertInfo_corrent" style="position:fixed; width:1000px; height:20px; z-index:100; margin-top:0; display:none;"><div style="text-align:right;cursor:pointer; float:right;" class="infoClose"><img src="static/img/close.png" style="display:inline;"></div><div>'+info+'</div></div>');
			$('.alertInfo_corrent').slideDown('fast');
		}else if(method == 0){
			$('body').prepend('<div class="alertInfo_wrong" style="position:fixed; width:1000px; height:20px; z-index:100; margin-top:0; display:none;"><div style="text-align:right;cursor:pointer; float:right;" class="infoClose"><img src="static/img/close.png" style="display:inline;"></div><div>'+info+'</div></div>');
			$('.alertInfo_wrong').slideDown('fast');
		}
		
		$('.infoClose').live('click',function(){
			$(this).parent().remove();	
		})
		
		$('.alertInfo_corrent').css('marginLeft',($(window).width()- 1000 )/ 2+'px');
		$('.alertInfo_wrong').css('marginLeft',($(window).width()- 1000 )/ 2+'px');
		
		
		
		setTimeout(function(){$('.alertInfo_corrent').remove();$('.alertInfo_wrong').remove();},3000)
		
		
		
	}
	

	
