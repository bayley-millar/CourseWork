/**
 * Module pattern for Booking and Validation functions
 */
var BookingValidation = (function () {
    "use strict";

    var pub;


    pub = {};

    /**
     * Check to see if a string is empty.
     *
     * Leading and trailing whitespace are ignored.
     * @param textValue The string to check.
     * @return True if textValue is not just whitespace, false otherwise.
     */
    function checkNotEmpty(textValue) {
        return textValue.trim().length > 0;
    }

    function storeBooking() {
        var cart = {};
        cart.checkIn = $("#datepickerIn").val();
        cart.checkOut = $("#datepickerOut").val();
        cart.guestName = $("#guestName").val();
        cart.roomNum = $("#chooseRoom").val();

        var booking_info;
        var myitems = Cookie.get("cart");
        if (myitems === null) {
            booking_info = [];
        } else {
            booking_info = JSON.parse(myitems);
        }
        booking_info.push(cart);
        Cookie.set("cart", JSON.stringify(booking_info));

    }

    /**
     * Check if a key-press is a digit or not
     *
     * @param textValue The event representing the key-press
     * @return true if key is a digit, false otherwise
     */
    function checkKeyIsDigit(textValue) {
        if (textValue.which !== 46 && textValue.which > 31 && (textValue.which < 48 || textValue.which > 57) && textValue.which !== 32) {
            return false;
        }
        return true;
    }

    /**
     * Check to see if the Guest Name input contains anything other than letters and the special characters "-. ".
     * ASCII character codes 97 - 122 are a-z, 65 - 90 are A-Z, 45 is -, 46 is . and 32 is space.
     *
     * @param textValue The string to check.
     * @return false if the textValue input isn't one of the accepted characters, true if it is, in which case the input is allowed.
     */
    function checkName(textValue) {
        if (((textValue.which < 97 || textValue.which > 122) && (textValue.which < 65 || textValue.which > 90)) &&
            ((textValue.which !== 45 && textValue.which !== 46) && (textValue.which !== 32 && textValue.which !== 8))) {
            return false;
        }
        return true;
    }

    /**
     * Check to see if the guest name appears valid.
     *
     * The only check here is that the delivery name must not be blank.
     *
     * @param guestName The string to check
     * @return false if the guest name is empty, true otherwise
     */
    function checkGuestName(guestName, nameError) {
        if (!checkNotEmpty(guestName)) {
            nameError.push('<p id="nameError">Please enter your name</p>');
        } else {
            $("#nameError").remove();
        }
    }


    /**
     * Checks that the check-in date isn't empty
     *
     *
     * @param checkInDate the check-in date field
     * @param messages Array of error messages (may be modified)
     * @return false if the check-in date is empty, true otherwise
     */
    function checkCheckInDate(checkInDate, checkInError) {
        if (!checkNotEmpty(checkInDate)) {
            $("#checkInError").remove();
            checkInError.push('<p id="checkInError">Please enter a desired check - in date </p>');
        } else {
            $("#checkInError").remove();
        }
    }

    /**
     * Checks that the check-out date isn't empty
     *
     *
     * @param checkOutDate the check-out date field
     * @param messages Array of error messages (may be modified)
     * @return false if the check-out date is empty, true otherwise
     */
    function checkCheckOutDate(checkOutDate, checkOutError) {
        if (!checkNotEmpty(checkOutDate)) {
            $("#checkOutError").remove();
            checkOutError.push('<p id="checkOutError">Please enter a desired check-out date</p>');
        } else {
            $("#checkOutError").remove();
        }
    }

    /**
     * Validate the booking form
     *
     * Check the form entries before submission
     *
     * @return False, because server-side form handling is not implemented. Eventually will return true on success and false otherwise.
     */
    function validateBooking() {
        var guestName, nameError;

        // Default assumption is that everything is good, and no messages
        nameError = [];

        // Name validation
        guestName = $("#guestName").val();
        checkGuestName(guestName, nameError);

        if (nameError.length === 0) {
            if ($("#nameError").length !== 0) {
                $("#nameError").remove();
            }
            storeBooking();
            return true;
        } else {
            if (checkGuestName !== true && $("#nameError").length === 0) {
                $("#guestName").after(nameError);
            }
            return false;
        }
    }

    function validateDate() {
        var checkInDate, checkOutDate, checkInError, checkOutError;

        // Default assumption is that everything is good, and no messages
        checkInError = [];
        checkOutError = [];

        checkInDate = $("#datepickerIn").val();
        checkCheckInDate(checkInDate, checkInError);

        checkOutDate = $("#datepickerOut").val();
        checkCheckOutDate(checkOutDate, checkOutError);

        if (checkInError.length === 0 && checkOutError.length === 0) {

            return true;
        } else {
            if (checkCheckInDate !== true) {
                $("#datepickerIn").after(checkInError);
            }
            if (checkCheckOutDate !== true) {
                $("#datepickerOut").after(checkOutError);
            }
            return false;
        }
    }

    /**
     * Setup function for validation.
     *
     * Adds validation to the form on submission.
     * Note that if the validation fails (returns false) then the form is not submitted.
     */
    pub.setup = function () {

        $("#findRoom").click(validateDate);
        $("#guestName").keypress(checkName);
        $("#bookRoom").click(validateBooking);
        $("#roomNO").keypress(checkKeyIsDigit);
    };


    return pub;
}());

$(document).ready(BookingValidation.setup);
