<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	Cookie[] cookies = request.getCookies();
	if(cookies != null) {
		for(int i = 0; i < cookies.length; i++){
			if(cookies[i].getValue().equals("ksh")) {
				cookies[i].setMaxAge(0);
				response.addCookie(cookies[i]);
			}
		}
	}
%>

<a href="cookie_test.jsp">쿠키가 삭제됬는지 확인하러 가기</a>
<a href="login.html">로그인하기</a>

</body>
</html>