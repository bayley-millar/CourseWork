<?php session_start(); ?>

<?php

/* removeBooking.php is the page which allows the removal
   of bookings from the xml file roomBookings.php*/

header('Refresh: 2, url=admin.php');

$itemvarremoval = $_POST['itemToRemove'];
?>

<?php
function IsEmpty($roomv){
    return (!isset($roomv) || trim($roomv) ==='');
}
?>

<?php
if (isset($_POST['removeButton'])) {
    $xml = simplexml_load_file('xml/roomBookings.xml');
    $delNode = $xml->xpath('//bookings/booking[number="' . $itemvarremoval . '"]');
    unset($delNode[0][0]);

    $xml->saveXML('xml/roomBookings.xml');



    echo ("Booking successfully removed, you will be redirected shortly! </p>");


}
?>