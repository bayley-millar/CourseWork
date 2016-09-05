<?php


$scriptList = array('jquery-1.11.1.min.js', 'cookies.js'); 
?>


<?php


<?php 
    
                    $_SESSION['checkinDate'] = $_POST['checkinDate'];
                    $_SESSION['checkoutDate'] = $_POST['checkoutDate'];
                    $_SESSION['bookingName'] = $_POST['bookingName'];
                    $_SESSION['roomSelection'] = $_POST['roomSelection'];


        
?>


<?php

    $bookings = json_decode($_COOKIE['bookings']);

    $bookings = simplexml_load_file('roomBooking.xml');
    $newOrder = $bookings->addChild('order');

    $booking = $newOrder->addChild('booking');
    $booking->addChild('number', $_POST['roomSelection']);
    $booking->addChild('name', $_POST['bookingName']);

    $newOrder = $bookings->addChild('checkin');
    $booking->addChild('day', $_POST['checkinday']);
    $booking->addChild('month', $_POST['checkinmonth']);
    $booking->addChild('year', $_POST['checkinyear']);

    $newOrder = $bookings->addChild('checkout');
    $booking->addChild('day', $_POST['checkoutday']);
    $booking->addChild('month', $_POST['checkoutmonth']);
    $booking->addChild('year', $_POST['checkoutyear']);





    $orders->saveXML('roomBooking.xml');
    setcookie('bookings', '', time()-3600, '/');
    unset($_COOKIE['bookings']);

?>


    