<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import = "java.util.List" %>
<%@ page import = "com.example.sbs.demo.dto.Article" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>게시물 목록</h1>
	
	<% 
		List<Article> article = (List<Article>)request.getAttribute("article");
		for(Article a : article){
	%>
		ID : <%= a.getId() %><br>
		BoardId : <%= a.getBoardId() %><br>
		MemberId : <%= a.getMemberId() %><br>
		Title : <%= a.getTitle() %><br>
		Body : <%= a.getBody() %><br>
		hit : <%= a.getHit() %><br>
		<hr>
	<%
		}
	%>
</body>
</html>