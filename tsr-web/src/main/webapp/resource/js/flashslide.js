	
	var swf_width=290
	var swf_height=200
	var config='5|0xffffff|0x8D7A7C|80|0x000000|0xFA8100|0x000000'
	// �Զ�����ʱ��(��)|������ɫ|���ֱ���ɫ|���ֱ���͸����|��������ɫ|��ǰ����ɫ|��ͨ����ɫ
	var files = '';
	var links = '';
	var texts = '';
	var xsImg = document.getElementById("slidedata");
	var j = 0;var k = 0;
	for(var i in xsImg.childNodes) {
		var a = xsImg.childNodes[i];
		if(a.title) {
			if(a.title == 'img') {
				if(files != '') files += '|';
				files += a.innerHTML;
			} else if(a.title == 'link') {
				if(links != '') links += '|';
				links += a.innerHTML;
			} else if(a.title == 'subject') {
				if(texts != '') texts += '|';
				texts += a.innerHTML;
			}
			j++;
			if(j == 3) {
				j = 0;
				k++;
			}
		}
	}
	var content = '';
	content += '<object classid="clsid:D27CDB6E-AE6D-11CF-96B8-444553540000" codebase="http://fpdownload.macromedia.com/pub/shockwave/cabs/flash/swflash.cab#version=9,0,0,0" width="' + swf_width + '" height="' + swf_height + '">';
	content += '<param name="movie" value="static/img/flash/flashslide.swf" />';
	content += '<param name="quality" value="high" />';
	content += '<param name="menu" value="false" />';
	content += '<param name=wmode value="opaque" />';
	content += '<param name="FlashVars" value="config='+config+'&bcastr_flie='+files+'&bcastr_link='+links+'&bcastr_title='+texts+'" />';
	content += '<embed src="http://www.51nb.com/templates/newsoftsea/images/flashslide.swf" wmode="opaque" FlashVars="config='+config+'&bcastr_flie='+files+'&bcastr_link='+links+'&bcastr_title='+texts+'& menu="false" quality="high" width="'+ swf_width +'" height="'+ swf_height +'" type="application/x-shockwave-flash" pluginspage="http://www.macromedia.com/go/getflashplayer" />';
	content += '</object>';
	document.getElementById("slidecontent").innerHTML = content;
