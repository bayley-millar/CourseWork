/*the book function which controls the room types*/
var Book_xml = (function () {
    'use strict';
    var pub = {};

    function showRooms() {
        var target = $("#spotx");
        var source = "xml/hotelRooms.xml";



    }
    /* function parseReviews parses the information to the html page*/
    function parseReviews(data) {
        var selectOp = document.getElementById("spotx");
        var string = "";


        $(data).find("hotelRoom").each(function () {
            var number = $(this).find("number")[0].textContent;
            if ($.inArray(number, Book_xml_display.bookedRooms) === -1) {
                var price = $(this).find("pricePerNight")[0].textContent;
                string += ("<option value=" + number + ">" + number + " - " + price + "</option>\n");
            }

        });
        selectOp.innerHTML = string;
    }


    pub.setup = function () {
        $.ajax({
            type: "GET",
            url: "xml/hotelRooms.xml",
            cache: false,
            success: function (data) {
                parseReviews(data);

            }
        });
    }



    return pub;
}());


$(document).ready(Book_xml.setup);
