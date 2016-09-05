/* this function pulls the information from hotelrooms and displays on rooms.html   */
var Rooms_xml = (function () {
    'use strict';
    var pub = {};

    function showRooms() {
        var target = $("#room_display");
        var source = "xml/hotelRooms.xml";

        $.ajax({
            type: "GET",
            url: "xml/hotelRooms.xml",
            cache: false,
            success: function (data) {
                parseReviews(data, target);

            }
        });

    }


    /* function parseReviews parses the information to the html page*/
    function parseReviews(data, target) {
        var html;
        //$(target).empty();
        $(data).find("hotelRoom").each(function () {
            var number = $(this).find("number")[0].textContent;
            var roomType = $(this).find("roomType")[0].textContent;
            var description = $(this).find("description")[0].textContent;
            var pricePerNight = $(this).find("pricePerNight")[0].textContent;




            $(target).append("<tr><td>" + number + ":" + "</td><td>" + roomType + description + " " + pricePerNight + "</td></tr>");
        });
    }


    pub.setup = function () {
        showRooms();
    }


    return pub;
}());

$(document).ready(Rooms_xml.setup);
