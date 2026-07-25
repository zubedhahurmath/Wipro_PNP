package com.mileStoneJunit.test;

import com.mileStoneJunit.bean.Student;
import com.mileStoneJunit.exception.NullMarksArrayException;
import com.mileStoneJunit.exception.NullNameException;
import com.mileStoneJunit.exception.NullStudentException;
import com.mileStoneJunit.main.StudentReport;
import com.mileStoneJunit.main.StudentService;
public class StudentTest {
    public static void main(String[] args) {
        StudentReport report = new StudentReport();
        StudentService service = new StudentService();
        Student s1 = new Student("Robert", new int[] {90, 85, 88});
        Student s2 = new Student("John", new int[] {36, 35, 40});
        Student s3 = new Student("Steve", new int[] {20, 25, 30});
        Student s4 = null;
        Student s5 = new Student(null, new int[] {80, 70, 90});
        Student s6 = new Student("David", null);
        try {
            System.out.println("TC1 Grade = " + report.validate(s1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("TC2 Grade = " + report.validate(s2));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            System.out.println("TC3 Grade = " + report.validate(s3));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            report.validate(s4);
        } catch (NullStudentException e) {
            System.out.println("TC4: " + e.getMessage());
        } catch (Exception e) {
        }
        try {
            report.validate(s5);
        } catch (NullNameException e) {
            System.out.println("TC5: " + e.getMessage());
        } catch (Exception e) {
        }
        try {
            report.validate(s6);
        } catch (NullMarksArrayException e) {
            System.out.println("TC6: " + e.getMessage());
        } catch (Exception e) {
        }
        Student[] students = {s1, s2, s3, s4, s5, s6};
        System.out.println("TC7 Null Names = "
                + service.findNumberOfNullName(students));
        System.out.println("TC8 Null Objects = "
                + service.findNumberOfNullObjects(students));
        System.out.println("TC9 Null Marks Arrays = "
                + service.findNumberOfNullMarks(students));
    }
}