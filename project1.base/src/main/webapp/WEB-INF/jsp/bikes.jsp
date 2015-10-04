<!--A Design by W3layouts
Author: W3layout
Author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE HTML>
<html>
<head>
<title>Bicycleshop Bootstarp Website Template | About us :: w3layouts</title>
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
<link rel="stylesheet" href="css/etalage.css">
<script src="js/jquery.etalage.min.js"></script>
<!-- Include the Etalage files -->
<script>
		jQuery(document).ready(function($){

			$('#etalage').etalage({
				thumb_image_width: 400,
				thumb_image_height: 350,
				
				show_hint: true,
				click_callback: function(image_anchor, instance_id){
					alert('Callback example:\nYou clicked on an image with the anchor: "'+image_anchor+'"\n(in Etalage instance: "'+instance_id+'")');
				}
			});
			// This is for the dropdown list example:
			$('.dropdownlist').change(function(){
				etalage_show( $(this).find('option:selected').attr('class') );
			});

	});
</script>
<!----//details-product-slider--->
</head>
<body>
<!-- Header Starts Here -->
<div class="header">
	<div class="container">
		<div class="header-top">
			<div class="logo">
				<a href="index.html"><img src="images/logo.png"></a>
			</div>
			<span class="menu"></span>
			<div class="clear"></div>
			<div class="navigation">
				<ul class="navig">
					<li><a href="bikes.html">Bikes</a></li>
					<li><a href="best.html">Best Buy</a></li>
					<li><a href="bikes.html">Offers</a></li>
					<li><a href="best.html">Accessories</a></li>
					<li><a href="contact.html">Contact</a></li>
					<li><a href="about.html">About Us</a></li>
				</ul>
				<script>
					$( "span.menu" ).click(function() {
					  $( ".navigation ul.navig" ).slideToggle( "slow", function() {
					    // Animation complete.
					  });
					});
				</script>
			</div>
			<div class="clearfix"></div>
		</div>
		<div class="about">
			<div class="product">
				<div class="product-listy">
					<h3>Our Products</h3>
					<ul class="product-list">
						<li><a href="">New Products</a></li>
						<li><a href="">Old Products</a></li>
						<li><a href="">Sports</a></li>
						<li><a href="">Clasical</a></li>
						<li><a href="">New trend</a></li>
						<li><a href="">New Release</a></li>
						<li><a href="login.html">Log In</a></li>
						<li><a href="register.html">Register</a></li>
					</ul>
				</div>
				<div class="latest-bis">
					<img src="images/offer.jpg" class="img-responsive">
					<div class="offer">
						<p>40%</p>
						<small>Top Offer</small>
					</div>
				</div>
				<div class="tags">
				    	<h4 class="tag_head">Tags Widget</h4>
				         <ul class="tags_links">
							<li><a href="#">Kitesurf</a></li>
							<li><a href="#">Super</a></li>
							<li><a href="#">Duper</a></li>
							<li><a href="#">Theme</a></li>
							<li><a href="#">Men</a></li>
							<li><a href="#">Women</a></li>
							<li><a href="#">Equipment</a></li>
							<li><a href="#">Best</a></li>
							<li><a href="#">Accessories</a></li>
							<li><a href="#">Men</a></li>
							<li><a href="#">Apparel</a></li>
							<li><a href="#">Super</a></li>
							<li><a href="#">Duper</a></li>
							<li><a href="#">Theme</a></li>
							<li><a href="#">Responsiv</a></li>
					        <li><a href="#">Women</a></li>
							<li><a href="#">Equipment</a></li>
						</ul>
						<a href="#" class="link1">View all tags</a>
				     </div>

			</div>
			<div class="new-product">
				<div class="new-product-top">
					<ul class="product-top-list">
						<li><a href="index.html">Home</a>&nbsp;<span>&gt;</span></li>
						<li><a href="bikes.jpg">Bikes</a>&nbsp;<span>&gt;</span></li>
						<li><span class="act">New Products</span>&nbsp;</li>
					</ul>
					<p class="back"><a href="index.html">Back to Previous</a></p>
					<div class="clearfix"></div>
				</div>
				<div class="new-topday">
					<h3 class="new-models">Today Releases</h3>
					<a href="single.html"><div class="today-new-left">
						<img src="images/offer.jpg" class="img-responsive">
						<div class="sale-box">
							<span class="on_sale title_shop">New</span>
						</div>
					</div></a>
					
					<a href="single.html"><div class="today-new-left">
						<img src="images/offer2.jpg" class="img-responsive">
						<div class="sale-box">
							<span class="on_sale title_shop">New</span>
						</div>
					</div></a>
					<a href="single.html"><div class="today-new-left">
						<img src="images/offer3.jpg" class="img-responsive">
						<div class="sale-box">
							<span class="on_sale title_shop">New</span>
						</div>
					</div></a>
					<a href="single.html"><div class="today-new-left">
						<img src="images/bb1.jpg" class="img-responsive">
						<div class="sale-box">
							<span class="on_sale title_shop">New</span>
						</div>
					</div></a>
					<a href="single.html"><div class="today-new-left">
						<img src="images/bb2.jpg" class="img-responsive">
						<div class="sale-box">
							<span class="on_sale title_shop">New</span>
						</div>
					</div></a>
					<a href="single.html"><div class="today-new-left">
						<img src="images/bb3.png" class="img-responsive">
						<div class="sale-box">
							<span class="on_sale title_shop">New</span>
						</div>
					</div></a>
					<div class="clearfix"></div>
				</div>
				<h3 class="new-models">New Models</h3>
				<div class="best-seller">
					<div class="biseller-info">
					<ul id="flexiselDemo3">
						<li>
							<div class="biseller-column">
							<img src="images/sm1.jpg" alt="">
							</div>
						</li>
						<li>
							<div class="biseller-column">
							<img src="images/sm3.jpg" alt="">
							</div>
						</li>
						<li>
							<div class="biseller-column">
							<img src="images/sm4.jpg" alt="">
							</div>
						</li>
						<li>
							<div class="biseller-column">
							<img src="images/sm1.jpg" alt="">
							</div>
						</li>
			     	</ul>
					</div>
			</div>
			<script type="text/javascript">
				 $(window).load(function() {
					$("#flexiselDemo3").flexisel({
						visibleItems: 3,
						animationSpeed: 1000,
						autoPlay: true,
						autoPlaySpeed: 3000,    		
						pauseOnHover: true,
						enableResponsiveBreakpoints: true,
				    	responsiveBreakpoints: { 
				    		portrait: { 
				    			changePoint:480,
				    			visibleItems: 1
				    		}, 
				    		landscape: { 
				    			changePoint:640,
				    			visibleItems: 2
				    		},
				    		tablet: { 
				    			changePoint:768,
				    			visibleItems: 3
				    		}
				    	}
				    });
				    
				});
			   </script>
			<h3 class="new-models">Sales Models</h3>
				<div class="best-seller">
					<div class="biseller-info">
					<ul id="flexiselDemo1">
						<li>
							<div class="biseller-column">
							<img src="images/sm1.jpg" alt="">
							</div>
						</li>
						<li>
							<div class="biseller-column">
							<img src="images/sm3.jpg" alt="">
							</div>
						</li>
						<li>
							<div class="biseller-column">
							<img src="images/sm4.jpg" alt="">
							</div>
						</li>
						<li>
							<div class="biseller-column">
							<img src="images/sm1.jpg" alt="">
							</div>
						</li>
			     	</ul>
					</div>
			</div>
			<script type="text/javascript">
				 $(window).load(function() {
					$("#flexiselDemo1").flexisel({
						visibleItems: 3,
						animationSpeed: 1000,
						autoPlay: true,
						autoPlaySpeed: 3000,    		
						pauseOnHover: true,
						enableResponsiveBreakpoints: true,
				    	responsiveBreakpoints: { 
				    		portrait: { 
				    			changePoint:480,
				    			visibleItems: 1
				    		}, 
				    		landscape: { 
				    			changePoint:640,
				    			visibleItems: 2
				    		},
				    		tablet: { 
				    			changePoint:768,
				    			visibleItems: 3
				    		}
				    	}
				    });
				    
				});
			   </script>
			   <script type="text/javascript" src="js/jquery.flexisel.js"></script>
			</div>
			<div class="clearfix"></div>
		</div>
		<!--- fOOTER Starts Here --->
		<div class="footer-top abt-ft">
			<ul class="bottom-list">
				<li><a href="#">terms & conditions</a></li>
				<li><a href="#">return policy</a></li>
				<li><a href="#">reviews</a></li>
				<li><a href="#">about shop</a></li>
				<li><a href="#">secure payment</a></li>
			</ul>
		</div>
		<ul class="payment-list">
			<li><i class="paypal"></i></li>
			<li><i class="wi"></i></li>
			<li><i class="visa"></i></li>
			<li><i class="amazon"></i></li>
			<li><i class="sm"></i></li>
		</ul>
	</div>
	<!--- fOOTER Starts Here --->
</body>
</html>