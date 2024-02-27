<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	ul{
		list-style:none; padding: 20px; display: flex;
		border-bottom: 3px solid gray;
	}
	
	li{
		padding: 20px;
	}
	
	a{
		text-decoration: none;
	}
</style>
</head>
<body>
	<ul>
		<!-- contextPath를 포함시키는 절대경로로 합니다.	: header.jsp를 포함하는 jsp의 폴더와 상관없게 합니다
			모든 디렉토리 위치의 url 에서 404 없이 사용할 수 있습니다.  
		 -->
	
		<li><h4><a href="<%=request.getContextPath() %>">HOME</a></h4></li>
		<li><a href="${pageContext.request.contextPath }/member/join">회원가입</a></li>
		<li><a href="${pageContext.request.contextPath }/member/modify">회원정보  수정</a></li>
		<li><a href="${pageContext.request.contextPath }/product/list">상품 목록</a></li>
		<li><a href="${pageContext.request.contextPath }/community/list">커뮤니티(게시판)</a></li>
		<li><a href="${pageContext.request.contextPath }/community/write">커뮤니티 글쓰기</a></li>
		<li><a href="${pageContext.request.contextPath }/mypage">마이페이지</a></li>
		<li><a href="${pageContext.request.contextPath }/cart">장바구니</a></li>
		<li><a href="${pageContext.request.contextPath }/Login">로그인</a></li>
		<li class="profile">
			<img alt="프로필" src="${pageContext.request.contextPath }/assets/images/images.png"> 
		</li>
	</ul>
</body>
</html>
