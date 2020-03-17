<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:forward page="forword.jsp">
	<jsp:param value="abc" name="id"/>
	<jsp:param value="1234" name="pw"/>
</jsp:forward>

</body>
</html>