import mysql.connector
from tkinter import *
class stock:
    def __init__(self):
        self.root1=Tk()
        self.root1.title("Stock Report")
        self.root1.geometry("900x900")
        self.lb1=Label(self.root1,text="Enter Item number")
        self.lb2=Label(self.root1,text="Enter Item name")
        self.lb3=Label(self.root1,text="Enter Item stock")
        self.lb4=Label(self.root1,text="",bg="yellow",fg="black")
        self.txt1=Entry(self.root1)
        self.txt2=Entry(self.root1)
        self.txt3=Entry(self.root1)
        self.b1=Button(self.root1,text="New",command=self.new)
        self.b2=Button(self.root1,text="Save",command=self.save)
        self.b3=Button(self.root1,text="Delete",command=self.delete)
        self.b4=Button(self.root1,text="Update",command=self.upd)
        self.b5=Button(self.root1,text="Show",command=self.show)
        self.b6=Button(self.root1,text="First",command=self.first)
        self.b7=Button(self.root1,text="Previous",command=self.prev)
        self.b8=Button(self.root1,text="Next",command=self.next)
        self.b9=Button(self.root1,text="Last",command=self.last)
        self.b10=Button(self.root1,text="Close",command=self.close)
        self.b11=Button(self.root1,text="Add Transaction",command=self.trans)
        self.b12=Button(self.root1,text="Home",command=self.home)
        self.lb1.place(x=10,y=20,width=100,height=30)
        self.lb2.place(x=10,y=60,width=100,height=30)
        self.lb3.place(x=10,y=100,width=100,height=30)
        self.lb4.place(x=320,y=20,width=500,height=400)
        self.txt1.place(x=120,y=20,width=100,height=30)
        self.txt2.place(x=120,y=60,width=100,height=30)
        self.txt3.place(x=120,y=100,width=100,height=30)
        self.b1.place(x=10,y=140,width=50,height=20)
        self.b2.place(x=70,y=140,width=50,height=20)
        self.b3.place(x=130,y=140,width=50,height=20)
        self.b4.place(x=190,y=140,width=50,height=20)
        self.b5.place(x=250,y=140,width=50,height=20)
        self.b6.place(x=10,y=170,width=50,height=20)
        self.b7.place(x=70,y=170,width=50,height=20)
        self.b8.place(x=130,y=170,width=50,height=20)
        self.b9.place(x=190,y=170,width=50,height=20)
        self.b10.place(x=250,y=170,width=50,height=20)
        self.b11.place(x=10,y=200,width=120,height=20)
        self.b12.place(x=140,y=200,width=50,height=20)
        self.cn={'user':'Keerthan','password':'mice','database':'project','host':'Localhost','raise_on_warnings':True}
        self.cnn=mysql.connector.connect(**self.cn)
        self.cur=self.cnn.cursor()
        s="select * from stock"
        self.cur.execute(s)
        self.rec=self.cur.fetchall()
        if len(self.rec)>0:
            self.currec=len(self.rec)-1
            self.show1()
        else:
            self.lb4.config(text="No Records yet")
        self.root1.mainloop()
    def new(self):
        self.txt1.delete(0,END)
        self.txt2.delete(0,END)
        self.txt3.delete(0,END)
        self.txt1.focus()
        self.lb4.config(text="")
    def save(self):
        if self.txt1.get()=="":
            self.lb4.config(text="please enter the item number")
            self.txt1.focus()
        elif self.txt2.get()=="":
            self.lb4.congig(text="please enter item name")
            self.txt2.focus()
        elif self.txt3.get()=="":
            self.lb4.config(text="please enter quantity of stock")
            self.txt3.focus()
        else:
            a=int(self.txt1.get())
            b=self.txt2.get()
            c=int(self.txt3.get())
            s="select * from stock where ItemNo=%s"%a
            self.cur.execute(s)
            rec=self.cur.fetchall()
            if len(rec)>0:
                self.lb4.config(text="Duplicate Item number found")
                self.txt1.focus()
            elif c<=0:
                self.lb4.config(text="Stock should be positive")
                self.txt3.focus()
            else:
                s="insert into stock values(%s,'%s',%s)"%(a,b,c)
                self.cur.execute(s)
                self.cnn.commit()
                s="select * from stock"
                self.cur.execute(s)
                self.rec=self.cur.fetchall()
                if len(self.rec)>0:
                    self.curec=len(self.rec)
                    self.show()
                    
                else:
                    self.lb4.config(text="No Records yet")
    def delete(self):
        if self.txt1.get()=="":
            self.lb4.config(text="Please Enter Item number")
            self.txt1.focus()
        else:
            a=int(self.txt1.get())
            s="select * from stock where ItemNo=%s"%a
            self.cur.execute(s)
            rec=self.cur.fetchall()
            if len(rec)>0:
                s="delete from stock where ItemNo=%s"%a
                self.cur.execute(s)
                self.cnn.commit()
                s="select * from stock"
                self.cur.execute(s)
                self.rec=self.cur.fetchall()
                if len(self.rec)>0:
                    self.currec=len(self.rec)
                    self.show()
                    
                else:
                    self.lb4.config(text="No Records yet")
            else:
                self.lb4.config(text="No Records found")
    def upd(self):
        if self.txt1.get()=="":
            self.lb4.config(text="please enter the item number")
            self.txt1.focus()
        elif self.txt2.get()=="":
            self.lb4.config(text="please enter item name")
            self.txt2.focus()
        elif self.txt3.get()=="":
            self.lb4.config(text="please enter quantity of stock")
            self.txt3.focus()
        else:
            a=int(self.txt1.get())
            b=self.txt2.get()
            c=int(self.txt3.get())
            s="select * from stock where ItemNo=%s"%a
            self.cur.execute(s)
            rec=self.cur.fetchall()
            if len(rec)>0:
                s="update stock set ItemNo=%s,Itemname='%s',stk=%s where ItemNo=%s"%(a,b,c,a)
                self.cur.execute(s)
                self.cnn.commit()
                s="select * from stock"
                self.cur.execute(s)
                self.rec=self.cur.fetchall()
                if len(self.rec)>0:
                    self.currec=len(self.rec)
                    self.show()
                    
                else:
                    self.lb4.config(text="No Records yet")
            else:
                self.lb4.config(text="No Records found")
    def show(self):
        s="select * from stock"
        self.cur.execute(s)
        self.rec=self.cur.fetchall()
        if len(self.rec)>0:
            msg="%10s %20s %10s"%("ItemNo","Item Name","Stock")
            msg=msg+"\n------------------------------------------------------------------------------\n"
            for i in range(0,len(self.rec)):
                r=self.rec[i]
                k="%10s %20s %10s\n"%(r[0],r[1],r[2])
                msg=msg+k
            self.lb4.config(text=msg)
        else:
            self.lb4.config(text="No Record")
    def show1(self):
        i=self.rec[self.currec]
        self.txt1.delete(0, END)
        self.txt1.insert(0,i[0])
        self.txt2.delete(0, END)
        self.txt2.insert(0,i[1])
        self.txt3.delete(0, END)
        self.txt3.insert(0,i[2])
        self.lb4.config(text="")
    def first(self):
        if len(self.rec)>0:
            self.currec=0
            self.show1()
    def prev(self):
        if len(self.rec)>0:
            if self.currec!=0:
                self.currec=self.currec-1
                self.show1()
        else:
            self.lb4.config(text="No Record")
    def next(self):
        if len(self.rec)>0:
            if self.currec<len(self.rec):
                self.currec=self.currec+1
                self.show1()
        else:
            self.lb4.config(text="No Record")
    def last(self):
        if len(self.rec)>0:
            self.currec=len(self.rec)-1
            self.show1()
    def close(self):
        self.root1.destroy()
    def trans(self):
        self.root1.destroy()
        x=transaction()
    def home(self):
        self.root1.destroy()
        x=gui()


