<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>세션 메인</title><%-- 로그인 성공시 페이지 --%>
</head>
<body>
<h2>세션 메인 페이지</h2>
<%
	String id = (String)session.getAttribute("id");//꺼내올때는 다운캐스팅을 해서 꺼냄
	if(id == null){
		response.sendRedirect("loginForm.jsp");
	}
%>
<%=id %> 님 환영합니다.
<a href="logout.do">로그아웃</a>
</body>
</html>