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
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/project.css">
</head>
<body>
	<h2>상품 전체 목록</h2>
	<div class="search">
		<form action="">
		<select name="category" id="catee">
			<option value="">카테고리 선택</option>
			<c:forEach items="${cateList }" var="cate">
				<option value="${cate.code}"><c:out value="${cate.name }" /></option>
			</c:forEach>
		</select>
		<input type="text" name="keyword" placeholder="상품명 검색어 입력하세요." value="${keyword }">
		<span style="padding-left: 10px;">가격대별</span>
		<input type="text" name="from" placeholder="10000"><b>~</b>
		<input type="text" name="to" placeholder="50000">
		<button id="search" type="submit">조회</button>
		<button id="selectAll" type="button" onclick="location.href='list'">전체보기</button>
		</form>
	</div>
	<hr>
	<ul>
		<c:forEach items="${productList }" var="vo" varStatus="status">
			<li>
				<ul class="row">
					<li><c:out value="${status.index+1 }" /></li>
					<li><c:out value="${fn:toUpperCase(vo.pcode) }" /></li>
					<li><c:out value="${vo.category }" /></li>
					<li><c:out value="${vo.pname }" /></li>
					<li><c:out value="${vo.price }" /></li>
				</ul>
			</li>

		</c:forEach>
	</ul>
	<script type="text/javascript">
		const temp = '${cate}'
	</script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/search.js"></script>
</body>
</html>