class transaction:
        def __init__(self):
            self.root2=Tk()
            self.root2.title("Transaction Report")
            self.root2.geometry("900x900")
            self.lb1=Label(self.root2,text="Enter Item Number")
            self.lb2=Label(self.root2,text="Enter Item Quantity")
            self.lb3=Label(self.root2,text="Transaction type(add or remove)")
            self.lb4=Label(self.root2,text="",bg="yellow",fg="black")
            self.lb5=Label(self.root2,text="Transaction report status")
            self.lb6=Label(self.root2,text="Stock report status")
            self.lb7=Label(self.root2,text="",bg="yellow",fg="black")
            self.txt1=Entry(self.root2)
            self.txt2=Entry(self.root2)
            self.txt3=Entry(self.root2)
            self.b1=Button(self.root2,text="New",command=self.new)
            self.b2=Button(self.root2,text="Save",command=self.save)
            self.b5=Button(self.root2,text="Show",command=self.show)
            self.b6=Button(self.root2,text="First",command=self.first)
            self.b7=Button(self.root2,text="Previous",command=self.prev)
            self.b8=Button(self.root2,text="Next",command=self.next)
            self.b9=Button(self.root2,text="Last",command=self.last)
            self.b10=Button(self.root2,text="Close",command=self.close)
            self.b11=Button(self.root2,text="Add Stock",command=self.stock)
            self.b12=Button(self.root2,text="Home",command=self.home)
            self.lb1.place(x=10,y=20,width=100,height=30)
            self.lb2.place(x=10,y=60,width=100,height=30)
            self.lb3.place(x=10,y=100,width=200,height=30)
            self.lb4.place(x=320,y=20,width=500,height=300)
            self.lb5.place(x=520,y=20,width=150,height=30)
            self.lb6.place(x=125,y=320,width=150,height=30)
            self.lb7.place(x=10,y=340,width=500,height=300)
            self.txt1.place(x=120,y=20,width=100,height=30)
            self.txt2.place(x=120,y=60,width=100,height=30)
            self.txt3.place(x=220,y=100,width=100,height=30)
            self.b1.place(x=10,y=140,width=50,height=20)
            self.b2.place(x=70,y=140,width=50,height=20)
            self.b5.place(x=130,y=140,width=50,height=20)
            self.b10.place(x=190,y=170,width=50,height=20)
            self.b7.place(x=250,y=170,width=50,height=20)
            self.b8.place(x=10,y=170,width=50,height=20)
            self.b9.place(x=70,y=170,width=50,height=20)
            self.b6.place(x=130,y=170,width=50,height=20)
            self.b11.place(x=10,y=200,width=120,height=20)
            self.b12.place(x=140,y=200,width=50,height=20)
            self.cn={'user':'Keerthan','password':'mice','database':'project','host':'Localhost','raise_on_warnings':True}
            self.cnn=mysql.connector.connect(**self.cn)
            self.cur=self.cnn.cursor()
            s="select * from transaction"
            self.cur.execute(s)
            self.rec=self.cur.fetchall()
            if len(self.rec)>0:
                self.currec=len(self.rec)-1
                self.show1()
            else:
                self.lb4.config(text="No Records yet")
            self.stockshow()
            self.root2.mainloop()
        def new(self):
            self.txt1.delete(0,END)
            self.txt2.delete(0,END)
            self.txt3.delete(0,END)
            self.txt1.focus()
            self.lb4.config(text="")
        def save(self):
            if self.txt1.get()=="":
                self.lb4.config(text="please enter the item number")
                self.txt1.focus()
            elif self.txt2.get()=="":
                self.lb4.config(text="please enter quantity")
                self.txt2.focus()
            elif self.txt3.get()=="":
                self.lb4.config(text="please enter Transaction Type")
                self.txt3.focus()
            else:
                a=int(self.txt1.get())
                b=int(self.txt2.get())
                c=self.txt3.get()
                s="select * from transaction where ItemNo=%s"%a
                self.cur.execute(s)
                rec=self.cur.fetchall()
                m="select * from stock where ItemNo=%s"%a
                self.cur.execute(m)
                rec1=self.cur.fetchall()
                i=rec1[0]
                if b<=0:
                    self.lb4.config(text="Stock should be positive")
                    self.txt3.focus()
                elif b>=(i[2]) and (c in"removeRemove" ):
                    self.lb4.config(text="There is no enough stock to meet the requirement")
                elif b<=(i[2]) and (c in "removeRemove"):
                    m="select * from stock where ItemNo=%s"%a
                    self.cur.execute(m)
                    rec1=self.cur.fetchall()
                    currec=len(rec1)-1
                    i=rec1[currec]
                    m="update stock set stk=%s where ItemNo=%s"%((i[2]-b),a)
                    self.cur.execute(m)
                    self.cnn.commit()
                    self.stockshow()
                    s="insert into transaction values(%s,%s,'%s')"%(a,b,c)
                    self.cur.execute(s)
                    self.cnn.commit()
                    s="select * from transaction"
                    self.cur.execute(s)
                    self.rec=self.cur.fetchall()
                    if len(self.rec)>0:
                        self.curec=len(self.rec)
                        self.show()
                        
                    else:
                        self.lb4.config(text="No Records yet of the item in stock")
                else:
                    m="select * from stock where ItemNo=%s"%a
                    self.cur.execute(m)
                    rec1=self.cur.fetchall()
                    currec=len(rec1)-1
                    i=rec1[currec]
                    m="update stock set stk=%s where ItemNo=%s"%((i[2]+b),a)
                    self.cur.execute(m)
                    self.cnn.commit()
                    self.stockshow()
                    s="insert into transaction values(%s,%s,'%s')"%(a,b,c)
                    self.cur.execute(s)
                    self.cnn.commit()
                    s="select * from transaction"
                    self.cur.execute(s)
                    self.rec=self.cur.fetchall()
                    if len(self.rec)>0:
                        self.curec=len(self.rec)
                        self.show()
                        
                    else:
                        self.lb4.config(text="No Records yet")
        def stockshow(self):
            s="select * from stock"
            self.cur.execute(s)
            self.rec=self.cur.fetchall()
            if len(self.rec)>0:
                msg="%10s %20s %10s"%("ItemNo","Item Name","Stock")
                msg=msg+"\n------------------------------------------------------------------------------\n"
                for i in range(0,len(self.rec)):
                    r=self.rec[i]
                    k="%10s %20s %10s\n"%(r[0],r[1],r[2])
                    msg=msg+k
                self.lb7.config(text=msg)
            else:
                self.lb7.config(text="No Record")
        def show1(self):
            i=self.rec[self.currec]
            self.txt1.delete(0, END)
            self.txt1.insert(0,i[0])
            self.txt2.delete(0, END)
            self.txt2.insert(0,i[1])
            self.txt3.delete(0, END)
            self.txt3.insert(0,i[2])
            self.lb4.config(text="")

        def show(self):
            s="select * from transaction"
            self.cur.execute(s)
            self.rec=self.cur.fetchall()
            if len(self.rec)>0:
                msg="%10s %20s %10s"%("ItemNo","Quantity","Transaction Type")
                msg=msg+"\n------------------------------------------------------------------------------\n"
                for i in range(0,len(self.rec)):
                    r=self.rec[i]
                    k="%10s %20s %10s\n"%(r[0],r[1],r[2])
                    msg=msg+k
                self.lb4.config(text=msg)
            else:
                self.lb4.config(text="No Record")
        
        def first(self):
            if len(self.rec)>0:
                self.currec=0
                self.show1()
        def prev(self):
            if len(self.rec)>0:
                if self.currec!=0:
                    self.currec=self.currec-1
                    self.show1()
                else:
                    self.lb4.config(text="No Record")
        def next(self):
            if len(self.rec)>0:
                if self.currec<len(self.rec):
                    self.currec=self.currec+1
                    self.show1()
                else:
                    self.lb4.config(text="No Record")
        def last(self):
            if len(self.rec)>0:
                self.currec=len(self.rec)-1
                self.show1()
        def close(self):
            self.root2.destroy()
        def stock(self):
            self.root2.destroy()
            x=stock()
        def home(self):
            self.root2.destroy()
            x=gui()
class gui:
    def __init__(self):
        self.root=Tk()
        self.root.title("Stock and Transaction Report")
        self.root.geometry("900x900")
        self.b1=Button(self.root,text="Stock Report",command=self.stk)
        self.b2=Button(self.root,text="Transaction Report",command=self.transction)
        self.b3=Button(self.root,text="Close window",command=self.quit)
        self.lb1=Label(self.root,text="Click on button to view")
        self.lb1.place(x=10,y=20,width=300,height=100)
        self.b1.place(x=10,y=140,width=100,height=20)
        self.b2.place(x=130,y=140,width=150,height=20)
        self.b3.place(x=300,y=140,width=100,height=20)
        self.root.mainloop()
    def stk(self):
        x=stock()
    def transction(self):
        x=transaction()
    def quit(self):
        self.root.destroy()

x=gui()