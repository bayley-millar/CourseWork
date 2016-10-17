<html lang="en">

<head>
    <title>EzyVet Prac</title>
    <link rel="stylesheet" href="stylesheet.css">
    <meta charset="utf-8">

    <?php
    /**
     * Created by PhpStorm.
     * User: bmillar
     * Date: 10/11/16
     * Time: 1:21 PM
     */

    session_start();
    include("restricted/PHPfunctions.php")
    ?>

</head>

<body>

<header id="header">
    <h1>Bayley's Tool Shop</h1>
</header>

<div id="main">


    <?php
    // ######## please do not alter the following code ########

    $products = array(
        array("name" => "Sledgehammer", "price" => 125.75),

        array("name" => "Axe", "price" => 190.50),

        array("name" => "Bandsaw", "price" => 562.13),

        array("name" => "Chisel", "price" => 12.9),

        array("name" => "Hacksaw", "price" => 18.45)

    );

    // ##################################################





    /*foreach ($products as &$item){
        $item['price'] = number_format($item['price'], 2, '.', '');
    }*/
    $arr = $products;
    for($i = count($arr)-1; $i >= 0; $i--){
        $arr[$i]['price'] = number_format($arr[$i]['price'], 2, '.', '');

    }
    $products = $arr;


    /**
     * this adds all the products from the provided products array
     * to the page for viewing and adding to cart.
     */
    foreach ($products as $item) {
        echo "<form id='addProducts' action='addProduct.php' method='post'>
        <fieldset>
            
            <p>Product: " . $item['name'] . "</p>
            <p>Price: $" . $item['price'] . "</p>
            
            <input type='hidden' name='productName' id='productName' value='" . $item['name'] . "'>
            <input type='hidden' name='productPrice' id='productPrice' value='" . $item['price'] . "'>
            <p>
                <input type='submit' value='add to cart'>
            </p>
        </fieldset>
    </form>";
    }
    ?>
</div>

<div id="cart">

    <h2>Your Current Cart:</h2>



    <?php

    /**
     * This adds all the items in the cart currently to the page
     * and also adds a remove button to each item.
     */
    foreach ($_SESSION['cart'] as $item) {
        echo "<p>ITEM : " . $item['name'] . "</p>";
        echo "<p>PRICE : " . $item['price'] . "</p>";
        echo "<p>QUANTITY :" . $item['quantity'] . "</p>";
        echo "    
    <form id='removeProduct' action='removeProduct.php' method='post'>
        
        <p>
            <input type='submit' value='remove product'>
        </p>
        <input type='hidden' name='productName' id='productName' value='" . $item['name'] . "'>
    </form>";
        echo "<p id='total'> Total Price = $ " . individualTotal($item['name']);
    }

    echo "<p id='totalCost'> Total Cart Cost = $ " . totalPrice();


    ?>
    <form id='clearCart' action='clearCart.php' method='post'>

        <p>
            <input type='submit' value='clear cart'>
        </p>
    </form>
</div>





<footer>
    <p>
        This is not a real store. No products are available, and no money will be accepted.
    </p>
    <p>
        Created by Bayley millar for the EzyVet practical test.
    </p>

</footer>


</body>
</html>