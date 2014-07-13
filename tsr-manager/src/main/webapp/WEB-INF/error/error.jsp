<%@page import="org.apache.log4j.Logger"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<br>
<br>
<img align="top" style="display:block; margin:0 auto;" alt="" src="<%=request.getContextPath() %>/resource/images/exception.png" />

<%
Logger logger = Logger.getRootLogger();
Exception e = (Exception)request.getAttribute("exception");
logger.error(e.getMessage());
%>

<div align="center">
<font size="18"> I am an exception page!</font>
<br>
<br>
<br>
<%
out.println("Exception:"+e.getMessage());
%>
</div>
</body>
</html>