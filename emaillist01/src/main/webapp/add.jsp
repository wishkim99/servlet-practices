<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.poscoict.emaillist.vo.EmaillistVo"%>
<%@page import="com.poscoict.emaillist.dao.EmaillistDao"%>
<%
	String firstName=request.getParameter("fn");
	String lastName=request.getParameter("ln");
	String email=request.getParameter("email");
	
	EmaillistVo vo=new EmaillistVo();
	vo.setFirstName(firstName);
	vo.setLastName(lastName);
	vo.setEmail(email);
	
	boolean result= new EmaillistDao().insert(vo);
	System.out.println(result ? "success": "fail");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>잘 들어갔습니다</h1>
</body>
</html>