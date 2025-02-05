create or replace trigger t3
before update of actual_end_date,actual_budget on prj_details
for each row
declare
    valid_budget boolean;
    valid_date boolean;

begin
   
    if updating('actual_budget') then
        if (:old.actual_budget *1.15) < :new.actual_budget then
            valid_budget := false;
        else 
            valid_budget := true;
        end if;
    end if;
    if updating('actual_end_date') then
        if months_between(:new.actual_end_date, :old.actual_end_date) > 3 then
            valid_date := false;
        else
            valid_date := true;
        end if;
    end if;
    if valid_budget = false or valid_date = false then
        raise_application_error(-20001,'Need to take Approval through proper channel for updation ');
    end if;
end;
/

//output
update prj_details set actual_budget=50000000,actual_end_date = TO_DATE('20-FEB-2023', 'DD-MON-YY') where prjid='P1'
       *
ERROR at line 1:
ORA-20001: Need to take Approval through proper channel for updation
ORA-06512: at "SYSTEM.T3", line 22
ORA-04088: error during execution of trigger 'SYSTEM.T3'