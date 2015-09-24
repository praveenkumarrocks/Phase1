<!DOCTYPE HTML>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form  name="f" th:action="@{/login}" method="get">
<h2>${title}</h2>	
<h2>${message}</h2>	
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
<input type="submit" id="submitButton" value="Login"></input>
</div>
</form>
</body>
</html>