<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" > 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script> 
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" ></script> 

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
<body style="background-color: #A6DB85">
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand">Centennial Message Board</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li role="presentation"><a href="http://localhost:8080/SpringMVCProject/">Home</a></li> 
					<li role="presentation"><a href="http://localhost:8080/SpringMVCProject/main">Topic List</a></li>
					<li role="presentation"><a href="http://localhost:8080/SpringMVCProject/">Sign Out</a></li>
				</ul>
			</div>
		</div>
	</nav>

	<div class="container">
		<div class="page-header">
			<h1 style="color: green">Board ${board.boardID}: ${board.boardName}</h1>
		</div>
	</div>
		
	<div class="container">
		<h2 style="color: green">Topics:</h2>
		<ul class="list-group">
			<c:forEach items="${availableTopics}" var="topic">
				<li class="list-group-item"><a href="${board.boardID}/topic/${topic.topicID}">${topic.topicName}</a></li>
			</c:forEach>
		</ul>
	</div>
		
	<div class="container">
		<form method="POST" id="topicForm">
			<h2 style="color: green">Create a Topic</h2>
				<fieldset class="form-group">
					<input type="text" class="form-control" name="name" placeholder="Topic name"><br>
					<input type="submit" class="btn btn-default" value="Create">	
				</fieldset>
		</form>
	</div>
</body>
</html>