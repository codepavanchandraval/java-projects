package mypack;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.SliderUI;

public class window  extends JFrame
{
private JSlider jSlider;
private draw draw;
public window()
{
 super("JSlider");
 draw=new draw();
 draw.setBackground(Color.CYAN);
 jSlider =new JSlider(SwingConstants.HORIZONTAL,0,300,10);
 jSlider.setMajorTickSpacing(10);
 jSlider.setPaintTicks(true);
 
 jSlider.addChangeListener(new ChangeListener() {
	
	@Override
	public void stateChanged(ChangeEvent e) {
		draw.dnew(jSlider.getValue()); 
	
	}
});
 add(jSlider,BorderLayout.SOUTH);
 add(draw,BorderLayout.CENTER);
}}
