<%@page import="java.util.Arrays"%>
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
	int i = 10;
 	String str = "ABCDEF";
%>

<%!
	public int sum(int a, int b){
	return a+b;
}
%>

<%=i %><br/>
<%=str %><br/>
<%=sum(1,5) %><br/>

<%
	int[] iArr = {10, 20, 30};
	out.println(Arrays.toString(iArr));
%>

<%@ include file="helloworld.jsp" %>


</body>
</html>