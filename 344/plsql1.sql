set serveroutput on
DECLARE
 CURSOR dcursor IS
  SELECT * FROM dependent;
 dep dcursor%ROWTYPE;
BEGIN
 FOR dep IN dcursor LOOP
  DBMS_OUTPUT.PUT_LINE( dep.dependent_name ||' '|| dep.relationship);
 END LOOP;
END;
/
 
  
