create or replace trigger t1
before update of salary on emp
for each row

declare
increment number(10);
designation emp.designation%type :=:old.designation;
min_salary number(10);
max_salary number(10);

begin
increment:=:new.salary-:old.salary;
if increment<0 then raise_application_error(-20001,'Increment cant be negative');
end if;

case designation
    when 'DEVELOPER' then
       min_salary := 97000;
       max_salary := 120000;
        if increment>1000 then
            raise_application_error(-20002, 'Increment exceeds allowed limit for this designation.');
        end if;
        if  :new.salary < min_salary or :new.salary > max_salary then
            raise_application_error(-20003, 'Updated salary is not within the valid range for this designation.');
        end if;
    when 'PROJECT LEADER' then
        min_salary := 110000;
        max_salary := 140000;
        if increment>2000 then
            raise_application_error(-20002, 'Increment exceeds allowed limit for this designation.');
        end if;
        if  :new.salary < min_salary or :new.salary > max_salary then
            raise_application_error(-20003, 'Updated salary is not within the valid range for this designation.');
        end if;
    when 'PROJECT MANAGER' then
        min_salary := 120000;
        max_salary := 160000;
        if increment>3000 then
            raise_application_error(-20002, 'Increment exceeds allowed limit for this designation.');
        end if;
        if  :new.salary < min_salary or :new.salary > max_salary then
            raise_application_error(-20003, 'Updated salary is not within the valid range for this designation.');
        end if;
    when 'TECHNICAL HEAD' then
        min_salary := 140000;
        max_salary := 200000;
        if increment>3000 then
            raise_application_error(-20002, 'Increment exceeds allowed limit for this designation.');
        end if;
        if  :new.salary < min_salary or :new.salary > max_salary then
            raise_application_error(-20003, 'Updated salary is not within the valid range for this designation.');
        end if;
    when 'PROJECT DIRECTOR' then
        min_salary := 210000;
        max_salary := 270000;
        if increment>10000 then
            raise_application_error(-20002, 'Increment exceeds allowed limit for this designation.');
        end if;
        if  :new.salary < min_salary or :new.salary > max_salary then
            raise_application_error(-20003, 'Updated salary is not within the valid range for this designation.');
        end if;
    when 'CEO' then
        min_salary := 220000;
        max_salary := 300000;
        if increment>20000 then
            raise_application_error(-20002, 'Increment exceeds allowed limit for this designation.');
        end if;
        if  :new.salary < min_salary or :new.salary > max_salary then
            raise_application_error(-20003, 'Updated salary is not within the valid range for this designation.');
        end if;
end case;
end;
/

//output
 update emp set salary=133000 where empcode=101;
update emp set salary=133000 where empcode=101
       *
ERROR at line 1:
ORA-20002: Increment exceeds allowed limit for this designation.
ORA-06512: at "SYSTEM.T1", line 26
ORA-04088: error during execution of trigger 'SYSTEM.T1'