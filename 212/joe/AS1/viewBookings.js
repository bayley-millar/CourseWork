var Bookings = (function () {
    "use strict";
    var pub = {};
    /*Function (ajax) which gets the appropriate xml file for confirmed bookings */
    function showRooms() {
        var target = $("#bookings");
        var source = "roomXML/roomBookings.xml";
        $.ajax({
            type: "GET",
            url: source,
            cache: false,
            success: function (data) {
                parseBookings(data, target);

            }


        });

    }
    /*Function which parses the confirmed bookings and appends them to the admin.html page */
    function parseBookings(data, target) {

        $(data).find("booking").each(function () {
            var number = $(this).find("number")[0].textContent;
            var name = $(this).find("name")[0].textContent;
            var inDate = $(this).find("checkin day")[0].textContent + "/" + $(this).find("checkin month")[0].textContent + "/" + $(this).find("checkin year")[0].textContent;
            var outDate = $(this).find("checkout day")[0].textContent + "/" + $(this).find("checkout month")[0].textContent + "/" + $(this).find("checkout year")[0].textContent;
            $(target).append("<li>" + name + " - " + "Room " + number + " from " + inDate + " to " + outDate + "</li>");
        });

    }
    /*Function which filters out the confirmed bookings given when is typed in the search inputs */
    function filterRoom() {
        var valThis = $(this).val().toLowerCase();
        if (valThis === "") {
            $("#bookings>li").show();
        } else {
            $("#bookings>li").each(function () {
                var text = $(this).text().toLowerCase();
                if (text.indexOf(valThis) >= 0 && $(this).is(":visible")) {
                    $(this).show();
                } else {
                    $(this).hide();
                }
            });
        }
    }
    /*Function to reset the admin search input fields and reloads xml on  page */
    function resetSearch() {
        document.getElementById("adminSearch").reset();
        document.getElementById("bookings").innerHTML = "";
        showRooms();

    }


    pub.setup = function () {
        $(window).load(function () {
            showRooms();
            $("#roomNO").keyup(filterRoom);
            $("#guestName").keyup(filterRoom);
            $("#resetSearch").click(resetSearch);
        });


    };

    return pub;
}());

$(document).ready(Bookings.setup);
