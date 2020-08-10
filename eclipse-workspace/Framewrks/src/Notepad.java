import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Notepad extends JFrame implements ActionListener
{
JTextArea ta1;
JScrollPane p1;
public Notepad()
{
	setTitle("MY NOTEPAD");
	ta1= new JTextArea();
	p1= new JScrollPane(ta1);
	add(p1);
	JMenuBar mbr= new JMenuBar();
	JMenu file= new JMenu("FILE");
	add(mbr,BorderLayout.NORTH);
	JMenu edit= new JMenu("EDIT");
	mbr.add(file);
	mbr.add(edit);
	
	JMenuItem copy= new JMenuItem("COPY");
	JMenuItem paste= new JMenuItem("PASTE");
	JMenuItem cut= new JMenuItem("CUT");
	JMenuItem selectall= new JMenuItem("SELECT ALL");
	
	edit.add(copy);
	edit.add(paste);
	edit.add(cut);
	edit.add(selectall);
	copy.addActionListener(this);
	paste.addActionListener(this);
	cut.addActionListener(this);
	selectall.addActionListener(this);

	setSize(400,400);
	setVisible(true);
	
	
	
}
	public static void main(String[] args)
	{
		new Notepad();

	}

	
	public void actionPerformed(ActionEvent e)
	{
		String text=e.getActionCommand();
		if(text.equals("COPY"))
			ta1.copy();
		if(text.equals("PASTE"))
			ta1.paste();
		if(text.equals("CUT"))
			ta1.cut();
		if(text.equals("SELECT ALL"))
			ta1.selectAll();
	}

}
