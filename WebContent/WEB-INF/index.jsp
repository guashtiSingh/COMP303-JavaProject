<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css" > 
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script> 
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js" ></script> 

<title>Message board</title>
</head>

<body style="background-color: #A6DB85">	
	<div class="container-fluid">
	    <div class="col-md-12 column">
    		<div class="col-md-6 col-md-offset-3 column">
				<form method="POST" action="main">
					<h2 style="color: green">Centennial Message Board</h2>
					<fieldset class="form-group">
						<label style="color: green">Enter your username</label>
						<input type ="text" class="form-control" placeholder="username" name="Username" size="20"></p>		
					</fieldset>
					<fieldset class="form-group">
						<input type="submit" class="btn btn-default" value="Submit" name="B1">
					</fieldset>
				</form>
			</div>
		</div>
	</div>
</body>

</html>