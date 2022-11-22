<%@page contentType="text/html; charset=UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>글 목록</title>
<link rel ="stylesheet" href="/css/board.css"/>
</head>
<body>
<div id="wrapper">
	<div id="title">
		<h1>게시글 목록</h1>
	</div>
	<div id="content">
		<table>
			<colgroup>
				<col width="50">
				<col width="400">
				<col width="150">
				<col width="150">
				<col width="100">
			</colgroup>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>등록일</th>
				<th>조회수</th>
			</tr>
			<c:forEach var="board" items="${boardList}">
			<tr>
				<td class="alignLeft">${board.seq}</td>
				<td class="alignLeft"><a href="/board/getBoard?seq=${board.seq}">${board.title}</a></td>
				<td class="alignLeft">${board.writer}</td>
				<td class="alignLeft"><fmt:formatDate value="${board.createDate}" pattern="yyyy-MM-dd"></fmt:formatDate></td>
				<td class="alignLeft">${board.cnt}</td>
			</tr>
			</c:forEach>
		</table>
	</div>
		<div class="aLink">
			<a class="alignCenter" href="/board/insertBoard">새글 등록</a>
		</div>
</div>
</body>
</html>