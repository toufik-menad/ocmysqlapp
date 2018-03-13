<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="MyAppStyle.css" media="screen" />
<title>Insert title here</title>
</head>
<body>

<P>This is a test for the page input</P>

 
<form method="post" action="${pageContext.request.contextPath}/ViewControler">
	Type your Bar code: <input type="text" name="barcode"><br>
	<input type="submit" value="Submit">
</form>




</body>
</html>