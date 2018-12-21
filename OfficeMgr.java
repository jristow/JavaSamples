//Jordan Ristow
//jristow@gmail.com
import java.text.DecimalFormat;
public class OfficeMgr
{
    public static void main(String[] args)
    {
        Employee edward = new Employee();
        Employee nancy = new Employee();
        Employee gary = new Employee();
        //Creating my objects
        edward.setFullName("Edward Smith");
        edward.setEmployeeId(145790);
        edward.setDailyPay(270.83);
        edward.setVacationDaysLeft(15);
        String eSmith = edward.toString();
        System.out.println(eSmith);
        
        nancy.setFullName("Nancy Yeager");
        nancy.setEmployeeId(134789);
        nancy.setDailyPay(208.33);
        nancy.setVacationDaysLeft(10);
        String nYeager = nancy.toString();
        System.out.println(nYeager);
        
        gary.setFullName("Gary Jones");
        gary.setEmployeeId(145803);
        gary.setDailyPay(208.33);
        gary.setVacationDaysLeft(4);
        String gJones = gary.toString();
        System.out.println(gJones);
        
        //giving the raise
        DecimalFormat formatter = new DecimalFormat("0.00");
        double ePay = edward.getDailyPay();
        double eRaise = ePay * 1.1;
        String eFinal = formatter.format(eRaise);
        double eEntry = Double.parseDouble(eFinal);
        edward.setDailyPay(eEntry);
        double nPay = nancy.getDailyPay();
        double nRaise =  nPay * 1.1;
        String nFinal = formatter.format(nRaise);
        double nEntry = Double.parseDouble(nFinal);
        nancy.setDailyPay(nEntry);
        double gPay = gary.getDailyPay();
        double gRaise = gPay * 1.1;
        String gFinal = formatter.format(gRaise);
        double gEntry = Double.parseDouble(gFinal);
        gary.setDailyPay(gEntry);
        
        //edwards vacation
        edward.setVacationDaysLeft(0);
        
        String eSmithRaise = edward.toString();
        String nYeagerRaise = nancy.toString();
        String gJonesRaise = gary.toString();
        
        System.out.println(eSmithRaise);
        System.out.println(nYeagerRaise);
        System.out.println(gJonesRaise);
    }
}    