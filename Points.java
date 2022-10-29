//displaying a group of dots on black screen
import java.awt.*;
import java.awt.event.*;
class Points extends Frame
{
    
public void paint(Graphics g)
{
    //set white color for dots
    g.setColor(Color.blue);

    for(;;)//display dot forever
    {
        //generate x,y coodinates randomly.maximum 800 and 600 px
        int x = (int) (Math.random()* 800);
        int y = (int) (Math.random()* 600);

        //use drawline()to diplay a dot
        g.drawLine(x,y,x+5,y+10);
        try{
            //make a time delay of 20 milliseconds
            Thread.sleep(20);
        } catch(InterruptedException ie){}
    }
}
public static void main(String args[])
{
    //create the frame
    Points obj = new Points();
obj.setBackground(Color.black);
obj.setSize(500,400);
obj.setTitle("Random Dots");

    //display the frame
    obj.setVisible(true);
}
}