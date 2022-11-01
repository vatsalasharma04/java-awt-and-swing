//button which displays image when clicked
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
class buttondemo extends JFrame implements ActionListener{
    JButton b;
    JLabel lbl;
    buttondemo()
    {
        //create container
        Container c = getContentPane();
        //set a layout for container
        c.setLayout(new FlowLayout());
        // store the image into imageicon object
        ImageIcon ii=new ImageIcon("car2.gif");
        //create the button with the image
        b = new JButton("CLICK ME",ii);
        //set background and foreground colors for button
        b.setBackground(Color.yellow);
        b.setForeground(Color.red);
        //set font for the label of button
        b.setFont(new Font("Arial",Font.BOLD,30));
        //set bevel border for button
        Border bd= BorderFactory.createBevelBorder(BevelBorder.RAISED);
        b.setBorder(bd);
        b.setToolTipText("this is a button");
        b.setMnemonic('c');
        c.add(b);
        b.addActionListener(this);
        lbl=new JLabel();
        c.add(lbl);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae)
    {
        ImageIcon ii=new ImageIcon("car2.gif");
        lbl.setIcon(ii);
    }
    public static void main(String args[]){
        buttondemo obj= new buttondemo();
        obj.setTitle("My Button");
        obj.setSize(1000,800);
        obj.setVisible(true);
    }
}