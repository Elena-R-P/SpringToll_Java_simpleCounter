<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>You have visited http://your_server <c:out value="${count}"/> times.</h2>
	<p><a href="/wipeout">Reset the counter</a></p>
	<p><a href="/plustwo">add 2</a></p>
</body>
</html>