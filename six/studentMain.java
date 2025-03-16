import java.util.*;

public class studentMain {
    public static void main(String[] args) {

        student[] students = new student[5];
        
       
        students[0] = new student("Alice", 92);
        students[1] = new student("Bob", 78);
        students[2] = new student("Charlie", 85);
        students[3] = new student("Dave",90);
        students[4] = new student("Eve",88);
        
       
        int totalMarks = 0;
        for (student student : students) {
            totalMarks = totalMarks + student.getMarks();
        }
        double averageMarks = totalMarks / students.length;
        
        System.out.printf("\nAverage marks: %.2f", averageMarks);
    }
}
