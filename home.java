//beautiful home
import java.awt.*;
import java.awt.event.*;
class home extends Frame{
    home(){
        this.addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);

            }
        });
    }
    public void paint(Graphics g)
    {
    int x[]={375,275,475};
    int y[]={125,200,200};
    int n =3;
    this.setBackground(Color.blue);
    g.setColor(Color.pink);
    g.fillRect(300,200,150,100);
    g.setColor(Color.black);
    g.fillRect(350,210,50,60);
    g.setColor(Color.darkGray);
    g.fillPolygon(x,y,n);
    g.setColor(Color.yellow);
    g.fillOval(100,100,60,60);
    g.setColor(Color.green);
    g.fillArc(50,250,150,100,0,180);
    g.fillArc(150,250,150,100,0,180);
    g.fillArc(450,250,150,100,0,180);
    g.drawLine(50,300,600,300);
    g.drawString("Happy Home",275,350);
    }
    public static void main(String args[])
    {
        home h=new home();
        h.setSize(500,400);
        h.setTitle("home");
        h.setVisible(true);
    }

}