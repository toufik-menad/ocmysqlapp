<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="MyAppStyle.css" rel="stylesheet">
<title>Insert title here</title>
</head>
<body>
<p> THIS IS A TEST for the page output</p>

<% String barcode=(String)request.getAttribute("barcode");%>
your choice: <%= barcode%>

<!--  <a href="/MyAppID"> my LINK</a>-->

<div>
<a href="<c:url value="/ViewControler" />">Enter a new product</a>
</div>


</body>
</html>