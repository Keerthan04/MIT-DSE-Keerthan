package javaprojectfiles;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Score extends JFrame implements ActionListener {
	JLabel label,Userinfo;JButton exit;
	
	Score(String name,int score) {
		ImageIcon icons=new ImageIcon("download.jpg");
		ImageIcon logo=new ImageIcon("MU.png");
		
		label=new JLabel(logo);
		label.setBounds(30, 0,logo.getIconWidth(),logo.getIconHeight());
		
		Userinfo=new JLabel("username");
		Userinfo.setFont(new Font("Tahoma", Font.PLAIN, 16));
        Userinfo.setBounds(60,130, 300, 280);
        
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
		
        exit=new JButton("Exit");
        exit.setBounds(150, 420, 120, 30);
        exit.setFocusable(false);
        exit.addActionListener(this);
        
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
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==exit)
		{
			this.dispose();
		}
		
	}
	public static void main(String[] args) {
		new Score("",0);

	}
	

}
