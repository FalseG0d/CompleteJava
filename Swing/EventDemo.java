import java.awt.*;
import java.awt.event.*;
class EventDemo extends WindowAdapter
{
Frame f;
Button b,b1;
TextField tf;
EventDemo(String s)
	{
	f=new Frame(s);
	b=new Button("OK");
	b1=new Button("CLEAR");
	b.setBounds(20,100,40,40);
	b1.setBounds(20,180,40,40);
	b.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
									{
										tf.setText("Apoorv");
									}
							});
	b1.addActionListener(new ActionListener()
							{
								public void actionPerformed(ActionEvent e)
									{
										tf.setText("Umang");
									}
							});
	f.add(b);
	f.add(b1);
	tf=new TextField();
	tf.setBounds(20,40,100,40);
	f.add(tf);
	f.addWindowListener(this);
	f.setLayout(null);
	f.setSize(400,400);
	f.setVisible(true);
	}
public void windowClosing(WindowEvent e)
	{f.dispose();}

public static void main(String s[])
	{
	new EventDemo("Apoorv");
	}

}