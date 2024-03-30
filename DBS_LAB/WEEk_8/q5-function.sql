create or replace function phone(phone_code in varchar) 
return varchar 
is
code varchar(255) := concat(phone_code,'%'); 
names varchar(255) :=' ';
cursor clientphone is select name from client where phone like code;//so if we have a string like that we do then direct can be used

begin 
for cli_rec in clientphone loop
  names:= concat(concat(names,cli_rec.name),',');
end loop;
return names;

end;
/