import java.awt.*;
import java.awt.event.*;
class EventDemo// implements ActionListener
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
	/*b.addActionListener(new ActionListener()
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
							});*/
	Outer o=new Outer(this);
	f.add(b);
	f.add(b1);
	tf=new TextField();
	tf.setBounds(20,40,100,40);
	f.add(tf);
	f.setLayout(null);
	f.setSize(400,400);
	f.setVisible(true);
	}
/*public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b)
		tf.setText("OK");
	if(e.getSource()==b1)
		tf.setText("");
	}*/
public static void main(String s[])
	{
	new EventDemo("Apoorv");
	}

}
class Outer implements ActionListener
{
EventDemo f;
Outer(EventDemo f)
	{
	f.b.addActionListener(f);
	f.b1.addActionListener(f);
	this.f=f;
	}
public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==f.b)
		f.tf.setText("Lalu");
	if(e.getSource()==f.b1)
		f.tf.setText("Rabari");	
	}
}