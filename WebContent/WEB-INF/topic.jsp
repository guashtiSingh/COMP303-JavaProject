<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Centennial Message Board Topics</title>
</head>
<body>	

	<h1>Board ${board.boardID}: ${board.boardName}</h1>
	<hr>
	<h2>Topics:</h2>
	<ul>
		<c:forEach items="${availableTopics}" var="topic"> 
		    <li><a href="boards/${board.boardID}/topic/${topic.topicID}"> ${topic.topicName} </a></li>
		</c:forEach>
	</ul> 
	
</body>
</html>