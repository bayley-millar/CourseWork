<?php session_start(); ?>

<?php
/*this allows the removal of rooms that is accessed
 on the admin.php page  */


header('Refresh: 2, url=admin.php');

$itemvarremoval = $_POST['itemToEdit'];
?>

<?php
function IsEmpty($roomv){
    return (!isset($roomv) || trim($roomv) ==='');
}
?>

<?php
if (isset($_POST['removeButtonRoom'])) {
    $xml = simplexml_load_file('xml/hotelRooms.xml');
    $delNode = $xml->xpath('//hotelRooms/hotelRoom[number="' . $itemvarremoval . '"]');
    unset($delNode[0][0]);

    $xml->saveXML('xml/hotelRooms.xml');



    echo ("Room successfully removed, you will be redirected shortly! </p>");


}
?>
