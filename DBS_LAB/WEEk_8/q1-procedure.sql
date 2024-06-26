create or replace procedure acc(
acc_no in varchar2,
with_amu in number,
bal in out number,
new_bal out number)
is

begin
select balance into bal from account where account_number=acc_no;

new_bal:= bal-with_amu;
case 
when new_bal >1000 then
update account set balance=new_bal where account_number=acc_no;
dbms_output.put_line('current balance:'||bal);
dbms_output.put_line('withdrawal of '||with_amu || 'is successful');
dbms_output.put_line('updated current balance ' || new_bal);

when new_bal <=1000 then
dbms_output.put_line('current balance:'||bal);
dbms_output.put_line('insufficient fund to withdraw, try with lesser withdrawal amount');
end case;

end;
/