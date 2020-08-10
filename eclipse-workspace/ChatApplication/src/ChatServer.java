import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader; 
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ChatServer  extends JFrame implements ActionListener,Runnable
{
	JTextField tf1;
	JTextArea ta1;
	JButton b1 ; 
	JScrollPane p1 ; 
	
	ServerSocket ss ;
	Socket s1;
	PrintWriter pw ; 
	BufferedReader br ; 
	
	public ChatServer() 
	{
		 // UI 
		setTitle("Chat Server");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setBackground(Color.blue);
		setLayout(null);
		setResizable(false);
		
		tf1 = new  JTextField();
		ta1 = new JTextArea();
		p1 = new JScrollPane(ta1);
		b1 = new JButton("Send");
		
		add(tf1);
		add(b1);
		add(p1);
		
		tf1.setBounds(30,30,150,20);
		b1.setBounds(190,30,80,20);
		p1.setBounds(30,60,240,220);
		setSize(340,350);
		setVisible(true);
		// Networking 
		try 
		{
			ss = new ServerSocket(7000);// Only for server
			 s1 = ss.accept(); // Only for server
			
			
			pw = new PrintWriter(s1.getOutputStream(),true);
			br = new BufferedReader(new InputStreamReader(s1.getInputStream()));
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		b1.addActionListener(this);
		tf1.addActionListener(this);
		new Thread(this).start();
	}
	public static void main(String[] args) 
	{
		new ChatServer();
	}
	// Event handling 
	public void actionPerformed(ActionEvent arg0) 
	{	
		String text = tf1.getText();
		tf1.setText("");
		pw.println(text);
		ta1.append(text+"\t - Me "+new Date() +"\n");
	}
	public void run() 
	{
		while(true)
		{
			try 
			{
				String text = br.readLine();
				ta1.append(text+"\t - Sender "+new Date() +"\n");
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}
	
}