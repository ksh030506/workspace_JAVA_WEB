<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	String name, id, pw, phone1, phone2, phone3, gender;

	Connection connection;
	Statement stmt;
	ResultSet rs;
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	id = (String)session.getAttribute("id");

	String query = "select * from member where id = '" + id + "'";
	

		Class.forName("oracle.jdbc.driver.OracleDriver");
		connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "ksh030506", "000000");
		stmt = connection.createStatement();
		rs = stmt.executeQuery(query);
		
		while(rs.next()){
			name = rs.getString("name");
			pw = rs.getString("id");
			phone1 = rs.getString("phone1");
			phone2 = rs.getString("phone2");
			phone3 = rs.getString("phone3");
			gender = rs.getString("gender");
		}

%>

<form action="ModifyOk" method="post">
	이름 : <input type="text" name="name" size="10" value=<%=name%>><br/>
	아이디 : <%=id %><br/>
	비밀번호 : <input type="text" name="pw" size="10"><br/>
	전화번호 : <select name="phone1">
			<option value="010">010</option>
			<option value="016">016</option>
			<option value="017">017</option>
			<option value="018">018</option>
			<option value="019">019</option>
			<option value="011">011</option>
		</select> - 
		<input type="text" name="phone2" size="5" value=<%=phone2 %>> - <input type="text" name="phone3" size="5" value=<%=phone3 %>><br />
		<%
			if(gender.equals("man")) {
		%>
			성별 : <input type="radio" name="gender" value="man" checked="checked">남 &nbsp;<input type="radio" name="gender" value="woman">여
		<%
			} else {
		%>
			성별 : <input type="radio" name="gender" value="man">남 &nbsp;<input type="radio" name="gender" value="woman" checked="checked">여
		<%
			}
		%>
		<input type="submit" value="정보수정">  <input type="reset" value="초기화">
</form>
</body>
</html>