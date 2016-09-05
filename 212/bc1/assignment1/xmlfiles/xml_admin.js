/*The admin page javascript, targets spot to insert information into div*/
var Admin_xml = (function () {
    'use strict';
    var pub = {};

    function adminRooms() {
        var target = $("#admin_display");
        var source = "xml/roomBookings.xml";

        $.ajax({
            type: "GET",
            url: "xml/roomBookings.xml",
            cache: false,
            success: function (data) {
                parseReviews(data, target);

            }
        });

    }


    /*this function parses the iinfomation xml to html */
    function parseReviews(data, target) {

        $(data).find("booking").each(function () {
            var number = $(this).find("number")[0].textContent;
            var name = $(this).find("name")[0].textContent;

            var day = $(this).find("day")[0].textContent;
            var month = $(this).find("month")[0].textContent;
            var year = $(this).find("year")[0].textContent;




            $(target).append("<tr><td>" + "Room number: " + number + ":" + "</td><td>" + "Name: " + name + " " + day + "/" + month + "/" + year + "</td></tr>");
        });
    }


    pub.setup = function () {
        adminRooms();
    }



    return pub;
}());

$(document).ready(Admin_xml.setup);
