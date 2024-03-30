Set serveroutput on
Declare
  inputNum number(5) ;
  revNum number(5) :=0;
  lastDigit number(5);
Begin
  inputNum:=&inputNum;
  while inputNum>0 loop
    lastDigit:=MOD(inputNum,10);
    revNum:=(revNum*10)+lastDigit;
    inputNum:=FLOOR(inputNum/10);
  End loop;
  dbms_output.put_line('reversed num is:'|| revNum);
End;
/
  