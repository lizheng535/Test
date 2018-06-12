<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/qrcode.js"></script>
</head>
<body>
 <!-- 二维码显示位置 -->
  <div id="code" style="width:100px; height:100px; margin-top:15px;"></div>
</body>
<script type="text/javascript">
   /* //定义一个空白的二维码
   var p=prcode(5,"H");
   //将放入数据添加
   p.addData("hahahaha!!!");
   //生成二维码
   p.make();
   //放入div中
   $("#code").html(p.createImgTag()); */
  /*  var qrcode = new QRCode(document.getElementById("code"), {
	    width : 200,
	    height : 200,
	    useSVG: false
	});

	qrcode.makeCode("https://www.baidu.com"); */
	var qr = new QRCode(10,"H");
	qr.addData("http://www.baidu.cn");
	
	qr.make();
	$("#code").html(qr.createImgTag());
</script>
</html>