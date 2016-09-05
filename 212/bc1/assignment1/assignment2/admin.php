<!DOCTYPE html>

<!-- bcarter admin.php
   this php which allows the admin to interact and enter
   usefuly information about their hotelrooms and
    exiting of bookings it it then sent to addRoom.php
    removeBooking.php and editRoom.php
   through POST and information is stored on cookies which is
   exstracted and put into Xml

 -->



<html>

  
    <head>
        <meta charset="utf-8">
        <title>Administration</title>
        <script src="js/jquery-1.11.3.min.js"></script>
        <link rel="stylesheet" type="text/css" href="css/template_live.css">
        <script src="js/admin.js"></script>
        <script src="js/cookie.js"></script>
        <script src="js/bookRooms.js"></script>
        <script src="js/listRooms.js"></script>

        <?php $currentPage = basename($_SERVER["PHP_SELF"]);
        if (isset($scriptList) && is_array($scriptList)) {
            foreach ($scriptList as $script) {
                echo "<script src=$script></script>";
            }
        }
        ?>

    </head>
    
    <body>
    
        <h1>La Casa Hotel</h1>
            
        <nav>
            <ul id = "nav">
                <li> <a href="index.php">Home</a> </li>
                <li> <a href="rooms.php">View Rooms</a> </li>
                <li> <a href="book.php">Book a Room</a> </li>
                <li id="current"><a>Administration </a></li>
            </ul>
        </nav>
        
        
        
        <div id="main">
            <fieldset class="deleteBookings">



                <legend>Delete Existing Bookings</legend>


                <form id="removeBookingForm" method="POST" action="removeBooking.php">

                    <select name="itemToRemove" id="itemToRemove">


                        <input type="submit" name="removeButton" id="removeButton" value="Remove Booking">

                    </select>
                </form>

                <h2> Current Bookings </h2>

                <ul id="bookingList">

                </ul>

            </fieldset>



            <fieldset class = "AddRoom">
                <legend>Add Room</legend>
                    <form id = "addRoomForm" method="post" action="addRoom.php">
                    </select>
                    <div id="roomDetails">
                        <p> What type of room would you like to create? </p>
                        <p><b>Room type options :<b> 'King', 'Single', 'Double', 'Twin', 'Triple Room'  </p>
                        <p>Room type options must be entered in above format.</p>
                        <label>Room Number:</label>
                        <input type="text" id="editRoomNum" name="editRoomNum">
                        <br><label>Room Type:</label>
                        <input type="text" id="editRoomType" name="editRoomType" value="">
                        <br><label>Room Description:</label>
                        <input type="text" id="editRoomDescription" name="editRoomDescription">
                        <br><label>Room price:</label>
                        <input type="text" id="editRoomPrice" name="editRoomPrice">
                    </div>
                    <input type="submit" name="editRoomButton" id="editRoomButton" value="create this room">

                </form>

            </fieldset>


            <fieldset class = "deleteRoom">
                <legend>Delete Rooms</legend>

                <form id="RemoveRoomForm" method="POST" action="editRoom.php">
                    <select name="itemToEdit" id="itemToEdit">
                        <input type="submit" name="removeButtonRoom" id="removeButtonRoom" value="Remove Room">
                    </select>
                </form>



            </fieldset>
        </div>



        
    </body>
</html>