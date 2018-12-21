//Jordan Ristow
//jristow@gmail.com
import java.util.Random;

public class Coin
{
    private int m_mintYear;
    private double m_coinValue;
    private boolean m_heads;
    private int m_tossValue;
    private String m_headValue;
    
    public void toss()
    {
        Random tosser = new Random();
        m_tossValue = tosser.nextInt(2);
        if (m_tossValue == 0)
            m_heads = true;
        else
            m_heads = false;
    }
    
    public String getSideUp()
    {
        if (m_heads == true)
            m_headValue = "Heads";
        else
            m_headValue = "Tails";
        return m_headValue;
    }
    
    public boolean isHeads()
    {
        if (m_tossValue == 0) 
            return m_heads;
        else
            return false;
    }
    
    public void printInfo()
    {        
        System.out.println("The coins year is: " + m_mintYear);
        System.out.println( "The coins value is: " + m_coinValue);
        System.out.println("The side up is: " + m_headValue);
    }
    
    public void setYear(int year)
    {
        m_mintYear = year;
    }
    
    public int getYear()
    {
        return m_mintYear;
    }
    
    public void setValue(double value)
    {
        m_coinValue = value;
    }
    
    public double getValue()
    {
        return m_coinValue;
    }
}   