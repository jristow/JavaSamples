//Jordan Ristow
//jristow@gmail.com

public class CountCoinFlips
{
    public static void main(String[] args)
    {
        Coin flipper = new Coin();
        int count = 0;
        int headValue = 0;
        int tailValue = 0;
        while (count < 1000000)
        {
            flipper.toss();
            if (flipper.isHeads()== true)
                headValue++;
            else
                tailValue++;
            count++;       
            
        }
        System.out.println("The number of heads was: " + headValue);
        System.out.println("The number of tails was: " + tailValue);
        double headPercentage = (headValue / 1000000.0) * 100;
        System.out.println("The percentage of heads is: " + headPercentage);
    }
}