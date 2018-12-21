//Jordan Ristow
//jristow@gmail.com

public class Frog
{
    private int m_jumps;
    private String name;
    
    public Frog(String frogName)
    {
        name = frogName;
    }

    public void jump()
    {
        m_jumps = m_jumps + 1;
    }

    public void print()
    {
        System.out.println("The frogs name is " + name
        +  "\n It has jumped " + m_jumps + " times");
    }
}    