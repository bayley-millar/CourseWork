<?php
/**
 * Created by PhpStorm.
 * User: bmillar
 * Date: 10/12/16
 * Time: 4:34 PM
 */

/**
 * This funciton is used to return the total cost of the cart
 * @return int total returns the total cost
 */
function totalPrice(){
    $total = 0;
    foreach ($_SESSION['cart'] as $item){
        $total += $item['price'] * $item['quantity'];
    }
    return $total;
}


/**
 * This function is used to calcualate the individual total costs of each product
 * respective to its quantity
 * @param $name is the name of the product
 * @return int total returns the total cost of an individual product with quantity
 */
function individualTotal($name){

    foreach ($_SESSION['cart'] as $item){
        if(in_array($name, $item)) {
            $total = 0;
            $total += $item['price'] * $item['quantity'];
            return $total;
        }
    }

}