<?php
 
	session_start(); # Starts the session
 
	session_unset(); #removes all the variables in the session
 
	session_destroy(); #destroys the session
 
	if(!$_SESSION['email'])
    {
   		echo "Successfully logged out!<br />";
        echo "<a href='signin.php'>Sign In</a>";
        echo "<br><a href='signup.php'>Sign Up</a>";
    }
	else
    {   echo "Error Occured!!<br />";}
 
?>
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
<title>SuperData - CRM</title>
</head>
</html>