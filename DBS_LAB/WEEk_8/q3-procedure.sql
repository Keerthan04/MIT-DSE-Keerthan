CREATE OR REPLACE PROCEDURE addbud(
    project_id IN prj_details.prjid%TYPE,
    additional_budget OUT NUMBER
) IS
    vadd_days NUMBER;
    vend_date prj_details.end_date%TYPE;
    vactual_end_date prj_details.actual_end_date%TYPE;
    vperday_cost NUMBER;
    vbudget_allocated prj_details.budget_allocated%TYPE;
    vduration NUMBER;
    vstart_date prj_details.start_date%TYPE;
BEGIN
    SELECT end_date, actual_end_date, budget_allocated, start_date
    INTO vend_date, vactual_end_date, vbudget_allocated, vstart_date
    FROM prj_details
    WHERE prjid = project_id;

    vadd_days := ROUND(months_between(vactual_end_date, vend_date) * 30, 0);//requires date only so dont add to char when selecting as it does to string and all if string shd be used in this then shd be default format so

    vduration := ROUND(months_between(vend_date, vstart_date) * 30, 0);
    
    IF vduration != 0 THEN
        vperday_cost := ROUND(vbudget_allocated / vduration, 0);
    ELSE
        vperday_cost := 0;
    END IF;
    
    additional_budget := vadd_days * vperday_cost;
END;
/
