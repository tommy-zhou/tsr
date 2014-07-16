(function($) {         
  $.fn.scrollFix = function(options) {        
    var opts = $.extend({}, $.fn.scrollFix.defaults, options);         
    return this.each(function(){
        $this=$(this);
        var leftPx;
        var topPx;
        if(opts.relativeLeftId)
        {
             leftPx=document.getElementById(opts.relativeLeftId).offsetLeft+opts.templeftPx;    
        }else{leftPx=opts.templeftPx;}
        if(opts.relativeTopId)
        {
             topPx=document.getElementById(opts.relativeTopId).offsetTop+$("#"+opts.relativeTopId).outerHeight()+opts.tempTopPx;    
        }else{topPx=opts.tempTopPx;}        
        $this.css("left",leftPx);
        $this.css("top",topPx); 
        window.onscroll = function()
        {
            var $scrollTop = $(window).scrollTop();
            if(jQuery.browser.msie&&jQuery.browser.version==6)
            {
                if($scrollTop>topPx && $scrollTop<topPx+opts.maxTempHeight)
                {
                    $this.css("top",document.documentElement.scrollTop);
                }else
                    {
                        $this.css("top",topPx);
                    }
            }else
                {
                    if($scrollTop>topPx && $scrollTop<topPx+opts.maxTempHeight)
                    { 
                         $this.css("top","");
                         $this.addClass(opts.fixedClass);
                    }
                     else{
                            if($this.hasClass(opts.fixedClass))
                            {
                                $this.css("top",topPx);
                                 $this.removeClass(opts.fixedClass).addClass(opts.ie6Class);
                            }
                         }
                
                }
        }        
    }); 
  };     
  $.fn.scrollFix.defaults = {     
        relativeLeftId:'',//必填,X参照物ID
        relativeTopId:'',//必填,Y参照物ID
        templeftPx:0,//相对X偏移位置
        tempTopPx:0,//相对Y偏移位置
        maxTempHeight:13000,//滚动最大高度值
        fixedClass:'fixedTop',//必填，固定样式
        ie6Class:'userPanel'//必填,ie6处理原始样式
  };         
})(jQuery);