//Jordan Ristow
//jristow@gmail.com

public class Movie
{
    private String m_title;
    private int m_length;
    private String m_rating;
    
    //setting title
    public void setTitle(String title)
    {
        m_title = title;
    }
    
    //getting title
    public String getTitle()
    {
        return m_title;
    }
    
    //setting length
    public void setLength(int length)
    {
        m_length = length;
    }
    
    //getting length
    public int getLength()
    {
        return m_length;
    }
    
    //setting rating
    public void setRating(String rating)
    {
        m_rating = rating;
    }
    
    //getting rating
    public String getRating()
    {
        return m_rating;
    }
}