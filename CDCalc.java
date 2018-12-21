//Jordan Ristow
//jristow@gmail.com
import java.util.Scanner;
public class CDCalc
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double rate = 0;
        int years;
        double amount;
        int count = 0;
        
        System.out.println("Please enter the amount of money to be invested.");
        amount = keyboard.nextDouble();
        System.out.println("Please enter the term length");
        years = keyboard.nextInt();
        
        switch (years)
        {
            case 1:
                rate = 0.30;
                break;
            case 2:
                rate = 0.45;
                break;
            case 3:
                rate = 0.95;
                break;
            case 4:
                rate = 1.50;
                break;
            case 5:
                rate = 1.80;
                break;
            default:
                assert false : "Error in term length";
                break;
        }
        
        System.out.println("Investing: $" + amount);
        System.out.println("Term: " + years + " years");
        System.out.println("Rate: " + rate);
        
        while (count <= years)
        {
           System.out.print("Value after year " + count + " ");
           System.out.printf("$%.2f\n", amount);
           amount = amount + amount * (rate/100.0);
           count++;
        }
    }
}