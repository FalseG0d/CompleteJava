import java.awt.*;
class DemoFrame3
{
Frame f;
Label l;
TextField tf;
DemoFrame3(String s)
	{
	f=new Frame(s);
	l=new Label("Enter the number");
	l.setBounds(40,40,80,20);
	f.add(l);
	tf.setBounds(40,40,80,60);
	f.add(tf);
	Toolkit t=f.getToolkit();
	Dimension screenSize=t.getScreenSize();
	int width=screenSize.width*8/10;
	int h=screenSize.height*8/10;
	f.setBounds(width/8,h/8,width,h);
	f.setLayout(null);
	f.setVisible(true);
	}
public static void main(String s[])
	{
	new DemoFrame3("Apoorv");
	}
}