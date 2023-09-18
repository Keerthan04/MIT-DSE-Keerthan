import mysql.connector
from tkinter import *
def Tablecreate():
    cn={'user':'Keerthan','password':'mice','database':'project','host':'Localhost','raise_on_warnings':True}
    cnn=mysql.connector.connect(**cn)
    cur=cnn.cursor()
    s="create table stock(ItemNo int,Itemname varchar(20),stk int)"
    cur.execute(s)
    s="create table transaction(ItemNo int,quantity int,Transtype varchar(20))"
    cur.execute(s)
    cur.close()
    print("Both tables created")


x=Tablecreate()




s="select * from stock"
        self.cur.execute(s)
        self.rec=self.cur.fetchall()
        if len(self.rec)>0:
            self.currec=0
            msg="%10s %20s %10s"%("ItemNo","Item Name","Stock")
            msg=msg+"\n------------------------------------------------------------------------------\n"
            r=self.rec[0]
            k="%10s %20s %10s\n"%(r[0],r[1],r[2])
            msg=msg+k
            self.lb4.config(text=msg)
        else:
            self.lb4.config(text="No Record")
            
            
            
s="select * from stock"
        self.cur.execute(s)
        self.rec=self.cur.fetchall()
        if len(self.rec)>0:
            self.currec=len(self.rec)-1
            msg="%10s %20s %10s"%("ItemNo","Item Name","Stock")
            msg=msg+"\n------------------------------------------------------------------------------\n"
            r=self.rec[len(self.rec)-1]
            k="%10s %20s %10s\n"%(r[0],r[1],r[2])
            msg=msg+k
            self.lb4.config(text=msg)
        else:
            self.lb4.config(text="No Record")