<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Bicycleshop Bootstarp Website Template | Register:: w3layouts</title>
<link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery-1.11.0.min.js"></script>
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
		    <script type="text/javascript">
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
<!-- Header Starts Here -->
<div class="header">
	<div class="container">
		<div class="about">
			<div class="prody">
				 <div class="register">
				  	  <form action="/project1/addUser">
						 <div class="register-top-grid">
						 	<h4>${message}</h4>
							<h3>PERSONAL INFORMATION</h3>
							 <div>
								<span>First Name<label>*</label></span>
								<input type="text" id="firstName" name="firstName"/> 
							 </div>
							 <div>
								<span>Last Name<label>*</label></span>
								<input type="text" id="lastName" name="lastName"/> 
							 </div>
							 <div>
								 <span>Email Address<label>*</label></span>
								 <input id="emailId" name="emailId" type="email"> 
							 </div>
							 <div class="clearfix"> </div>
							   <a class="news-letter" href="#">
								 <label class="checkbox"><input type="checkbox" name="checkbox" checked=""><i> </i>Sign Up for Newsletter</label>
							   </a>
							 </div>
						     <div class="register-bottom-grid">
							<h3>LOGIN INFORMATION</h3>
								 <div>
									<span>Password<label>*</label></span>
									<input type="password" id="password" name="password">
								 </div>
								 <div>
									<span>Confirm Password<label>*</label></span>
								<input type="password" id="confirmPassword" name="confirmPassword">
							 </div>
						 </div>
						<div class="clearfix"> </div>
						<div class="register-but">
						   <input type="submit" value="submit">
						   <div class="clearfix"> </div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
</body>
</html>
