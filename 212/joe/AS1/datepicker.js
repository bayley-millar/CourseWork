var DatePicker = (function () {
    "use strict";
    var pub = {};
    /* Sets up the date picker and presents date in appropriate format*/
    pub.setup = function () {
        $(document).ready(
            function () {
                $("#datepickerIn").datepicker({
                    dateFormat: 'dd/mm/yy',
                    minDate: 0

                });
                $("#datepickerOut").datepicker({
                    dateFormat: 'dd/mm/yy',
                    minDate: 1
                });
            }

        );
    };
    return pub;
}());

$(document).ready(DatePicker.setup);
