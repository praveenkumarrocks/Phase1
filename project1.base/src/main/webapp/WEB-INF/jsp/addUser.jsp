<!DOCTYPE HTML>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form th:action="@{/addUser}" method="POST">
<h3>
	Enter user details and click Submit
</h3>
<div>
<span>
<label for="userName" style="width:100px">User Name</label>
<input type="text" id="userName" name="userName" style="width:100px" ></input>
</span>
</div>
<br>
<div>
<span>
<label for="password" style="width:100px">Password</label>
<input type="password" id="password" name="password" style="width:100px" ></input>
</span>
</div>
<div>
<br>
</div>
<div>
<input type="submit" id="submitButton" value="Save User"></input>
</div>
</form>
</body>
</html>