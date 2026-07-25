package com.mileStoneJunit.main;

import com.mileStoneJunit.bean.Student;
import com.mileStoneJunit.exception.NullMarksArrayException;
import com.mileStoneJunit.exception.NullNameException;
import com.mileStoneJunit.exception.NullStudentException;

public class StudentReport {

    public String validate(Student student)
            throws NullStudentException, NullNameException, NullMarksArrayException {

        if (student == null)
            throw new NullStudentException();

        if (student.getName() == null)
            throw new NullNameException();

        if (student.getMarks() == null)
            throw new NullMarksArrayException();

        int sum = 0;

        for (int mark : student.getMarks()) {
            sum += mark;
        }

        double avg = sum / (double) student.getMarks().length;

        if (avg >= 80)
            return "A";
        else if (avg >= 60)
            return "B";
        else if (avg >= 40)
            return "C";
        else if (avg >= 35)
            return "D";
        else
            return "F";
    }
}