import java.awt.*;
interface ButtonListener
{
	public void clicked(ButtonEvent bl);
}
class Button extends java.awt.Button
{
Button(String s)
	{super(s);}
ButtonListener bl;
public void register(ButtonListener bl)
	{
	this.bl=bl;
	}
public void execute()
	{
	ButtonEvent b=new ButtonEvent(this);
	bl.clicked(b);
	}
}
class ButtonEvent
{
Button b;
ButtonEvent (Button b)
	{
	this.b=b;
	}
public Button getSource()
	{return b;}
}
class TwoInOne implements ButtonListener
{
Button b,b1;
TextField tf;
Label l;
Frame f;
public void clicked(ButtonEvent bl)
	{
	if(bl.getSource()==b)
		{
		tf.setText("Hello");
		}
	if(bl.getSource()==b1)
		tf.setText("");
	}
TwoInOne(String s)
	{
	f=new Frame(s);
	b=new Button("OK");
	b.setBounds(100,160,60,40);
	b.register(this);
	b1=new Button("Clear");
	b1.setBounds(40,160,60,40);
	b1.register(this);
	f.add(b1);
	f.add(b);
	Label l=new Label("Enter the number");
	l.setBounds(40,40,80,20);
	f.add(l);
	tf=new TextField();
	tf.setBounds(140,40,100,20);
	f.add(tf);
	f.setSize(400,400);
	f.setLayout(null);
	f.setVisible(true);
	}
public static void main(String... s)
	{
	new TwoInOne("Apoorv");
	}
}