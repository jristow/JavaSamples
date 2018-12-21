//Jordan Ristow
//jristow@gmail.com
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
public class DrawingPanel extends JPanel
{
    public void paintComponent(Graphics pen)
    {
        //draw a house
        pen.setFont(new Font("Times",Font.PLAIN,18));
        pen.drawRect(200,200,200,200);
        pen.drawLine(200,200,300,125);
        pen.drawLine(400,200,300,125);
        pen.fillRect(280,320,40,80);
        pen.fillRect(220,220,30,30);
        pen.fillRect(360,220,30,30);
        pen.setColor(Color.RED);
        pen.drawString("Jordan Ristow",20,20);
        pen.setColor(Color.MAGENTA);
        pen.fillOval(100,350,50,50);
        pen.fillOval(110,322,30,30);
        pen.fillOval(115,304,20,20);
        pen.setColor(Color.LIGHT_GRAY);
        pen.fillRect(0,400,500,100);
        pen.setColor(Color.YELLOW);
        pen.fillArc(420,0,80,80,-90,-90);
        
    }    
}        