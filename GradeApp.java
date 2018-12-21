//Jordan Ristow
//jristow@gmail.com

public class GradeApp
{
    public static void main(String[] args)
    {
        Grade aaron = new Grade();
        aaron.setExamScore(180, 200);
        aaron.setHomeworkScore(437, 500);
        aaron.getExamPercentage();
        aaron.getHomeworkPercentage();
        aaron.getLetterGrade();
        System.out.print("Aarons grades are: "); 
        aaron.printGradeReport();
        
        Grade bob = new Grade();
        bob.setExamScore(72, 80);
        bob.setHomeworkScore(320, 340);
        bob.getExamPercentage();
        bob.getHomeworkPercentage();
        bob.getLetterGrade();
        System.out.print("Bobs grades are: ");
        bob.printGradeReport();
        
        Grade christy = new Grade();
        christy.setExamScore(270, 310);
        christy.setHomeworkScore(834, 900);
        christy.getExamPercentage();
        christy.getHomeworkPercentage();
        christy.getLetterGrade();
        System.out.print("Christys grades are: ");
        christy.printGradeReport();
    }
}