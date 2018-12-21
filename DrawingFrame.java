//Jordan Ristow
//jristow@gmail.com
import javax.swing.JFrame;
import java.awt.Color;
public class DrawingFrame
{
    public static void main(String[] args)
    {
        JFrame drawings = new JFrame();
        drawings.setSize(500,500);
        drawings.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        drawings.setTitle("IT'S A SNOWMAN!!!!");
        
        DrawingPanel panel = new DrawingPanel();
        drawings.add(panel);
        
        drawings.setVisible(true);
    }
}