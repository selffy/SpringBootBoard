<%@page contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>새글등록</title>
<link rel ="stylesheet" href="/css/board.css"/>
</head>
<body>
<div id="wrapper">
	<div id="title">
		<h3>새 글 등록하기</h3>
	</div>
	<div id="content" class="insertBoard">
		<form action="/board/insertBoardProc" method="post">
			<table>
			<colgroup>
				<col width="70">
				<col width="400">
				<col width="150">
				<col width="150">
				<col width="100">
			</colgroup>
				<tr>
					<td>제목</td><td align="left">
					<input type="text" name="title"/></td>
				</tr>
				<tr>
					<td>작성자</td><td align="left">
					<input type="text" name="writer" size="10"/></td>
				</tr>
				<tr>
					<td>내용</td><td class="alignLeft">
					<textarea name="content" cols="40" rows="10"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" class="alingCenter">
					<input value="목록" type="button" onclick="event.preventDefault(); location.href='/board/listBoard';"></td>
					<input type="submit" value=" 새글 등록 "/>
				</tr>
			</table>
		</form>
	</div>
	
</div>
</body>
</html>