var Book_xml_display = (function () {
    "use strict";
    var pub = {};
    var xmlData;
    var bookedRooms = [];
    var bookings = [];


    /* gettingAvalibleRooms which checks whether dates do not overlap, with logic */

    function gettingAvalibleRooms() {

        var checkin = $("#checkin").datepicker('getDate');
        var checkout = $("#checkout").datepicker('getDate');

        var i;
        //console.log(bookings);
        //console.log(checkin);
        //console.log(checkout);
        for (i = 0; i < bookings.length; i++) {
            if (bookings[i].dateI < checkout && bookings[i].dateO > checkin) {
                alert(bookings[i].number + " is already booked.");

            }

        }
        openLegend();
    }

    function openLegend() {
        $("#chooseRoom").show();
        appendToElement();

    }

    function appendToElement() {
        var string = "";
        var target = $("#book_display");
        var checkin = $(name).val();
        var checkout = $(name).val();
        var questName = $(name).val();
        var bookRoom = $(name).val();

        $(target).append("<tr><td>" + checkin + ":" + "</td><td>" + checkout + questName + " " + bookRoom + "</td></tr>");



    }





    /*setup function for hotelRooms. */
    function getHR() {
        return $.ajax({
            type: "GET",
            url: "xml/hotelRooms.xml",
            cache: false,
        });
    }
    /*setup function for roomBookings. */
    function getRB() {
        return $.ajax({
            type: "GET",
            url: "xml/roomBookings.xml",
            cache: false,
        });
    }

    /* getData function which gets room and booking and pushes onto array*/
    function getData() {
        $.when(getHR(), getRB()).done(function (HRData, RBData) {
            bookedRooms = [];
            bookings = [];
            $(HRData).find("hotelRoom").each(function () {
                var number = $(this).find("number")[0].textContent;
                var roomType = $(this).find("roomType")[0].textContent;
                var price = $(this).find("pricePerNight")[0].textContent;

                var x = {
                    number: number,
                    roomType: roomType,
                    price: price
                };
                bookedRooms.push(x);
            });
            $(RBData).find("booking").each(function () {
                var number = $(this).find("number")[0].textContent;
                var dayI = $(this).find("day")[0].textContent;
                var monthI = $(this).find("month")[0].textContent;
                var yearI = $(this).find("year")[0].textContent;
                var dayO = $(this).find("day")[1].textContent;
                var monthO = $(this).find("month")[1].textContent;
                var yearO = $(this).find("year")[1].textContent;

                var dateI = new Date(yearI, monthI - 1, dayI);
                var dateO = new Date(yearO, monthO - 1, dayO);

                var x = {
                    number: number,
                    dateI: dateI,
                    dateO: dateO
                };
                bookings.push(x);
            });
            gettingAvalibleRooms();
        });
    }

    //call this at some stage, neeed help here

    function ShowRooms() {
        var checkIn = $("#checkin").val();
        var checkOut = $("#checkout").val();

        console.log(checkIn);


        if (!(checkIn.length === 0 && checkOut.length === 0)) {
            if (checkIn < checkOut) {
                gettingAvalibleRooms(checkIn, checkOut);
                //roomSelection.setup(bookedRooms);
                $("#book_display").show();
                $("#submitDates").show();
            } else {
                alert("check in date must be before check out date")
            }

        };

    }


    pub.setup = function () {
        $("#chooseRoom").hide();
        $("#submitDates").click(getData);


        //$("#submitDates").click(show());

    }
    return pub;

}());

$(document).ready(Book_xml_display.setup);
