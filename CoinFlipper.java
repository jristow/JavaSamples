//Jordan Ristow
//jristow@gmail.com

public class CoinFlipper
{
    public static void main(String[] args)
    {
        Coin quarter = new Coin();
        Coin nickel = new Coin();
        
        quarter.setValue(.25);
        quarter.setYear(1997);
        
        nickel.setValue(.05);
        nickel.setYear(2004);
        
        quarter.toss();
        nickel.toss();
        
        quarter.getSideUp();
        nickel.getSideUp();
        
        quarter.printInfo();
        nickel.printInfo();
        
        quarter.toss();
        System.out.println("The quarter is now: " + quarter.getSideUp());
    }
}