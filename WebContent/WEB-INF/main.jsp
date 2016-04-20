<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" > 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script> 
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" ></script> 

<title>Board List</title>
</head>

<body style="background-color: #A6DB85">
	<nav class="navbar navbar-default">
		<div class="container">
			<div class="navbar-header">
				<a class="navbar-brand">Centennial Message Board</a>
			</div>
			<div class="collapse navbar-collapse">
				<ul class="nav navbar-nav">
					<li role="presentation"><a><strong>Home</strong></a></li> 
					<li role="presentation"><a href="http://localhost:8080/SpringMVCProject/">Sign Out</a></li>
				</ul>
			</div>
		</div>
	</nav>
	
	<div class="container">
		<div class="page-header">
			<h1 style="color: green">Welcome, ${user.username}!</h1>
			<h4 style="color: green">Select a board to view the topics</h4>
		</div>
		<ul class="list-group">
			<c:forEach items="${availableBoards}" var="board"> 
			    <li class="list-group-item"><a href="boards/${board.boardID}"> ${board.boardName} </a></li>
			</c:forEach>
		</ul>
	</div>
</body>
</html>