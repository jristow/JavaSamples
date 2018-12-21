//Jordan Ristow
//jristow@gmail.com

import java.util.Scanner;

public class WaterSchedule
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please enter the water group you are in (in caps)");
        String group = keyboard.nextLine();
        char answer = group.charAt(0);
        String result = null;
        switch (answer)
        {
            case 'A':
                result = "Winter (Nov to Feb): Monday \n" + 
                "Spring/Fall (Mar, Apr, Sept, Oct): Monday Wednesday Friday" +
                "\n" +"Summer (May to Aug): Any day";
                break;
            case 'B':
                result = "Winter (Nov to Feb): Tuesday \n" +
                "Spring/Fall (Mar, Apr, Sept, Oct): Tuesday Thursday Saturday"
                + "\n" +"Summer (May to Aug): Any day";
                break;
            case 'C':
                result = "Winter (Nov to Feb): Wednesday \n" +
                "Spring/Fall (Mar, Apr, Sept, Oct): Monday Wednesday Friday"
                + "\n" + "Summer (May to Aug): Any day";
                break;
            case 'D':
                result = "Winter (Nov to Feb): Thursday \n" +
                "Spring/Fall (Mar, Apr, Sept, Oct): Tuesday Thursday Saturday"
                + "\n" + "Summer (May to Aug): Any day";
                break;
            case 'E':
                result = "Winter (Nov to Feb): Friday \n" +
                "Spring/Fall (Mar, Apr, Sept, Oct): Monday Wednesday Friday"
                + "\n" + "Summer (May to Aug): Any day";
                break;
            case 'F':
                result = "Winter (Nov to Feb): Saturday \n" +
                "Spring/Fall (Mar, Apr, Sept, Oct): Tuesday Thursday Saturday"
                + "\n" + "Summer (May to Aug): Any day";
                break;
            default:
                result = "Not A Watering Group";
        }
        
        System.out.println("The following is your list of days for watering:");
        System.out.println(result);
    }
}