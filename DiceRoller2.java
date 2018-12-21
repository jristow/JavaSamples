//Jordan Ristow
//jristow@gmail.com

public class DiceRoller2
{
    public static void main(String[] args)
    {
        Dice myDice1 = new Dice(6);
        System.out.println("The results for the six sided die are: ");
        myDice1.roll();
        int result1 = myDice1.getCurrentValue();
        System.out.println("First roll: " + result1);
        myDice1.roll();
        int result2 = myDice1.getCurrentValue();
        System.out.println("Second roll: " + result2);
        myDice1.roll();
        int result3 = myDice1.getCurrentValue();
        System.out.println("Third roll: " + result3);
        
        Dice myDice2 = new Dice(12);
        
        System.out.println("The results for the twelve sided die are: ");
        myDice2.roll();
        int result4 = myDice2.getCurrentValue();
        System.out.println("First roll: " + result4);
        myDice2.roll();
        int result5 = myDice2.getCurrentValue();
        System.out.println("Second roll: " + result5);
        myDice2.roll();
        int result6 = myDice2.getCurrentValue();
        System.out.println("Third roll: " + result6);
    }
}