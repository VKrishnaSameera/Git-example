import java.awt.*;
import java.awt.event.*;

import javax.swing.SwingUtilities;
public class mouse extends MouseAdapter implements MouseListener{
	Label l;  
	mouse()
	{ 
	      Frame f=new Frame("mouse");
	        f.addMouseListener(this);  
	
	        l=new Label();  
	        l.setBounds(20,50,100,20);  
	        f.add(l);  
	        f.setSize(300,300);  
	        f.setLayout(null);  
	        f.setVisible(true);  
	    }  
	    public void mouseClicked(MouseEvent e) {  
	        if(SwingUtilities.isLeftMouseButton(e))
		l.setText("left click");
	        else
		l.setText("right click");
	    }  
	    public void mouseEntered(MouseEvent e) {  
	        l.setText("Mouse Entered");  
	    }  
	    public void mouseExited(MouseEvent e) {  
	        l.setText("Mouse Exited");  
	    }  
	    public void mousePressed(MouseEvent e) {  
	        l.setText("Mouse Pressed");  
	    }  
	    public void mouseReleased(MouseEvent e) {  
	        l.setText("Mouse Released");  
	    }  
	public static void main(String[] args) 
	{  
	    new mouse();  
	}  
}