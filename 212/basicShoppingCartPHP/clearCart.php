<?php
/**
 * Created by PhpStorm.
 * User: bmillar
 * Date: 10/12/16
 * Time: 3:58 PM
 */
session_start();

/**
 * this is used to clear the cart after the button is clicked
 */
function clearCart(){
    unset($_SESSION['cart']);
}
clearCart();

header("Location: index.php");