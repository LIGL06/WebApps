<!DOCTYPE html>
<html>
    
<head>
    <meta charset="UTF-8">
    <meta name="Portfolio" content="Little Menu for Portfolio">
    <meta name="keywords" content="Web Developer">
    <meta name="Luis Iván García Luna" content="Information Technologies Engineer">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta content="http://db.garlun.net/index.html" type="og:url"/>
    <meta content="SuperData Database" property="og:description"/>
    <link rel="stylesheet" type="text/css" href="css/style.css">
    <link rel="stylesheet" type="text/css" href="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="icon" type="image/png" href="img/logo.png">
<script type="text/javascript" src="//maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>
<script type="text/javascript" src="js/app.js"></script>
<title>SuperData - CRM</title>
</head>

<body>

<!-- multistep form -->
<form id="msform" action="signin.php" method="post">	
	<!-- fieldsets -->
    <ul id="progressbar">
		<li class="active">Sign In</li>
	</ul>
	<fieldset>
		<h2 class="fs-title">SuperData Sign In/Sign Up</h2>
		<h3 class="fs-subtitle">This is step 1</h3>
        <input type="text" name="email" placeholder="Email" />
		<input type="password" name="pass" placeholder="Password" />
		<input type="password" name="cpass" placeholder="Confirm Password" />
        <input type="submit" name="submit" class="submit action-button" value="Submit" />
	</fieldset>
</form>  
<?php
mysql_connect("localhost","garlunne_ligl","Luis_Ivan_06");
mysql_select_db("garlunne_SuperData");
if(isset($_POST["submit"])){
$user_email = $_POST['email'];
$user_pass = $_POST['pass'];
if($user_email==''){
echo "<script>alert('Por favor inserta un email')</script>"; exit();}
if($user_pass==''){
echo "<script>alert('Por favor inserta una contraseña')</script>";
exit();}
$sqlname = "SELECT name From admins WHERE(email='".$user_email."')";
$sql = "SELECT count(*) FROM admins WHERE(email='".$user_email."' and password='".$user_pass."')";
$query = mysql_query($sql);
$query2 = mysql_query($sqlname);
$result = mysql_fetch_array($query);
$result2 = mysql_fetch_array($query2);
    if($result[0]>0)
      {
        echo '<script type="text/javascript" language="javascript"> window.open("home.html"); </script>'; 
        
      }
      else
      {
        echo "Login Failed";
        echo "<a href='signin.php'>Sign In</a>";
        echo "<a href='signup.php'>Sign Up</a>";
      }
    if($result2[0]>0){
        echo "<script>Login as: ".$query2."</script>";
    }
}
    ?>
</body>
</html>