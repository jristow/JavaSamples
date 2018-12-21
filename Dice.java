//Jordan Ristow
//jristow@gmail.com
//creating my dice class

import java.util.Random;

public class Dice
{
    private int m_diceValue;
    private int m_sides;
    
    public Dice(int numOfSides)
    {
        m_sides = numOfSides;
    }
    
    public void roll()
    {
        Random numberGenerator = new Random();
        
        m_diceValue = numberGenerator.nextInt(m_sides) + 1;
    }
    
    public int getCurrentValue()
    {
        return m_diceValue;
    }
}