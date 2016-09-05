var DatePicker = (function () {
    "use strict";
    var pub = {};

    pub.setup = function () {
        $(document).ready(
            function () {
                $("#checkin").datepicker({
                    dateFormat: 'dd/mm/yy',
                    minDate: 0

                });
                $("#checkout").datepicker({
                    dateFormat: 'dd/mm/yy',
                    minDate: 1
                });
            }

        );
    };
    return pub;
}());

$(document).ready(DatePicker.setup);
