var Rooms = (function () {
    "use strict";
    var pub = {};
    /*Function to fetch (ajax) XML file regarding rooms at the hotel*/
    function showRooms() {
        var target = $("#room");
        var source = "roomXML/hotelRooms.xml";
        $.ajax({
            type: "GET",
            url: source,
            cache: false,
            success: function (data) {
                parseRooms(data, target);

            }


        });

    }
    /*Function which displays the rooms the hotel offers on room.html */
    function parseRooms(data, target) {
        $(data).find("hotelRoom").each(function () {
            var number = $(this).find("number")[0].textContent;
            var type = $(this).find("roomType")[0].textContent;
            var decription = $(this).find("description")[0].textContent;
            var ppn = $(this).find("pricePerNight")[0].textContent;
            $(target).append("<dl><dt>" + number + ":" + " " + type + "</dt><dd>" + decription + "." + " $" + ppn + " per night" + "</dd></dl>");
        });

    }


    pub.setup = function () {
        $(window).load(function () {
            showRooms();
        });


    };

    return pub;
}());

$(document).ready(Rooms.setup);
