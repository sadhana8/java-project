
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculator;
import javax.swing.*;
import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author Acer
 */
public class Calculator {

    
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        
        ///////additional data
        ///////////
    JFrame f=new JFrame("Button Example");  
     JTextField tf=new JTextField();  
    tf.setBounds(50,50, 190,25); 
    JTextField tf2=new JTextField();  
    tf2.setBounds(50,80, 190,25); 
    
    
 
    JButton b=new JButton("Add");  
    b.setBounds(50,110,95,30);  
    
    JButton diff=new JButton("Subtract");  
    diff.setBounds(150,110,95,30);  
    
    JLabel l3=new JLabel("RESULT");
    l3.setBounds(50,150,95,30); 
    ///////////save button
    JButton save=new JButton("Save");  
    save.setBounds(150,150,95,30);  
    f.add(save);
    //
      b.addActionListener(new ActionListener()
        {  
        public void actionPerformed(ActionEvent e)
            {  
            String num1=tf.getText();
        int num11=Integer.parseInt(num1);
        String num2=tf2.getText();
        int num22=Integer.parseInt(num2);
        int sum=num11+num22;
        System.out.println(sum);
        l3.setText(Integer.toString(sum));
        
            }  
    });
    f.add(tf);
    f.add(tf2);
//    f.add(tf3);
    f.add(l3);
    f.add(diff);
  
    f.add(b);
    f.add(tf);  
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true);   
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }
    
}
