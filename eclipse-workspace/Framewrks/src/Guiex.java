import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class Guiex extends JFrame implements ItemListener
{

	JComboBox<String> cb1;
	public Guiex()
	{
		setLayout(null);
		String c[]= {"orange","yellow","red"};
		cb1= new JComboBox<String>(c);
		
		add(cb1);
		cb1.setBounds(100, 150, 120, 25);;
		add(cb1);
		
		setSize(300, 300);
		setVisible(true);
		cb1.addItemListener(this);
		
		
	}
	public static void main(String[] args) {
		new Guiex();
	}
	public void itemStateChanged(ItemEvent e) 
	{
	int index=cb1.getSelectedIndex();
	if(index==0)
		getContentPane().setBackground(Color.YELLOW);
	if(index==1)
		getContentPane().setBackground(Color.ORANGE);
	if(index==2)
		getContentPane().setBackground(Color.RED);
	}
	
	
}
