<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>main</h1>
	
	<div>
	
		<c:if test="${loginUserId == null}">
			<button onclick="location.href='/customer/signup'">회원가입 하기</button>
			<br>
			<button onclick="location.href='/customer/signin'">로그인</button>
		</c:if>
		
		<c:if test="${loginUserId != null}">
			<p>${loginUserId} 님 환영합니다.</p>
			<button onclick="location.href='/customer/mypage'">마이페이지</button>
			<button onclick="location.href='/customer/signout'">로그아웃</button>
		</c:if>
	</div>
</body>
</html>