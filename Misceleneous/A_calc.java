import java.awt.*;
import java.lang.String;
class A_calc
{
Frame f;
TextField tf;
Button b;
A_calc(String s)
	{
	f=new Frame(s);
	f.setSize(400,500);
	f.setVisible(true);
	tf=new TextField();
	tf.setBounds(40,40,220,30);
	f.add(tf);
	f.setLayout(null);
	for(int i=0;i<4;i++)
		{
		for(int j=0;j<4;j++)
			{
			if((42+i*4+j)==44)
			b=new Button("=");
			else
			b=new Button(Character.toString((char)(42+i*4+j)));
			b.setBounds(40+50*j,80+50*i,40,40);
			f.add(b);
			}
		}
	}

public static void main(String s[])
	{
	new A_calc("A_calc");
	}
}