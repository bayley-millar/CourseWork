var FindRooms = (function () {
    "use strict";
    var pub = {};
    var xmlRooms;
    var bookedRooms = [];


    /*Function which pushes room numbers into an array which can be seleted for booking (filters out unavaible room numbers for that date) */
    function checkUnavaliableRooms(checkIn, checkOut) {
        var inSeparate = checkIn.split("/");
        var penInDay = inSeparate[0];
        var penInMonth = inSeparate[1];
        var penInYear = inSeparate[2];
        var penInDate = new Date(penInYear, penInMonth - 1, penInDay);

        var outSeparate = checkOut.split("/");
        var penOutDay = outSeparate[0];
        var penOutMonth = outSeparate[1];
        var penOutYear = outSeparate[2];
        var penOutDate = new Date(penOutYear, penOutMonth - 1, penOutDay);

        $(xmlRooms).find("booking").each(function () {
            var rmNum = $(this).find("number")[0].textContent;

            var cnfInDay = $(this).find("checkin day")[0].textContent;
            var cnfInMonth = $(this).find("checkin month")[0].textContent;
            var cnfInYear = $(this).find("checkin year")[0].textContent;
            var cnfInDate = new Date(cnfInYear, cnfInMonth - 1, cnfInDay);

            var cnfOutDay = $(this).find("checkout day")[0].textContent;
            var cnfOutMonth = $(this).find("checkout month")[0].textContent;
            var cnfOutYear = $(this).find("checkout year")[0].textContent;
            var cnfOutDate = new Date(cnfOutYear, cnfOutMonth - 1, cnfOutDay);


            if ((cnfInDate <= penInDate && penInDate < cnfOutDate) || (cnfInDate < penOutDate && penOutDate <= cnfOutDate)) {
                bookedRooms.push(rmNum);
            }
        });
    }


    /*Function to determind whether the check in date precedes the check out date and acts accordingly */
    function showSelect() {
        var checkIn = $("#datepickerIn").val();
        var checkOut = $("#datepickerOut").val();

        var inSplit = checkIn.split("/");
        var inSplitDay = inSplit[0];
        var inSplitMonth = inSplit[1];


        var outSplit = checkOut.split("/");
        var outSplitDay = outSplit[0];
        var outSplitMonth = outSplit[1];

        if (inSplitDay > outSplitDay && inSplitMonth === outSplitMonth || inSplitMonth > outSplitMonth) {

            alert("Check in date must precede check out date");
            $("#selectRoom").hide();
            $("#bookRoom").hide();
        } else if (checkIn.length === 0 || checkOut.length === 0) {
            $("#selectRoom").hide();
            $("#bookRoom").hide();
        } else {
            checkUnavaliableRooms(checkIn, checkOut);
            $("#selectRoom").show();
            $("#bookRoom").show();
            Booking.setup(bookedRooms);


        }
    }

    pub.setup = function () {

        $("#selectRoom").hide();
        $("#bookRoom").hide();
        $.ajax({
            type: "GET",
            url: "roomXML/roomBookings.xml",
            cache: false,
            success: function (data) {
                xmlRooms = data;
            }
        });
        $("#findRoom").click(function (e) {
            e.preventDefault();
            showSelect();
        });
    };

    return pub;
}());

$(document).ready(FindRooms.setup);
