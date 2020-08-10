import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class Test extends JApplet implements AdjustmentListener
{
	JScrollBar sb1,sb2,sb3;
	public void init()
	{
		setLayout(null);
		sb1=new JScrollBar(0,0,20,0,275);
		sb1=new JScrollBar(0,0,20,0,275);
		sb1=new JScrollBar(0,0,20,0,275);

		sb1.setBounds(30,30,300,20);
		sb2.setBounds(30,60,300,20);
		sb3.setBounds(30,90,300,20);

		add(sb1);
		add(sb2);
		add(sb3);

		sb1.addAdjustmentListener(this);
		sb2.addAdjustmentListener(this);
		sb3.addAdjustmentListener(this);

}
public void adjustmentValueChanged(AdjustmentEvent ae)
{
	int r=sb1.getValue();
	int g=sb2.getValue();
	int b=sb3.getValue();

	getContentPane().setBackground(new Color(r,g,b));
	showStatus(r+"               "+g+"          "+b);

}

	}

//<applet code="Test.class" width=300 height=3000></applet>