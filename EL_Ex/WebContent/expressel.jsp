<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="member" class="com.javalec.ex.member" scope="page" />
<jsp:setProperty name="member" property="name" value="홍길동" />
<jsp:setProperty name="member" property="id" value="aaa" />
<jsp:setProperty name="member" property="pw" value="1234" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	이름 : <jsp:getProperty name="member" property="name" /><br/>
	아이디 : <jsp:getProperty name="member" property="id" /><br/>
	비밀번호 : <jsp:getProperty name="member" property="pw" /><br/>
	
	<hr>
	<hr>
	
	이름 : ${member.name }<br/>
	아이디 : ${member.id }<br/>
	비밀번호 : ${member.pw }<br/>
	

</body>
</html>