package javaprojectfiles;
//Importing all necessary packages
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

//Creating a Score class by extending JFrame
public class Score extends JFrame implements ActionListener {
	//Declaring all necessary Components required
	JLabel label,Userinfo;JButton exit;
	
	//Creating a constructor and getting the username and score from the quiz windo class
	Score(String name,int score) {
		//getting images and setting logo
		ImageIcon icons=new ImageIcon("download.jpg");
		ImageIcon logo=new ImageIcon("MU.png");
		
		//Creating a Label for logo
		label=new JLabel(logo);
		label.setBounds(30, 0,logo.getIconWidth(),logo.getIconHeight());
		
		//Creating a Panel to add all the detials
		Userinfo=new JLabel("username");
		Userinfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Userinfo.setBounds(60,130, 300, 280);
        
        //Setting the Userinfo to show all the detials
        Userinfo.setText(
			"<html>"+
				"Student Detials" + "<br><br><br>" +
				"Name: "+name + "<br><br>" +
				"College: Manipal University-Manipal" + "<br><br>" +
				"Registration Number: 220968002" + "<br><br>" +
				"Department: DSE" + "<br><br>" +
				"Score: "+score+"/50"+ "<br><br>"+
			 "<html>"
        		);
		
        //creating exit button and adding the ActionListener
        exit=new JButton("Exit");
        exit.setBounds(150, 420, 120, 30);
        exit.setFocusable(false);
        exit.addActionListener(this);
        
        //Adding all the components to the frame and setting the frame properties
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("Manipal Academy of Higher Education-JAVA MISAC Result");
		this.setLayout(null);
		this.setBounds(500, 125, 400, 550);
		this.getContentPane().setBackground(Color.white);
		this.setIconImage(icons.getImage());
		this.add(label);
		this.add(Userinfo);
		this.add(exit);
		this.setResizable(false);
		this.setVisible(true);
	}
	//Implementing the actionPerformed method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit)//When the user clicks on exit button then closing the frame
		{
			this.dispose();
		}
		
	}

}
