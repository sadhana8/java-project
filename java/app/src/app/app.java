
package app;

 
import java.awt.*;
import java.applet.*;
public class app extends Applet
{
     String msg="";
     public void init()
    {
         msg="Hello Geeks";
     }
 
     public void start()
     {
         msg=msg+",Welcome to GeeksForGeeks";
     }
 
     public void paint(Graphics g)
     {
         g.drawString(msg,20,20);
     }
     
}