<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%!
	Connection conn = null;
	Statement stmt = null;
	ResultSet rs = null;
	PreparedStatement preparedStatement;
	
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String uid = "ksh030506";
	String upw = "000000";
	String query = "select * from member";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>insert</title>
</head>
<body>
<%
	try {
		Class.forName(driver);
		conn = DriverManager.getConnection(url, uid, upw);
		int n;
		String sql = "insert into member(name, id, pw, phone1, phone2, phone3, gender) values(?, ?, ?, ?, ?, ?, ?)";
 		preparedStatement = conn.prepareStatement(sql);
 		
 		preparedStatement.setString(1, "김상현");
 		preparedStatement.setString(2, "1234");
 		preparedStatement.setString(3, "1234");
 		preparedStatement.setString(4, "010");
 		preparedStatement.setString(5, "1234");
 		preparedStatement.setString(6, "5678");
 		preparedStatement.setString(7, "man");
 		n = preparedStatement.executeUpdate();
 		
 		if(n == 1)  {
 			out.println("성공");
 		} else if (n == -1) {
 			out.println("아이디 중복");
 		} else {
 			out.println("실패");
 		}
 		
	} catch(Exception e){
		out.println(e.getMessage());
	} finally {
		try {
			if(rs != null) rs.close();
			if(preparedStatement != null) preparedStatement.close();
			if(conn != null) conn.close();
		} catch(Exception e2){
			out.println(e2.getMessage());
		}
	}
%>
<a href="memberSelect.jsp">회원 정보 보러가기</a>


</body>
</html>