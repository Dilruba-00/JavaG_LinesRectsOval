
package javag_linesrectsoval;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JavaG_LinesRectsOval extends JPanel
{
    //display varios lines, rectagles and ovals
    public void  paintComponent(Graphics g)
    {
        super.paintComponent(g);
        
        this.setBackground(Color.WHITE);
        
        g.setColor(Color.BLACK);
        g.drawLine(10, 30, 720, 30);
        
        g.setColor(Color.BLACK);
        g.drawLine(10, 260, 720, 260);
        
        g.setColor(Color.YELLOW);
        g.drawRect(10, 40, 170, 100);
        g.fillRect(190, 40, 170, 100);
        
        g.setColor(Color.ORANGE);
        g.drawRoundRect(370, 40, 170, 100, 50, 50);
        g.fillRoundRect(550, 40, 170, 100, 50, 50);
        
        g.setColor(Color.PINK);
        g.draw3DRect(10, 150, 170, 100, true);
        g.fill3DRect(190, 150, 170, 100, true);
        
        g.setColor(Color.MAGENTA);
        g.drawOval(370, 150, 170, 100);
        g.fillOval(550, 150, 170, 100);       
        
    }
    
    public static void main(String[] args) 
    {
        JFrame frame = new JFrame("Drawing lines, rectangles and ovals");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JavaG_LinesRectsOval linesRectsOval = new JavaG_LinesRectsOval();
        linesRectsOval.setBackground(Color.WHITE);
        frame.add(linesRectsOval);//add panel to frame
        frame.setSize(800,400); //set frame size
        frame.setVisible(true);//display frame
    }
    
}
