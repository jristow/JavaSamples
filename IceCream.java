//Jordan Ristow
//jristow@gmail.com
import javax.swing.JOptionPane;
public class IceCream
{
    public static void main(String[] args)
    {
        String inputOne = JOptionPane.showInputDialog(
        "What is the height of your cone in inches? ");
        double height = Double.parseDouble(inputOne);
        String inputTwo = JOptionPane.showInputDialog(
        "How many scoops of ice cream are in your cone? ");
        int scoops = Integer.parseInt(inputTwo);
        final double sphereRadius = 1.25;
        final int coneRadius = 1;
        double base = Math.PI * Math.pow(coneRadius,2);
        double volumeOne = 1.0 / 3.0 * base * height;
        double volumeTwo = (4.0 / 3.0) * Math.PI * Math.pow(sphereRadius,3) * 
        scoops;
        double totalVolume = volumeOne + volumeTwo;
        System.out.println(
        "The volume of ice cream in your cone is: " + totalVolume + 
        " cubic inches");
    }
}