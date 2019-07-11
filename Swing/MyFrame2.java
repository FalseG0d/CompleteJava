import java.awt.*;
class MyFrame2
{
MyFrame2(String s)
	{
	Frame f=new Frame(s);
	f.setVisible(true);
	f.setSize(400,400);
	TextField tf=new TextField();
	tf.setBounds(40,40,20,80);
	f.add(tf);
	Button b1=new Button("OK");
	b1.setBounds(80,60,60,80);
	}
public static void main(String s[])
	{
	new MyFrame2("Apoorv");
	}
}