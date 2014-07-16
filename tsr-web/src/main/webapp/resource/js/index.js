$(document).ready(function() {
    //首页轮播
	$(function(){
	 $('#slides1>li:first').css('zIndex','1').show();	
		
     var len  = $('#slides1').find('li').length;
	 var slideInterval;
	 var slideIntervalTime = 3000;
	 var index = 0;
	 var adTimer;
	 
	 slideInterval = setInterval(slideShow,slideIntervalTime);
	 
	 $("#page1>a").mouseover(function(){
		index  =   $("#page1>a").index(this);
		clearInterval(slideInterval);
		showImg(index);
	 })
	  
	 function slideShow(){
		if(index == len - 1){
			index = 0;	
		}else{
			index ++;
		}	
		showImg(index);		
	}
	 
	 
	 $('#slides1>li>a>img').live('mouseover',function(){
		clearInterval(slideInterval);
	}).live('mouseleave',function(){
		currentImgIndex = $(this).parent().parent().index();
		slideInterval = setInterval(slideShow,slideIntervalTime);	
	})
	
	 
})

function showImg(index){
       $("#page1>a").removeClass("selected").eq(index).addClass("selected");
		$('#slides1 li').stop(true,true).fadeOut(800).css('zIndex','0');
		$('#slides1>li:eq('+ index +')').css('zIndex','1').fadeIn(800);
}
	
	
	
	
})