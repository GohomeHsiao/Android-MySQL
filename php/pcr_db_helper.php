<?php
include("db_connect.php");

//---MAIN----------------------------------------------------------------
switch($_POST[action]){	
	case "getSeatNumberByName":
		$name = $_POST[name];
		echo getSeatNumberByName('student', $name, $link);
		break;
	default:
		echo -1;
}
// Test Area
//echo getSeatNumberByName('student', 'David', $link);

//-----------------------------------------------------------------------

function getSeatNumberByName($tableName, $name, $link){
	$sql = "SELECT seatNumber FROM $tableName WHERE name='$name'";
	$result = mysql_query($sql, $link);	
	$meta = mysql_fetch_assoc($result);
	if($meta[seatNumber] != null){
		return $meta[seatNumber];
	}else{
		return -1;
	}			
}

?>