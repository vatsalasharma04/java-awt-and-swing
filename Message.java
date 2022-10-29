//frame with background color and message
import java.awt.*;
import java.awt.event.*;
class Message extends Frame
{
    Message()
    {
        //close the frame when close button clicked
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
    }//end of constructor
public void paint(Graphics g)
{
    //set background color for frame
    this.setBackground(new Color(100,20,20));
    Font f = new Font("Arial",Font.BOLD+Font.ITALIC,30);
    g.setFont(f);
    g.setColor(Color.green);
    g.drawString("Hello, How are u ?",100,100);
}
public static void main(String args[])
{
    //create the frame
    Message obj = new Message();
obj.setSize(400,300);
obj.setTitle("This is my Text");

    //display the frame
    obj.setVisible(true);
}
}