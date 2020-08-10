import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.Color;


 public class LoginPass extends JFrame implements ActionListener
{
JLabel l1,l2,l3;
JTextField la;
JPasswordField ta;
JButton b1, b2,b3 ;


			LoginPass()
		{
				l1= new JLabel("Username");
				l2=new JLabel("Password");
				l1.setForeground(Color.blue);
				l2.setForeground(Color.blue);
				l3=new JLabel();
				l3.setForeground(Color.blue);
				
				
				la= new JTextField();
				ta= new JPasswordField();
				
				
				
				
				
				b1=new JButton("Login");	
			    b2=new JButton("Cancel");
			    b3=new JButton("submit");
			    b1.setBackground(Color.orange);
			    b2.setBackground(Color.orange);
			    b1.setForeground(Color.BLUE);
			    b2.setForeground(Color.BLUE);
				
				l1.setBounds(30, 30, 100, 20);
				l2.setBounds(30, 60, 100, 20);
				la.setBounds(140,30, 220, 20);
				ta.setBounds(140,60, 220, 20);
				b1.setBounds(140,90, 100, 20);
				b2.setBounds(260,90,100,20);
				b3.setBounds(260,90,100,20);
				l3.setBounds(30, 100, 50, 20);
				
				
				
				add(l1);add(l2);add(la);add(ta);
				add(b1);
				add(b2);add(b3);add(l3);
				
				setVisible(true);
				setSize(500, 500);
				setTitle("Login Page");
				setLocation(300, 300);
				setLayout(null);
				setResizable(false);
				getContentPane().setBackground(Color.GRAY);
				
				b1.addActionListener(this);
				b2.addActionListener(this);
				
			
				
				

				
				
				
			}

	public static void main(String[] args)
	{
		new LoginPass();
		
		
	}

	
	public void actionPerformed(ActionEvent e) 
	{
		String un=la.getText();
		String pw=ta.getText();
		
		
		
		if((un.equalsIgnoreCase("lit")) && (pw.equalsIgnoreCase("java")))
		{
			l3.setText("success");
		}
		else
		{
			l3.setText("failed");
		}
		
		
		
		
	}

}
