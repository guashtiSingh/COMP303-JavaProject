<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Centennial Message Board Topics</title>

<script type="text/javascript">
	var myForm = $('#topicForm');
	myForm.submit(function submit(ev) {
		$.ajax({
			type : 'POST',
			data : myForm.serialize(),
			success : function(data) {
				//do something
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
		<a href="http://localhost:8088/SpringMVCProject/main">Home</a> | <strong>Topic
			List</strong>
	</div>
	<h1>Board ${board.boardID}: ${board.boardName}</h1>
	<hr>
	<h2>Topics:</h2>
	<ul>
		<c:forEach items="${availableTopics}" var="topic">
			<li><a href="${board.boardID}/topic/${topic.topicID}">${topic.topicName}</a></li>
		</c:forEach>
	</ul>
	<hr>
	<h2>Create a topic:</h2>
	<form method="POST" id="topicForm">
		<input type="text" name="name" placeholder="topic name"><br>
		<input type="submit" value="Create">
	</form>

</body>
</html>