import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lottery implements ActionListener
{
    ArrayList list = new ArrayList();
    JFrame frame,RULES;
    JPanel p1,p2,p3,p4,not;
    JButton Red,b1,b2,b3,b4,b5,b6,n1,n2,n3,n4,n5,n6,n7,n8,n9,n0;
    JTextField t1,t2,t3,t4;
    String s1,s2;
    int num1,num2,ran1,ran2;
    public int amount=0;
    Random rand = new Random();
    
    Lottery()
    {
        frame = new JFrame("Lottery");
        JLabel l = new JLabel("**************  Display  ***************");
        p1=new JPanel();
        p2=new JPanel();
        p3=new JPanel();
        p4=new JPanel();
        not=new JPanel();
        p1.setOpaque(false);
        p2.setOpaque(false);
        p3.setOpaque(false);
        p4.setOpaque(false);
        not.setOpaque(false);
         
        p2.setLayout(new GridLayout(5,4,5,5));
        p3.setLayout(new GridLayout(3,2,5,5));
        p4.setLayout(new GridLayout(4,1,5,5));
         
        t1= new JTextField();
        t2= new JTextField();
        t3= new JTextField();
        t4= new JTextField();
        t1.setEditable(false);
        t2.setEditable(false);
        t3.setEditable(false);
        t4.setEditable(false);
        t4.setText("$0");
        
            
        
         
//         p1.setLayout(new GridLayout(3,1,20,20));
//        p2.setLayout(new GridLayout(3,1,150,20));
        
        
        
        Red= new JButton("Colour");
        
        Red.setPreferredSize(new Dimension (80, 30));
        
        b1= new JButton("Rules");
        b2= new JButton("Clear");
        b3=new JButton("Start Game");
        b4=new JButton("Stop Game");
        b5= new JButton("Enter");
        b6 = new JButton("New Game");
        
        n1 = new JButton("1");
        n2 = new JButton("2");
        n3 = new JButton("3");
        n4 = new JButton("4");
        n5 = new JButton("5");
        n6 = new JButton("6");
        n7 = new JButton("7");
        n8 = new JButton("8");
        n9 = new JButton("9");
        n0 = new JButton("0");
        
        n1.setEnabled(false);
        n2.setEnabled(false);
            n3.setEnabled(false);
            n4.setEnabled(false);
            n5.setEnabled(false);
            n6.setEnabled(false);
            n6.setEnabled(false);
            n7.setEnabled(false);
            n8.setEnabled(false);
            n9.setEnabled(false);
            n0.setEnabled(false);
            b5.setEnabled(false);
            b4.setEnabled(false);
            b2.setEnabled(false);
        
        //colours in p1
        p1.add(Red);
        // Numbers in p2
        p2.add(n1);p2.add(n2);p2.add(n3);
        p2.add(n4);p2.add(n5);p2.add(n6);
        p2.add(n7);p2.add(n8);p2.add(n9);
        p2.add(not);p2.add(n0);
        //Fuctions in p3
        p3.add(t4);p3.add(b4);p3.add(b5);p3.add(b6);p3.add(b2);p3.add(b1);
        //Textfield in p4
        p4.add(l);p4.add(t1);p4.add(t2);p4.add(t3);
        frame.add(p1);frame.add(p4);frame.add(p2);frame.add(p3);
        
        Red.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        n1.addActionListener(this);
        n2.addActionListener(this);
        n3.addActionListener(this);
        n4.addActionListener(this);
        n5.addActionListener(this);
        n6.addActionListener(this);
        n7.addActionListener(this);
        n8.addActionListener(this);
        n9.addActionListener(this);
        n0.addActionListener(this);
        
        frame.setVisible(true);
        frame.setLayout(new GridLayout(2,2));
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) 
    {
        new Lottery();
    }
    public void actionPerformed(ActionEvent e)
    {
        Object obj = e.getSource();
        Object obj1 =e.getActionCommand();
        
        if(obj == Red)
        {
            JColorChooser c1 = new JColorChooser();
            Color c =JColorChooser.showDialog(null,"Pick a Colour",Color.white);
            frame.getContentPane().setBackground(c);
        }
        else if (obj==b1)
        {
            JOptionPane.showMessageDialog(RULES, "\tWelcome to Deepak Lottery\n**************************************************************************"+
                        " \nEnter a Two Digit Number \nIf a single or both digits matches with the lottery number generated then there is " +
                           "wining prize accordngly\n\tBest Of Luck"
                    + "\n\t\tPRIZE :- \nSingle Digit Match - $60\nBoth Digit Match But Different Order - $100"+
                    "\nExact Number Match - $600\n\nNOTE : Each Chance - $60","RULES",JOptionPane.WARNING_MESSAGE);
        }
        else if(obj==b2)
        {
            num1=num2=0;
            s1=null;
            t2.setText("Entered Number - ");
            
        }
        else if(obj==b3)
        {
            b3.setEnabled(false);
            t1.setText("Generated Number Here");
            t2.setText("Entered Number Here");
            
        }
        else if(obj==b4)
        {
            b6.setEnabled(true);
            String a =String.valueOf(amount);
            t1.setText("Game Ended");
            t2.setText("Game Ended");
            if(amount>0)
            {
                t3.setText("Please Collect The Wining Amount");
            }
            else if(amount<0)
            {
                t3.setText("Please Pay = $"+ a.substring(1));
            }
            else
            {
                t3.setText("Hurray !! you played for free");
            }
            t4.setText("$"+a);
            n1.setEnabled(false);
            n2.setEnabled(false);
            n3.setEnabled(false);
            n4.setEnabled(false);
            n5.setEnabled(false);
            n6.setEnabled(false);
            n6.setEnabled(false);
            n7.setEnabled(false);
            n8.setEnabled(false);
            n9.setEnabled(false);
            n0.setEnabled(false);
            b5.setEnabled(false);
            b2.setEnabled(false);
            
        }
        else if(obj==n1||obj==n2||obj==n3||obj==n4||obj==n5||obj==n6||obj==n7||obj==n8||obj==n9||obj==n0)
        {
            if(s1!=null)
            {
                s1=s1+obj1;
                System.out.println("String 2 :"+s1);
                String temp = s1.substring(1);
                num2 = Integer.parseInt(temp);
                System.out.println("num 2 :"+num2);
            }
            else
            {
                s1=""+obj1;
                num1=Integer.parseInt(s1);
            }
            
            t2.setText("Entered Number - "+s1);
            System.out.println("num 1 :"+num1);  
        }
        else if(obj==b5)
        {
            ran1 = rand.nextInt(10);
            s2=String.valueOf(ran1);
            ran2 = rand.nextInt(10);
            s2=s2+String.valueOf(ran2);
            t1.setText("Random Number : "+s2);
            System.out.println("ran 1 :"+ran1);
            System.out.println("ran 2 :"+ran2);
            if((num1==ran1)&&(num2==ran2))
            {
                amount = amount+600;
                t3.setText("Perfect Match");
            }
            else if((num1==ran2)&&(num2==ran1)&&(s1!=s2))
            {
                amount=amount+100;
                t3.setText("Both Digit Matched but order different");
            }
            else if((num1 == ran1)||(num1==ran2)||(num2==ran1)||(num2==ran2))
            {
                amount =amount+80;
                t3.setText("Single Digit Matched");
            }
            else
            {
                t3.setText("Number Mismatch Try Again");
            }
            amount = amount-60;
            String a =String.valueOf(amount);
            t4.setText("$"+a);
            t2.setText("Enter 2 Digit Number  Last no :"+s1);
            s1=(null);
            if(amount>0)
            {
                Color c1= new Color(0-255-51);
                t4.setBackground(c1);
            }
            else if(amount<0)
            {
                t4.setBackground(Color.PINK);
            }
            else
            {
                t4.setBackground(Color.white);
            }
        }
        else if(obj==b6)
        {
            amount =0;
            t1.setText(null);
            t2.setText(null);
            t3.setText(null);
            t4.setBackground(Color.white);
            t4.setText("$0");
            b6.setEnabled(false);
            n1.setEnabled(true);
            n2.setEnabled(true);
            n3.setEnabled(true);
            n4.setEnabled(true);
            n5.setEnabled(true);
            n6.setEnabled(true);
            n6.setEnabled(true);
            n7.setEnabled(true);
            n8.setEnabled(true);
            n9.setEnabled(true);
            n0.setEnabled(true);
            b5.setEnabled(true);
            b4.setEnabled(true);
            b2.setEnabled(true);
            
        }
    }
}

