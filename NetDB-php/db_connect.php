<?php
$HOST = "localhost";
$DB_NAME = "netdb";
$ID = "username";
$PWD = "password";

$link = mysql_connect($HOST,$ID,$PWD);

if(!$link){
	die("MySQL connect fail!");
}else{
 	//echo "MySQL connected!<br><br>";
 	mysql_query('SET NAMES utf8',$link);
	mysql_query('SET CHARACTER_SET_CLIENT=utf8',$link);
	mysql_query('SET CHARACTER_SET_RESULTS=utf8',$link);
}
$db_selected = mysql_select_db($DB_NAME, $link);

if(!$db_selected){
	die("Database connect fail!<br>".mysql_error($link));
}else{
	//echo "Database connected!<br>";	
}

?>