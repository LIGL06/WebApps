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
<div class="navbar">
  <ul class="nav">
    <li class="nav-item"><a href="home.php" ><i class="icon-fixed-width icon-home"></i>Home</a></li>
    <li class="nav-item"><a href="materials.php"><i class="icon-fixed-width icon-coffee"></i>Clients</a></li>
    <li class="nav-item"><a href="types.php"><i class="icon-fixed-width icon-camera-retro"></i>Type of Materials</a></li>
    <li class="nav-item"><a href="payments.php"><i class="icon-fixed-width icon-user"></i>Payments Status</a></li>
    <li class="nav-item"><a href="stock.php"><i class="icon-fixed-width icon-envelope"></i>Stock/Inventory</a></li>
    <li class="nav-item"><a href="logout.php"><i class="icon-fixed-width icon-user"></i>Logout</a></li>
  </ul>
</div>
    <div>
    <form id="msform" action="home.php" method="post">
	<!-- progressbar -->
	<ul id="progressbar">
		<li class="active">Search</li>
	</ul>
	<!-- fieldsets -->
	<fieldset>
		<h2 class="fs-title">Search for?</h2>
		<h3 class="fs-subtitle">What are you looking?</h3>
		<input type="text" name="email" placeholder="Client Email" />
		<input type="text" name="id" placeholder="Client ID" />
		<input type="submit" name="submit" class="submit action-button" value="Submit" />
	</fieldset>
</form>
    </div>
<?php
mysql_connect("localhost","garlunne_ligl","Luis_Ivan_06");
mysql_select_db("garlunne_SuperData");
if(isset($_POST["submit"])){
$user_id = $_POST['id'];
$user_email = $_POST['email'];
$check_id = "select * from client where 
client_id='$user_id'"; 
$query = "SELECT client_id,name,address,email,phone_num FROM client WHERE client_id = $user_id";
$res= mysql_query($query);
echo "<table border='1' align='center' width='30%'>"; 
echo "<tr><td>Client_id</td><td>Client Name</td><td>Client Address</td><td>Client Email</td><td>Client Phone</td>";
while($fila=mysql_fetch_assoc($res)){
  echo "<tr><td><center><font color='black'>".$fila['client_id']."</font></center></td>";
  echo "<td><center><font color='black'>".$fila['name']."</font></center></td>";
  echo "<td><center><font color='black'>".$fila['address']."</font></center></td>";
  echo "<td><center><font color='black'>".$fila['email']."</font></center></td>";
  echo "<td><center><font color='black'>".$fila['phone_num']."</font></center></td>";
}
echo "</table>";
$run = mysql_query($check_id);
if(mysql_num_rows($run)>0){
echo "<script>alert('Folio $user_id
Registrado Anteriormente')</script>";}
if(mysql_query($query)){
echo "<script>alert('Consulta Exitosa')</script>";}
}
?>
</body>
</html>