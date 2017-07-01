package mypack;
import java.awt.*;
import javax.swing.*;

public class draw extends JPanel
{
private int d=10;

public void paint(Graphics g)
{
	super.paint(g);
	g.fillOval(10, 10, d, d);
}
public void dnew(int dn)
 {
	d=dn;
	repaint();
 }

public Dimension getPreferredSize()
{ 
	return new Dimension(200,200);
	}

public Dimension getMinimumSize()
{
	return getPreferredSize();
	}
}
