// A class to store employee information
// By Michael Stuart <michaelstuart@boisestate.edu>

public class Employee
{
    private String m_fullName;
    private int m_id;
    private double m_dailyPay;
    private int m_vacationDays;

    /**
     * Sets the full name of the employee.
     */
    public void setFullName(String name)
    {
        m_fullName = name;
    }

    /**
     * Sets the employee ID
     */
    public void setEmployeeId(int id)
    {
        m_id = id;
    }

    /**
     * Sets the daily pay of the employee.
     */
    public void setDailyPay(double pay)
    {
        m_dailyPay = pay;
    }

    /**
     * Sets the number of remaining vacation days for the employee.
     */
    public void setVacationDaysLeft(int days)
    {
        m_vacationDays = days;
    }

    /**
     * Returns the employee's full name.
     */
    public String getFullName()
    {
        return m_fullName;
    }

    /**
     * Returns the employee's ID number.
     */
    public int getEmployeeId()
    {
        return m_id;
    }

    /**
     * Returns the employee's remaining number of vacation days.
     */
    public int getVacationDaysLeft()
    {
        return m_vacationDays;
    }

    /**
     * Returns the employee's daily pay rate.
     */
    public double getDailyPay()
    {
        return m_dailyPay;
    }

    /**
     * Provide a String representation of the employee record
     */
    public String toString()
    {
        return "Full name: " + m_fullName + "\n" +
               "       ID: " + m_id + "\n" +
               "Daily pay: $" + m_dailyPay + "\n" +
               " Vacation: " + m_vacationDays + " days remaining\n";
    }
}