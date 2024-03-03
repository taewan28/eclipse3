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
</body>
</html>