var Booking = (function () {
    "use strict";
    var pub = {};

    /*Method generated the select drop down menu of avaliable rooms given the dates*/
    function parseRooms(data, bookedRooms) {
        var selectOptions = document.getElementById("chooseRoom");
        var str = '';
        $(data).find("hotelRoom").each(function () {
            var number = $(this).find("number")[0].textContent;
            if ($.inArray(number, bookedRooms) === -1) {
                var ppn = $(this).find("pricePerNight")[0].textContent;
                var bedding = $(this).find("roomType")[0].textContent;
                str += ("<option value=" + number + ">" + number + ": " + bedding + " - " + "$" + ppn + "</option>\n");
            }
        });
        selectOptions.innerHTML = str;
    }


    pub.setup = function (bookedRooms) {
        $.ajax({
            type: "GET",
            url: "roomXML/hotelRooms.xml",
            cache: false,
            success: function (data) {
                parseRooms(data, bookedRooms);
            }

        });
    };
    return pub;
}());

$(document).ready(Booking.setup);
