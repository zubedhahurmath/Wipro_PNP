package miniProject3.mile1.service;

import miniProject3.mile1.bean.Student;

public class StudentService {

    // Count objects whose marks array is null
    public int findNumberOfNullMarksArray(Student[] s) {

        int count = 0;

        if (s != null) {
            for (Student student : s) {

                if (student != null && student.getMarks() == null) {
                    count++;
                }

            }
        }

        return count;
    }

    // Count objects whose name is null
    public int findNumberOfNullName(Student[] s) {

        int count = 0;

        if (s != null) {
            for (Student student : s) {

                if (student != null && student.getName() == null) {
                    count++;
                }

            }
        }

        return count;
    }

    // Count null objects
    public int findNumberOfNullObjects(Student[] s) {

        int count = 0;

        if (s != null) {
            for (Student student : s) {

                if (student == null) {
                    count++;
                }

            }
        }

        return count;
    }
}