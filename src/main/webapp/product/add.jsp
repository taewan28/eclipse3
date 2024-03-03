<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="../assets/css/register.css">
</head>
<body>
	<div class="contents-wrap">
		<h3>상품 등록</h3>
		<hr>
		<form  method="post">
			<ul class="join-wrap">
				<li>상품 코드</li>
				<li><input name="pcode" type="text" placeholder="상품 코드를 입력해 주세요.(영문 최대 20글자)" /></li>
				<li>카테고리</li>
				<li><input name="category" type="text" placeholder="카테고리(영문 최대 2글자)" /></li>
				<li>상품명</li>
				<li><input name="pname" type="text" placeholder="상품명을 입력해 주세요." /></li>
				<li>가격</li>
				<li><input name="price" type="text" placeholder="가격을 입력하세요.(숫자 최대 9자리)" /></li>
			</ul>
			<button id="btn" type="button" class="join-btn">상품 등록</button>
		</form>
	</div>
	<script src="${pageContext.request.contextPath}/assets/js/script.js"></script>
</body>
</html>