<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
	String id, pw;
%>

<%
	id = request.getParameter("id");
	pw = request.getParameter("pw");
	
	if(id.equals("ksh") && pw.equals("1234")){
		Cookie cookieid = new Cookie(request.getParameter("id"), id);
		cookieid.setMaxAge(60);
		response.addCookie(cookieid);
		response.sendRedirect("welcome.jsp");
	} else {
		response.sendRedirect("login.html");
	}
%>

</body>
</html>