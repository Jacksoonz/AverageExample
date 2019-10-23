/**
 * Student Grades
 *
 * @author (J. Kim)
 * @version (0.1)
 */
public class Grades
{
    // instance variables - replace the example below with your own
    private String name;
    private int[]  grades;

    /**
     * Constructor for objects of class Grades
     */
    public Grades(String name, int[] grades)
    {
        this.name   = name;
        this.grades = grades;
    }

    /**
     * Calculate the average of the internal grades
     *
     * @return    average of internal grades
     */
    public double average()
    {
        double average=0;
        // Calculate the average
        for (int i=0 ; i<grades.length ; i++)
            average+=grades[i];
        average /= grades.length;
        return average;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return (this.name+" Grades : "+average());
    }
}
