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
    <link rel="icon" type="image/png" href="img/logo.png">
<title>SuperData - CRM</title>
</head>

<body>
<div class="navbar">
  <ul class="nav">
    <li class="nav-item"><a href="home.php" ><i class="icon-fixed-width icon-home"></i>Home</a></li>
    <li class="nav-item"><a href="materials.php"><i class="icon-fixed-width icon-coffee"></i>Order Status</a></li>
    <li class="nav-item"><a href="types.php"><i class="icon-fixed-width icon-camera-retro"></i>Products Purchased</a></li>
    <li class="nav-item"><a href="payments.php"><i class="icon-fixed-width icon-user"></i>Payments Status</a></li>
    <li class="nav-item"><a href="stock.php"><i class="icon-fixed-width icon-envelope"></i>Stock/Inventory</a></li>
    <li class="nav-item"><a href="logout.php"><i class="icon-fixed-width icon-user"></i>Logout</a></li>
  </ul>
</div> 
    <form id="msform" action="materials.php" method="post">
	<!-- progressbar -->
	<ul id="progressbar">
		<li class="active">Search</li>
	</ul>
	<!-- fieldsets -->
	<fieldset>
		<h2 class="fs-title">Fire!</h2>
		<h3 class="fs-subtitle">Deploy all orders!</h3>
		<input type="submit" name="submit" class="submit action-button" value="Submit" />
	</fieldset>
</form>
    <?php
mysql_connect("localhost","garlunne_ligl","Luis_Ivan_06");
mysql_select_db("garlunne_SuperData");
if(isset($_POST["submit"])){
$query = "SELECT * FROM  `Orders` ";
$res= mysql_query($query);
echo "<table border='1' align='center' width='30%'>"; 
echo "<tr><td>Order ID</td><td>Order Status</td>";
while($fila=mysql_fetch_assoc($res)){
  echo "<tr><td><center><font color='black'>".$fila['order_id']."</font></center></td>";
  echo "<td><center><font color='black'>".$fila['order_status']."</font></center></td>";
}
echo "</table>";
if(mysql_query($query)){
echo "<script>alert('Consulta Exitosa')</script>";}
}
?>
</body>
</html>