//Jordan Ristow
//jristow@gmail.com
import javax.swing.JOptionPane;
public class Prompt
{
    public static void main(String[] args)
    {
        String input = JOptionPane.showInputDialog("Type something: ");
        System.out.println("You typed: " + input);
    }
}