<!DOCTYPE html>
<html>

<head>
  <meta>
    <meta charset="UTF-8">
    <meta name="Portfolio" content="Little Menu for Portfolio">
    <meta name="keywords" content="Web Developer">
    <meta name="Luis Iván García Luna" content="Information Technologies Engineer">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta content="http://db.garlun.net/index.html" type="og:url"/>
    <meta content="SuperData Database" property="og:description"/>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="icon" type="image/png" href="img/logo.png">
<title>SuperData - CRM</title>
</meta>

</head>

<body>

  <!-- multistep form -->
<form id="msform" action="signup.php" method="post">
	<!-- progressbar -->
	<ul id="progressbar">
		<li class="active">Account Setup</li>
		<li>Personal Details</li>
	</ul>
	<!-- fieldsets -->
	<fieldset>
		<h2 class="fs-title">Create your account</h2>
		<h3 class="fs-subtitle">This is step 1</h3>
		<input type="text" name="email" placeholder="Email" />
		<input type="password" name="pass" placeholder="Password" />
		<input type="password" name="cpass" placeholder="Confirm Password" />
		<input type="button" name="next" class="next action-button" value="Next" />
	</fieldset>
	<fieldset>
		<h2 class="fs-title">Personal Details</h2>
		<h3 class="fs-subtitle">We will never sell it</h3>
		<input type="text" name="name" placeholder="Full Name" />
		<input type="text" name="phone" placeholder="Phone" />
		<textarea name="address" placeholder="Address"></textarea>
		<input type="button" name="previous" class="previous action-button" value="Previous" />
		<input type="submit" name="submit" class="submit action-button" value="Submit" />
	</fieldset>
</form>

<!-- jQuery -->
<script src="http://thecodeplayer.com/uploads/js/jquery-1.9.1.min.js" type="text/javascript"></script>
<!-- jQuery easing plugin -->
<script src="http://thecodeplayer.com/uploads/js/jquery.easing.min.js" type="text/javascript"></script>

  <script src="js/index.js"></script>
<?php include_once("db.php"); ?>
<?php
if(isset($_POST["submit"])){
$user_name = $_POST['name'];
$user_email = $_POST['email'];
$user_pass = $_POST['pass'];
$user_phone= $_POST['phone'];
$user_addres= $_POST['address'];
if($user_name==''){
echo "<script>alert('Por favor inserta un nombre')</script>"; exit();}
if($user_email==''){
echo "<script>alert('Por favor inserta un email')</script>"; exit();}
if($user_phone==''){
echo "<script>alert('Por favor inserta un numero telefónico')</script>";
exit();}
$query = "insert into admins (name,address,email,phone_num,password) values 
('$user_name','$user_addres','$user_email','$user_phone','$user_pass')";
if(mysql_query($query)){
echo "<script>alert('Registro satisfactorio')</script>";
echo '<script type="text/javascript" language="javascript"> window.open("home.html"); </script>'; 

}
}
?>
</body>
</html>