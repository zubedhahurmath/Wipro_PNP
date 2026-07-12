package miniProject3.mile1.main;

import miniProject3.mile1.bean.Student;
import miniProject3.mile1.exception.NullMarksArrayException;
import miniProject3.mile1.exception.NullNameException;
import miniProject3.mile1.exception.NullStudentObjectException;
import miniProject3.mile1.service.StudentReport;
import miniProject3.mile1.service.StudentService;

public class StudentMain {
	public static void main(String[] args) {

        Student[] s = new Student[10];

        s[0] = new Student("A1", new int[] {72, 73, 74});
        s[1] = new Student("B1", new int[] {75, 76, 77});
        s[2] = new Student("C1", new int[] {99, 99, 99});
        s[3] = new Student("C3", new int[] {100, 100, 99});
        s[4] = new Student("B2", new int[] {13, 88, 13});
        s[5] = new Student("C3", new int[] {14, 14, 99});
        s[6] = new Student("A2", new int[] {77, 55, 12});
        s[7] = new Student(null, new int[] {13, 88, 13});
        s[8] = new Student("A2", null);
        s[9] = null;

        StudentReport report = new StudentReport();

        System.out.println("******** Grade Calculation ********");

        for (int i = 0; i < s.length; i++) {

            try {

                if (report.validate(s[i]).equals("VALID")) {

                    String grade = report.findGrades(s[i]);

                    System.out.println(s[i].getName() + " : " + grade);
                }

            } catch (NullNameException e) {
                System.out.println(e);
            } catch (NullMarksArrayException e) {
                System.out.println(e);
            } catch (NullStudentObjectException e) {
                System.out.println(e);
            }

        }

        StudentService service = new StudentService();

        System.out.println();
        System.out.println("Number of Null Name : "
                + service.findNumberOfNullName(s));

        System.out.println("Number of Null Marks Array : "
                + service.findNumberOfNullMarksArray(s));

        System.out.println("Number of Null Objects : "
                + service.findNumberOfNullObjects(s));
    }
}