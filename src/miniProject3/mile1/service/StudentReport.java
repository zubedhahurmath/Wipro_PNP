package miniProject3.mile1.service;

import miniProject3.mile1.bean.Student;
import miniProject3.mile1.exception.NullMarksArrayException;
import miniProject3.mile1.exception.NullNameException;
import miniProject3.mile1.exception.NullStudentObjectException;

public class StudentReport {

    // Grade Calculation
    public String findGrades(Student studentObject) {

        int[] marks = studentObject.getMarks();

        // Check for fail
        for (int mark : marks) {
            if (mark < 35) {
                return "F";
            }
        }

        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        if (sum < 150)
            return "C";
        else if (sum < 200)
            return "B";
        else if (sum < 250)
            return "A";
        else
            return "A+";
    }

    // Validation Method
    public String validate(Student s)
            throws NullNameException,
                   NullMarksArrayException,
                   NullStudentObjectException {

        if (s == null) {
            throw new NullStudentObjectException();
        }

        if (s.getName() == null) {
            throw new NullNameException();
        }

        if (s.getMarks() == null) {
            throw new NullMarksArrayException();
        }

        return "VALID";
    }
}