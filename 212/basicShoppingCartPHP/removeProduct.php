<?php
/**
 * Created by PhpStorm.
 * User: bmillar
 * Date: 10/12/16
 * Time: 4:22 PM
 */
session_start();

$name = $_POST['productName'];


/**
 * This method is activated after the remove button is clicked.
 * It finds the name and removes it from the Session array of cart
 * @param $name is the posted name of the product
 */
function removeProduct($name){
    $arr = $_SESSION['cart'];
    $size = count($arr)-1;
    if($size >= 1) {
        for ($i = $size; $i >= 0; $i--) {

            if ($arr[$i]["name"] == $name) {
                unset($arr[$i]);
            }
        }
        $_SESSION['cart'] = $arr;
    }else{
        unset($_SESSION['cart']);
    }
}

removeProduct($name);

header("Location: index.php");