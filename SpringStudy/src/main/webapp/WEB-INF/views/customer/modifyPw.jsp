<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>사용자 비밀번호 변경</h1>
	
	<form action="" method="post">
		<input type="hidden" name="id" value="${user.id}">
		<%-- <p>사용자 이름 : <input type="text" name="name" value="${user.name}" disabled></p> --%>
		<p>사용자 이름 : <input type="text" name="name" value="${user.name}" readonly></p>
		<input type="hidden" name="userType" value="${user.userType}">
		<p>변경할 비밀번호 : <input name="pw" type="password"></p>
		<p><button type="submit">비밀번호 변경하기</button></p>
	</form>
	
	<button onclick="location.href='/customer/mypage'">마이페이지로 돌아가기</button>
</body>
</html>