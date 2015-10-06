<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE HTML>
<html xmlns:th="http://www.thymeleaf.org" xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
<head>
<title>Login Page</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script type="application/x-javascript" src="js/jquery-1.11.0.min.js"></script>
<!-- Custom Theme files -->
<link href="css/style.css" rel='stylesheet' type='text/css' />
<!-- Custom Theme files -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- Google Fonts -->
<link href='http://fonts.googleapis.com/css?family=Doppio+One' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Raleway:100,200,300,400,500,600,700,800,900' rel='stylesheet' type='text/css'>
<link href='http://fonts.googleapis.com/css?family=Oswald:400,700' rel='stylesheet' type='text/css'>
<script src="js/jquery.etalage.min.js"></script>
<link href="css/component.css" rel='stylesheet' type='text/css' />
<!-- Include the Etalage files -->
<!----//details-product-slider--->
<script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
	<script type="application/x-javascript">
		$(document).ready(function () {
			$('#horizontalTab').easyResponsiveTabs({
				type: 'default', //Types: default, vertical, accordion           
			    width: 'auto', //auto or any width like 600px
			    fit: true   // 100% fit in a container
			});
		});
	</script>	
</head>
<body>
	<div class="new-product prodys">
		<sec:authorize access="isAnonymous()">
			<div class="account_grid">
			   <div id="loginDiv" class="col-md-6 login-right">
			  	<h3>LOGIN</h3>
				<form th:action="@{/login}" method="post" name="loginform">
				  <div>
					<input type="text" name="userName" id="userName" placeholder="Enter Email Address"> 
				  </div>
				  <div>
					<input type="password" name="password" id="password" placeholder="Enter Password"> 
				  </div>
				  <!-- <input type="button" value="Login" onclick="closeAndRefresh();"><a class="forgot" href="#">Forgot Your Password?</a> -->
				  <input type="submit" value="Login"><a class="forgot" href="#">Forgot Your Password?</a>
			    </form>
			    <div style="display: inline-flex;"><span>New to Project1?</span><span><a class="signUp" href="#">SIGN UP</a></span></div>
			   </div>	
			   <div class="clearfix"> </div>
			 </div>
		 </sec:authorize>
		 <sec:authorize access="isAuthenticated()">
			 <div id="closelink">
	            <a href="javascript:opener.location.reload(true);window.close();">Click Here to Close this Page</a>
	        </div>
        </sec:authorize>
		 <script>
		 	function closeAndRefresh(){
		 		document.forms['loginform'].submit();
		 		//$("#loginDiv").css("display","none");
		 		//$("#closelink").css("display","block");
		 		opener.location.reload(true);
		 	    return true;
		 	}
		 	
			$('.signUp').click( function() { window.open("/project1/register",null,"height=300,width=400,status=yes,toolbar=no,menubar=no,location=no"); return false; } );
		</script>
	</div>
</body>
</html>