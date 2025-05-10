import Composite.College;
import Composite.Department;
import Leaf.Student;
import Leaf.Teacher;

public class UniversityMain {
    public static void main(String[] args) {
        Student s1 = new Student("Angelo", "S001", 45000);
        Student s2 = new Student("Robee", "S002", 42000);
        Student s3 = new Student("Herrera", "S003", 40000);

        Teacher t1 = new Teacher("Prof. Esperanza", "Computer Science", 60000);
        Teacher t2 = new Teacher("Prof. Laurenta", "Mathematics", 70000);

        Department csDept = new Department("Department of Computer Science");
        csDept.add(t1);
        csDept.add(s1);
        csDept.add(s2);

        Department mathDept = new Department("Department of Mathematics");
        mathDept.add(t2);
        mathDept.add(s3);

        College collegeOfEngineering = new College("College of Engineering");
        collegeOfEngineering.add(csDept);
        collegeOfEngineering.add(mathDept);


        collegeOfEngineering.displayDetails();

        System.out.println("\nTotal Students: " + collegeOfEngineering.getNumberOfStudents());
        System.out.println("Total Budget: PHP" + collegeOfEngineering.getBudget());
    }
}
