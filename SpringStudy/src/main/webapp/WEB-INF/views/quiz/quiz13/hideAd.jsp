<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	.hidden {
		display:none;
	}
</style>
</head>
<body>
	<h1>hideAd</h1>
	
	<c:if test="${hide == null}">
		<div id="adArea">
			<p>---------------------------------------</p>
			<form action="" method="post" id="adForm">
				<h3>광고내용</h3>
				<label><input type="checkbox" name="hide" value="true" id="chk_hide">24시간 숨기기</label>
				<button id="hideBtn" type="submit">닫기</button>
			</form>
			<p>---------------------------------------</p>
		</div>
	</c:if>
	
	<script>
		
		const adForm = document.getElementById('adForm');
		const chkHide = document.getElementById('chk_hide');
		const adArea = document.getElementById('adArea');
		
		adForm.addEventListener('submit', (e)=>{
			e.preventDefault();	//기본 전송 중지
			
			//체크박스 O -> form 요청 -> 서버로 post -> 서버에서 쿠키 생성
			//체크박스 X -> 화면에서 css, js 로 자체적으로 안보이도록 처리 -> display:none; 방식
			
			if(chkHide.checked){  //check O
				adForm.submit();
			} else {  //check X
				adArea.classList.add('hidden');
			}
		})
	
	</script>

	<p>hideAd 페이지 본문 내용</p>
	
</body>
</html>