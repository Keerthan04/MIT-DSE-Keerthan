--whenever this replace is there it acts only when same trigger name on same table if diff table then cant,one has to be dropped
create or replace trigger t4 
before delete on skill
for each row
declare
    count_skill number(10);
    highest_skill_exp emp_skill.skill_experience%type;
begin
    select count(empno) into count_skill from  emp_skill where skillid = :old.skillid;
    if count_skill = 1 then
        raise_application_error(-20006,'only one employee corresponding to skill so cant delete the record');
    elsif count_skill > 1 then
        select max(skill_experience) into highest_skill_exp from emp_skill where skillid = :old.skillid ;

        for emp_rec in (
            select empno 
            from emp_skill 
            where skillid = :old.skillid 
            and skill_experience < highest_skill_exp
            and rownum < count_skill) loop
             --row num to handle if two have same max skill experience
                delete from emp_skill where empno = emp_rec.empno;
        end loop;
    end if;
end;
/
