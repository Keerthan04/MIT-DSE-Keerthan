
package javaprojectfiles;
//Importing all necessary packages
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Desktop;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.border.LineBorder;
//Creating a login form class by extending JFrame
public class LoginForm extends JFrame implements ActionListener, ItemListener{
	//Declaring all necessary Components required
	JPanel left;JLabel User;JLabel Pass;
	JPanel right;JLabel Message;JButton Login,Reset;
	JLabel logo;JLabel wel;JLabel login;JLabel n;
	JTextField username;JPasswordField password;
	JToggleButton showPassword;
	JLabel createAccountLabel = new JLabel("Dont have an account?Create");
	//Constructor of the loginform class
	LoginForm()
	{
		//Creating image icon 
		ImageIcon icon=new ImageIcon("download.jpg");
		ImageIcon user=new ImageIcon("username.png");
		ImageIcon pass=new ImageIcon("password.png");
		
		//new panels left and right
		left=new JPanel();
		left.setBackground(new Color(255,255,255));
		left.setBounds(0, 0, 450, 500);
		this.add(left);
		right=new JPanel();
		right.setBackground(new Color(255,128,0));
		right.setBounds(450, 0, 550, 500);
		this.add(right);
		left.setLayout(null);
		right.setLayout(null);
		
		//Adding logo on the left panel
		logo=new JLabel();
		logo.setForeground(new Color(255,128,0));
		logo.setBounds(110,100,icon.getIconWidth(),icon.getIconHeight());
		logo.setIcon(icon);
		left.add(logo);
		
		//new labels on left
		wel=new JLabel();
		wel.setText("WELCOME TO MANIPAL ACADEMY OF HIGHER EDUCATION");
		wel.setBounds(30,30,400,50);
		wel.setFont(new Font("Peterdraw",Font.BOLD,13));
		left.add(wel);
		
		login=new JLabel();
		login.setText("Login with MAHE Microsoft Account");
		login.setBounds(45,350,400,50);
		login.setFont(new Font("Peterdraw",Font.BOLD,20));
		left.add(login);
		
		//new components on right
		n=new JLabel();
		n.setText("LOGIN");
		n.setBounds(210,40,150,50);
		n.setFont(new Font("ILOTT-TYPE",Font.BOLD,40));
		n.setBackground(Color.WHITE);
		n.setForeground(Color.WHITE);
		right.add(n);
		
		User=new JLabel();
		User.setIcon(user);
		User.setBounds(70,110,user.getIconWidth(),user.getIconHeight());
		right.add(User);
		
		Pass=new JLabel();
		Pass.setIcon(pass);
		Pass.setBounds(70,190,pass.getIconWidth(),pass.getIconHeight());
		right.add(Pass);
		
		username=new JTextField();//username textfield
		username.setBounds(120, 120, 300, 40);
		username.setBackground(Color.white);
		username.setFont(new Font("ILOTT-TYPE",Font.PLAIN,20));
		right.add(username);
		
		password=new JPasswordField();//password field
		password.setBounds(120, 200, 300, 40);
		password.setBackground(Color.white);
		password.setEchoChar('*');
		password.setFont(new Font(null,Font.PLAIN,20));
		right.add(password);
		
		Message=new JLabel();//show error message
		Message.setBounds(140,245,350,20);
		Message.setForeground(Color.RED);
		Message.setFont(new Font(null,Font.ITALIC,15));
		right.add(Message);
		
		Login=new JButton("Login");//login button
		Login.setBounds(130,300,120,40);
		Login.setFocusable(false);
		Login.addActionListener(this);
		Login.setBackground(Color.white);
		Login.setFont(new Font(null,Font.ITALIC,15));
		Login.setBorder(BorderFactory.createEtchedBorder());
		right.add(Login);
		
		Reset=new JButton("Reset");//reset button
		Reset.setBounds(300,300,120,40);
		Reset.setFocusable(false);
		Reset.addActionListener(this);
		Reset.setBackground(Color.white);
		Reset.setFont(new Font(null,Font.ITALIC,15));
		Reset.setBorder(BorderFactory.createEtchedBorder());
		right.add(Reset);
		
		showPassword = new JToggleButton("Show");//a toggle button to show password
        showPassword.setBounds(440, 210, 70, 30);
        showPassword.setFocusable(false);
        showPassword.addItemListener(this);
        showPassword.setBackground(Color.white);
		showPassword.setFont(new Font(null,Font.ITALIC,15));
		showPassword.setBorder(BorderFactory.createEtchedBorder());
        right.add(showPassword);
        
        createAccountLabel.setBounds(180, 380, 350, 30);//label to direct to other link
        createAccountLabel.setForeground(Color.WHITE);
        createAccountLabel.setFont(new Font("Peterdraw",Font.ITALIC,15));
        createAccountLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        createAccountLabel.addMouseListener(new MouseAdapter() {
        	// Adding mouse listener to the createAccountLabel
            public void mouseClicked(MouseEvent e) {
            	//Implementing the mouseClicked method for the MouseListener
                try {
                    
                    Desktop.getDesktop().browse(new URI("https://signup.live.com/"));
                } catch (IOException  ex) {
                    ex.printStackTrace();
                } catch (URISyntaxException e1) {
					e1.printStackTrace();
				}
            }
        });
        right.add(createAccountLabel);
        
		//Frame Properties defining the frame
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLayout(null);
		this.setBounds(200, 100, 1000, 500);
		this.setTitle("LOGIN-Manipal Academy of Higher Education");
		this.setIconImage(icon.getImage());
		this.setBackground(Color.white);
		this.setResizable(false);
		this.setVisible(true);
	}
	//Implementing the actionPerformed method
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==Reset)//if the user clicks on reset
		{
			username.setText("");
			password.setText("");
			Message.setText("");
		}
		if(e.getSource()==Login)//if user clicks on login
		{
			String log=username.getText();
			String pas=String.valueOf(password);
			if(log.isEmpty() || pas.isEmpty())//login clicked but fields are empty
			{
				Message.setText("Please enter a Valid Input");
			}
			else
			{	//if all fields are not empty checking validaton and giving appropriate error messages
				if (!isUsernameValid(log) && !isPasswordValid(pas)) {
                    Message.setText("Invalid username and password format.");
                } else if (!isUsernameValid(log)) {
                    Message.setText("Invalid username format.");
                } else if(!isPasswordValid(pas)){
                    Message.setText("Invalid password format.");
                }
                else
                {	//if everything is correct opening quiz window
                	this.dispose();
                	new quizWindow(log);
                }
			}
		}
		
	}
	private boolean isUsernameValid(String username) {
        // Username should contain "@" and end with ".com" and be all in lowercase
        String regex = "^[a-z0-9]+@.*\\.com$";
        return Pattern.matches(regex, username);
    }

    //Helper method to check if the password is in the correct format
    private boolean isPasswordValid(String password) {
        // Password should contain at least one uppercase letter and one digit
        return Pattern.compile("^(?=.*[A-Z])(?=.*\\d).+$").matcher(password).matches();
    }

	public void itemStateChanged(ItemEvent e) {
		if (e.getStateChange() == ItemEvent.SELECTED) {
            password.setEchoChar((char) 0); // Show the password as a string (no masking)
        } else {
            password.setEchoChar('*'); // Mask the password
        }
	}

}
