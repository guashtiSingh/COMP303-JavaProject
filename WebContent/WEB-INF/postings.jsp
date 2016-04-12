<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Centennial Message Board Postings</title>

<script type="text/javascript">
	var myForm = $('#messageForm');
	myForm.submit(function submit(ev) {
		$.ajax({
			type : 'POST',
			data : myForm.serialize(),
			success : function(data) {
				// do something
			},
			error : function(data) {
				alert('failure!');
			}
		});
		ev.preventDefault();
	});
</script>
</head>
<body>
	<div class="navigation">
		<a href="http://localhost:8088/SpringMVCProject/main">Home</a> | <a
			href="http://localhost:8088/SpringMVCProject/boards/${board.boardID}">Topic
			List</a>
	</div>
	<h1>Board ${board.boardID}: ${board.boardName}</h1>
	<h2>Topic ${topic.topicID}: ${topic.topicName}</h2>
	<hr>
	<h2>Postings:</h2>
	<ul>
		<c:forEach items="${availablePostings}" var="posting">
			<li>${posting}</li>
		</c:forEach>
	</ul>
	<hr>
	<h2>Post a message:</h2>
	<form method="POST" id="messageForm">
		<textarea name="message" cols="30" , rows="10"></textarea>
		<br> <input type="submit" value="Post">
	</form>
</body>
</html>