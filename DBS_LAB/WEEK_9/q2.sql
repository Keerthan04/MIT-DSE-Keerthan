create or replace trigger t2
before insert or update of lead_by_empcode on prj_details
for each row

declare
    vdesignation emp.designation%type;
    vskillexp work_exp.work_experience%type;
begin
    -- Check if it's an update and get the new employee code
    if updating('lead_by_empcode') then
        -- Check if the new employee code is valid
        select e.designation, sum(w.work_experience)
        into vdesignation, vskillexp
        from emp e
        join work_exp w on e.empcode = w.empcode
        where e.empcode = :new.lead_by_empcode
        group by e.designation;

        if (vdesignation in ('PROJECT LEADER', 'PROJECT MANAGER')) and vskillexp >= 18 then
            -- Employee is valid
            null;
        else
            -- Employee is not valid, raise an error
            raise_application_error(-20005, 'The employee with this employee code cannot lead a project as per company policy.');
        end if;
    else
        -- Check if it's an insert operation and get the employee code
        select e.designation, sum(w.work_experience)
        into vdesignation, vskillexp
        from emp e
        inner join work_exp w on e.empcode = w.empcode
        where e.empcode = :new.lead_by_empcode
        group by e.designation;

        if (vdesignation in ('PROJECT LEADER', 'PROJECT MANAGER')) and vskillexp >= 18 then
            -- Employee is valid
            null;
        else
            -- Employee is not valid, raise an error
            raise_application_error(-20005, 'The employee with this employee code cannot lead a project as per company policy.');
        end if;
    end if;
end;
/

//output
update prj_details set lead_by_empcode = 111 where lead_by_empcode = 102;
update prj_details set lead_by_empcode = 111 where lead_by_empcode = 102
       *
ERROR at line 1:
ORA-20005: The employee with this employee code cannot lead a project as per
company policy.
ORA-06512: at "SYSTEM.T2", line 20
ORA-04088: error during execution of trigger 'SYSTEM.T2'