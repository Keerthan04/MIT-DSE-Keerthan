package javaprojectfiles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class quizWindow extends JFrame implements ActionListener{
	ImageIcon icons,logo;
	JRadioButton opt1,opt2,opt3,opt4;
	ButtonGroup group;
	JLabel label,question,RUles,Userinfo;
	JButton next,submit;
	JPanel rules,Header,main;
	
	String questions[][]=new String[5][5];{
	questions[0][0] = "1.Which is used to find and fix bugs in the Java programs.?";
    questions[0][1] = "JVM";
    questions[0][2] = "JDB";
    questions[0][3] = "JDK";
    questions[0][4] = "JRE";

    questions[1][0] = "2.What is the return type of the hashCode() method in the Object class?";
    questions[1][1] = "int";
    questions[1][2] = "Object";
    questions[1][3] = "long";
    questions[1][4] = "void";

    questions[2][0] = "3.Which package contains the Random class?";
    questions[2][1] = "java.util package";
    questions[2][2] = "java.lang package";
    questions[2][3] = "java.awt package";
    questions[2][4] = "java.io package";

    questions[3][0] = "4.An interface with no fields or methods is known as?";
    questions[3][1] = "Runnable Interface";
    questions[3][2] = "Abstract Interface";
    questions[3][3] = "Marker Interface";
    questions[3][4] = "CharSequence Interface";

    questions[4][0] = "5.In which memory a String is stored, when we create a string using new operator?";
    questions[4][1] = "Stack";
    questions[4][2] = "String memory";
    questions[4][3] = "Random storage space";
    questions[4][4] = "Heap memory";
	}
	String answers[][]=new String[5][2];{
	answers[0][1] = "JDB";
    answers[1][1] = "int";
    answers[2][1] = "java.util package";
    answers[3][1] = "Marker Interface";
    answers[4][1] = "Heap memory";}
	
	String useranswers[][] = new String[5][1];
	static int count=0;
	int score=0;String username;
	quizWindow(String name)
	{
		username=name;
		int ind=username.indexOf('@');
		username=username.substring(0,ind);
		ImageIcon icons=new ImageIcon("download.jpg");
		ImageIcon logo=new ImageIcon("m.jpg");
		label=new JLabel(logo);
		label.setBounds(90, 0,logo.getIconWidth(),logo.getIconHeight());
		
		Header=new JPanel();
		Header.setBounds(0,0,1000,logo.getIconHeight());
		Header.setBackground(Color.orange);
		Header.add(label);
		
		question=new JLabel();
		question.setBounds(150,200,700,100);
		question.setFont(new Font("Peterdraw",Font.BOLD,16));
		
		main=new JPanel();
		main.setBounds(100,logo.getIconHeight()+10,logo.getIconWidth() ,400);
		main.setBackground(Color.white);
		
		rules=new JPanel();
		rules.setBounds(600, 280, 350, 350);
		rules.setBackground(new Color(255,255,255));
		rules.setBorder(BorderFactory.createEtchedBorder());
		rules.setLayout(null);
		rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
		RUles=new JLabel();
		RUles.setBounds(20, 5, 700, 350);
		RUles.setFont(new Font("Tahoma", Font.PLAIN, 14));
        RUles.setText(
            "<html>"+ 
            	"READ THE RULES BEFORE STARTING THE QUIZ!!" + "<br><br>" +
				"QUIZ RULES" + "<br><br>" +
                "1.All questions are compulsory." + "<br><br>" +
                "2.Each question carries 10 points." + "<br><br>" +
                "3.There is no time limit for the quiz." + "<br><br>" +
                "4.You are not allowed to use any resources." + "<br><br>" +
                "5.You are not allowed to communicate with anyone." + "<br><br>" +
                "6.Any attempt to cheat will result in disqualification." + "<br><br>"+
                
            "<html>"
        );
        rules.add(RUles);
		
        Userinfo=new JLabel(username);
		Userinfo.setFont(new Font("Tahoma", Font.PLAIN, 13));
        Userinfo.setBounds(785, 190, 190, 80);
        Userinfo.setBorder(BorderFactory.createLineBorder(Color.black));
        Userinfo.setText(
			"<html>"+
				"Student Detials" + "<br>" +
				"Name: "+username + "<br>" +
				"Registration Number: 220968002" + "<br>" +
			 "<html>"
        		);
		opt1=new JRadioButton("Option 1");
		opt1.setBounds(150,300,200,30);
		opt1.setFocusable(false);
		opt1.setBackground(Color.white);
		this.add(opt1);

		opt2=new JRadioButton("Option 2");
		opt2.setBounds(150,350,200,30);
		opt2.setFocusable(false);
		opt2.setBackground(Color.white);
		this.add(opt2);
		
		opt3=new JRadioButton("Option 3");
		opt3.setBounds(150,400,200,30);
		opt3.setFocusable(false);
		opt3.setBackground(Color.white);
		this.add(opt3);
		
		opt4=new JRadioButton("Option 4");
		opt4.setBounds(150,450,200,30);
		opt4.setFocusable(false);
		opt4.setBackground(Color.white);
		this.add(opt4);
		
		next=new JButton("NEXT");
		next.setBounds(220, 500, 130, 30);
		next.setFocusable(false);
		next.setFont(new Font(null,Font.ITALIC,15));
		next.setBorder(BorderFactory.createEtchedBorder());
		next.addActionListener(this);
		this.add(next);
		
		submit=new JButton("SUBMIT");
		submit.setBounds(420, 500, 130, 30);
		submit.setFocusable(false);
		submit.setFont(new Font(null,Font.ITALIC,15));
		submit.setBorder(BorderFactory.createEtchedBorder());
		submit.addActionListener(this);
		this.add(submit);
		submit.setEnabled(false);
		group=new ButtonGroup();
		group.add(opt1);
		group.add(opt2);
		group.add(opt3);
		group.add(opt4);
		
		start(count);
		this.add(rules);
		this.add(question);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Manipal Academy of Higher Education-JAVA MISAC");
		this.setLayout(null);
		this.setBounds(200, 50, 1000, 650);
		this.getContentPane().setBackground(Color.white);
		this.setIconImage(icons.getImage());
		this.add(Header);
		this.add(Userinfo);
		this.add(main);
		this.setResizable(false);
		this.setVisible(true);
	}
	public void start(int count)
	{
		question.setText(questions[count][0]);
		opt1.setText(questions[count][1]);
		opt1.setActionCommand(questions[count][1]);
		opt2.setText(questions[count][2]);
		opt2.setActionCommand(questions[count][2]);
		opt3.setText(questions[count][3]);
		opt3.setActionCommand(questions[count][3]);
		opt4.setText(questions[count][4]);
		opt4.setActionCommand(questions[count][4]);
		group.clearSelection();
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==next)
		{
			if(group.getSelection()==null) {
				JOptionPane.showMessageDialog(null,"Please select a option first before clicking next or submit");
			}
			else
			{
				int ans=JOptionPane.showConfirmDialog(null,"Once pressed next, you cannot go back?\nDo You Want to Continue","Submit Answer",JOptionPane.YES_NO_OPTION);
				useranswers[count][0] = group.getSelection().getActionCommand();
	            
	            
	            if (count == 3) {
	                next.setEnabled(false);
	                submit.setEnabled(true);
		            }
		         
		            
				if(ans==JOptionPane.YES_OPTION && group.getSelection()!=null) {
					count++;
					start(count);
				}
			}
			
				
		}
		if(e.getSource()==submit)
		{
			if(group.getSelection()==null) {
				JOptionPane.showMessageDialog(null,"Please select a option first before clicking next or submit");
			}
			else
			{
				int subans=JOptionPane.showConfirmDialog(null,"Do You Want to Submit the quiz","Submit Answer",JOptionPane.YES_NO_OPTION);
				useranswers[count][0] = group.getSelection().getActionCommand();
				for (int i = 0; i < useranswers.length; i++) {
					if (useranswers[i][0].equals(answers[i][1])) {
						score += 10;
					} else {
						score += 0;
                }
				}
				if(subans==JOptionPane.YES_OPTION && group.getSelection()!=null) {
					JOptionPane.showMessageDialog(null,"Thank you for taking the quiz,All the Best for Results");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
					this.dispose();
		            new Score(username, score);
				}
            }
            
		}
		
	}
	public static void main(String[] args)
	{
		new quizWindow("");
	}
	
}
