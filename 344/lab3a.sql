 table lab3a;

create table lab3a
(d DATE,
t TIMESTAMP);

INSERT INTO lab3a VAlUES
(TO_DATE('01-May-2001', 'dd-mon-yyyy'),
('25-JUN-02 09:39:16.78'));

INSERT INTO lab3a VAlUES
(TO_DATE('09-Nov-2001', 'dd-mon-yyyy'),
('26-JUN-02 09:39:16.78'));

INSERT INTO lab3a VAlUES
(TO_DATE('21-Aug-2001', 'dd-mon-yyyy'),
('27-JUN-02 09:39:16.78'));

INSERT INTO lab3a VAlUES
(TO_DATE('22-Mar-2001', 'dd-mon-yyyy'),
('28-JUN-02 09:39:16.78'));

commit;

SELECT *  FROM lab3a;

