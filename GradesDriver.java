/**
 * Driver for Grades examle
 *
 * @author (J. Kim)
 * @version (0.1)
 */
public class GradesDriver
{


    public static void main(String[] args)
    {
        // These are the grades a student has on quizzes
        int[] grades={90,80,90,70,80,90,100,80};
        
        // Find the average: sum and divide by number
        double average=0.0;
        for (int i=0 ; i<grades.length ; i++)
            average+=grades[i];
        average /= grades.length;
        
        System.out.println("Average is : "+average);
        
        // Create new Grades for Jimbo and JJ
        int[] jimboGrade={80,80,80};
        Grades jimbo = new Grades("Jimbo", jimboGrade );
        

        int[] jjGrades={90,90,90};
        Grades jj = new Grades("JJ", jjGrades );
        
        
        // In this version, we call the objects individually
        System.out.println("\n\n*** Individual Version");
        System.out.println("Jimbo Grades :"+jimbo.average());
        System.out.println("JJ    Grades :"+jj.average());
        
        // In this version, we placed the students in an array
        System.out.println("\n\n*** Array Version");
        Grades[] gradesArray = new Grades[2];
        gradesArray[0] = jimbo;
        gradesArray[1] = jj;
        for (int i=0 ; i<gradesArray.length ; i++)
            System.out.println(" Grades Array "+
                                 gradesArray[i].getName() + ": "+
                                 gradesArray[i].average());
        
       // In this version, we abuse the toString() method
       System.out.println("\n\n*** toString() Version");
       for (int i=0 ; i<gradesArray.length ; i++)
           System.out.println(" toString() "+gradesArray[i].toString());
    }
  
}
