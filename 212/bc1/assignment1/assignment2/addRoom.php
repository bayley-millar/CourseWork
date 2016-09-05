
<?php
/*
 - addRoom.php allows the adding of new hotel rooms with the use of xml
 - information is added from the form on admin.php

*/
session_start();
$errorcount = 0;
?>


<?php
function isEmpty($str) {
    return strlen(trim($str)) == 0;
}

header('Refresh: 2, url=index.php');

echo "<p>You succussfuly made your room, you will be redirected shortly!</p>";

?>


<?php


$_SESSION['editRoomNum'] = $_POST['editRoomNum'];
$_SESSION['editRoomType'] = $_POST['editRoomType'];
$_SESSION['editRoomDescription'] = $_POST['editRoomDescription'];
$_SESSION['editRoomPrice'] = $_POST['editRoomPrice'];


if((isEmpty($_POST['editRoomNum']))){
    $errorcount++;
}

if((isEmpty($_POST['editRoomType']))){
    $errorcount++;
}

if((isEmpty($_POST['editRoomDescription']))){
    $errorcount++;
}

if((isEmpty($_POST['editRoomPrice']))){
    $errorcount++;
}

header('Refresh: 2, url=admin.php');

$bookings = simplexml_load_file("xml/hotelRooms.xml");

?>

<?php

if ($errorcount === 0) {
    $cart = json_decode($_COOKIE['bookings']);

    $rooms = simplexml_load_file("xml/hotelRooms.xml");

    $newRoom = $rooms->addChild('hotelRoom');

    $newRoom ->addChild('number', $_POST['editRoomNum']);
    $newRoom ->addChild('roomType', $_POST['editRoomType']);
    $newRoom ->addChild('description', $_POST['editRoomDescription']);
    $newRoom ->addChild('pricePerNight', $_POST['editRoomPrice']);


    $rooms->saveXML("xml/hotelRooms.xml");


}







?>