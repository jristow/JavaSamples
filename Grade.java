//Jordan Ristow
//jristow@gmail.com

public class Grade
{
    private int m_examPointsEarned;
    private int m_examPointsPossible;
    private int m_homeworkPointsEarned;
    private int m_homeworkPointsPossible;
    private double m_ePercentage;
    private double m_hPercentage;
    private String m_overallPercentage;
    
    public void setExamScore(int ePointsEarned, int ePointsPossible)
    {
        m_examPointsEarned = ePointsEarned;
        m_examPointsPossible = ePointsPossible;
    }
    
    public void setHomeworkScore(int hPointsEarned, int hPointsPossible)
    {
        m_homeworkPointsEarned = hPointsEarned;
        m_homeworkPointsPossible = hPointsPossible;
    }
    
    public double getExamPercentage()
    {
        m_ePercentage = (m_examPointsEarned * 1.0) / m_examPointsPossible * 
        100.0;
        return m_ePercentage;
    }
    
    public double getHomeworkPercentage()
    {
        m_hPercentage = (m_homeworkPointsEarned * 1.0) / 
        m_homeworkPointsPossible * 100.0;
        return m_hPercentage;
    }
    
    public String getLetterGrade()
    {        
        double overallPercent = 0.5 * (m_ePercentage) + 0.5 * (m_hPercentage);
        if (overallPercent >= 93)
            m_overallPercentage = "A";
        
        else if (overallPercent >= 90 && overallPercent < 93)
            m_overallPercentage = "A-";
        
        else if (overallPercent >= 88 && overallPercent < 90)
            m_overallPercentage = "B+";
        
        else if (overallPercent >= 83 && overallPercent < 88)
            m_overallPercentage = "B";
            
        else if (overallPercent >= 80 && overallPercent < 83)
            m_overallPercentage = "B-";
            
        else if (overallPercent >= 78 && overallPercent < 80)
            m_overallPercentage = "C+";
            
        else if (overallPercent >= 73 && overallPercent < 78)
            m_overallPercentage = "C";
            
        else if (overallPercent >= 70 && overallPercent < 73)
            m_overallPercentage = "C-";
            
        else if (overallPercent >= 68 && overallPercent < 70)
            m_overallPercentage = "D+";
            
        else if (overallPercent >= 60 && overallPercent < 68)
            m_overallPercentage = "D";
           
        else if (overallPercent >= 55 && overallPercent < 60)
            m_overallPercentage = "D-";
            
        else
            m_overallPercentage = "F";
        
        return m_overallPercentage;
            
    }
    
    public void printGradeReport()
    {
        System.out.println("The homework percentage is: " + m_hPercentage);
        System.out.println("The exam percentage is: " + m_ePercentage);
        System.out.println("The overall grade is: " + m_overallPercentage);
    }
    }