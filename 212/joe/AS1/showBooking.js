var ShowBooking = (function () {
    'use strict';
    var pub = {};

    /*setup function to display pending bookings which are stored in cookie, appened and found at book.html */
    pub.setup = function () {
        var i;
        var cart = JSON.parse(Cookie.get("cart"));
        var name;
        var room;
        var checkIn;
        var checkOut;
        if (cart === null) {
            $("#booking").hide();
        } else {
            for (i = 0; i < cart.length; i += 1) {
                name = cart[i].guestName;
                room = cart[i].roomNum;
                checkIn = cart[i].checkIn;
                checkOut = cart[i].checkOut;
                $("#booking").append("<ul><li>" + name + ": In room #" + room + " from " + checkIn + " to " + checkOut + "</li></ul>");

            }

        }
    };
    return pub;
}());


$(document).ready(ShowBooking.setup);
