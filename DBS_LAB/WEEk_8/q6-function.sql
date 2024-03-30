create or replace function email(empno in emp.empcode%type)
return varchar
is
email varchar(255) :=' ';
vname emp.name%type;

begin
select name into vname from emp where empcode=empno;
email:=concat(concat(concat(vname,'_'),empno),'@digisol.com');
return email;
end;
/ 
