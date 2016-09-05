set serveroutput on
CREATE OR REPLACE PROCEDURE list(pn NUMBER)
AS
 cursor pc is
  select * from works_on where pno=pn;
 works pc%ROWTYPE;
 under EXCEPTION;

BEGIN
 FOR works IN pc LOOP
  IF works.hours<8.0 THEN
   RAISE under;
  END IF;
 DBMS_OUTPUT.PUT_LINE(works.essn ||'  '|| works.hours);
 END LOOP;
EXCEPTION
 WHEN under THEN
  DBMS_OUTPUT.PUT_LINE(' HORUS LESS THAN 8 ');
END;
/ 
