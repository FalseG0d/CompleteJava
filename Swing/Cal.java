import java.awt.*;
class Cal extends Frame {
Cal(){
Panel p1=new Panel();
Panel p2=new Panel();
Panel p3=new Panel();
p1.setLayout(new GridLayout(2,3));
p2.setLayout(new GridLayout(2,2));
TextField k=new TextField("0",20);
Button a=new Button("HI");
Button b=new Button("HI");
Button c=new Button("HI");
Button d=new Button("HI");
Button e=new Button("HI");
Button l=new Button("Hello");
Button g=new Button("Hello");
Button h=new Button("Hello");
Button i=new Button("Hello");
p1.add(a);
p1.add(b);
p1.add(c);
p1.add(d);
p1.add(e);
p2.add(l);
p2.add(g);
p2.add(h);
p2.add(i);
Frame f=new Frame();
f.setSize(500,500);
f.add(p3);
f.add(p1);
f.add(p2);

show();
}
public static void main(String[] args){
new cal();}
}