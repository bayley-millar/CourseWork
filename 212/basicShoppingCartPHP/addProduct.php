<?php
/**
 * Created by PhpStorm.
 * User: bmillar
 * Date: 10/11/16
 * Time: 1:45 PM
 */
session_start();


$name = $_POST['productName'];
$unFormattedPrice = $_POST['productPrice'];

$price = number_format($unFormattedPrice, 2, '.', '');// format to 2 decimal places


/**
 * This function is used to add products to a new session array called cart.
 * The product is added to the cart and a 'quantity' property is also added to that product.
 * @param $name is the name posted by the form to add to the new Session of cart.
 * @param $price is the price posted by the form to add to the new Session of cart.
 */
function addProduct($name, $price)
{
    if (!isset($_SESSION['cart'])) {
        $_SESSION['cart'] = array();
    }
    foreach ($_SESSION['cart'] as &$item) {

        if (in_array($name, $item)) {

            $item['quantity'] += 1;
            header("Location: index.php");
            exit;
        }
    }
    $array = array("name" => $name, "price" => $price, "quantity" => 1 );
    array_push($_SESSION['cart'], $array);


}

addProduct($name, $price);







header("Location: index.php");
