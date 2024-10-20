CREATE OR REPLACE FUNCTION calculate_incentive(project_id IN prj_details.prjid%type) RETURN NUMBER IS
    total_incentive NUMBER := 0;
    cursor emp is SELECT empcode, rating FROM work_exp WHERE prjid = project_id;
BEGIN
    FOR emp_rec IN emp LOOP
        IF emp_rec.rating = 'A' THEN
            total_incentive := total_incentive + 30000;
        ELSIF emp_rec.rating = 'B' THEN
            total_incentive := total_incentive + 20000;
        ELSIF emp_rec.rating = 'C' THEN
            total_incentive := total_incentive + 10000;
        END IF;
    END LOOP;
    
    RETURN total_incentive;
END;
/
