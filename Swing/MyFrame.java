import java.awt.*;
class MyFrame
{
Frame f;
TextField tf;
Button b;
MyFrame(String s)
	{
	f=new Frame(s);
	tf=new TextField();
	tf.setBounds(40,40,60,30);
	f.add(tf);
	b=new Button("OK");
	b.setBounds(40,90,40,40);
	f.add(b);
	f.setLayout(null);
	f.setSize(400,400);
	f.setVisible(true);
	}
public static void main(String s[])
	{
	new MyFrame("Apoorv");
	}
}