<?php
/*bcarter addbooking.php

  - this file allows the user to add a booking and send the relevant
  - data to the xml file, the correct structure has been tested
  */
header('Refresh: 2, url=index.php');

echo "<p>You succussfuly booked your room, you will be redirected shortly!</p>";


$bookings = simplexml_load_file("xml/roomBookings.xml");
if (isset($_COOKIE['bookings'])) {

    $cookiebookings = json_decode($_COOKIE['bookings']);

    foreach ($cookiebookings as $booking){
        $newBooking = $bookings->addChild('booking');
        $newBooking->addChild('number', $booking->number);
        $newBooking->addChild('name', $booking->name);

        list($yearIn, $monthIn, $dayIn) = explode("-", $booking->checkin);

        $checkIn = $newBooking->addChild('checkin');
        $checkIn->addChild('day', $dayIn);
        $checkIn->addChild('month', $monthIn);
        $checkIn->addChild('year', $yearIn);

        list($yearOut, $monthOut, $dayOut) = explode("-", $booking->checkout);

        $checkOut = $newBooking->addChild('checkout');
        $checkOut->addChild('day', $dayOut);
        $checkOut->addChild('month', $monthOut);
        $checkOut->addChild('year', $yearOut);

}

 setcookie('bookings', '', time()-3600, '/');
    unset($_COOKIE['bookings']);
$bookings->saveXML("xml/roomBookings.xml");


}
?>

