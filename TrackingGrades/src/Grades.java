// ************************************************************
// Grades.java
//
// Use Student class to get test grades for two students
// and compute averages
//
// ************************************************************
public class Grades
{
    public static void main(String[] args)
    {
        Student student1 = new Student("Mary");
        Student student2 = new Student("Mike");
        
        student1.inputGrades();
        System.out.println(student1.name + "'s Average is " +student1.getAverage());
        
        student2.inputGrades();
        System.out.println(student2.name + "'s Average is " +student2.getAverage());
      
      
        
        
    }
}