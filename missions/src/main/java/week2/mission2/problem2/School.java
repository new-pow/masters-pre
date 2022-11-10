package week2.mission2.problem2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class School {
    private static int stdId; // 학생들에게 부여되는 아이디
    private static List<Student> students;

    public School() {
        stdId = 1000;
        students = new ArrayList<>();
    }

    public static List<Student> getStudents() {
        return students;
    }

    public Student initStudent(String name, String major, List<Subject> scores) {
        Student student = new Student(name, stdId++, major, scores);
        students.add(student);
        return student;
    }

    public void showAllStudentsInfo() throws IOException {
        for (Student student : students) {
            student.showStudentsInfo();
            System.out.println();
        }
        Editor.askEdit(this);
    }

    public void showAllStudentsId() {
        for (Student student : students) {
            student.showStudentsId();
        }
    }

    public static Student searchStudent(int stdId) {
        Student student = null;
        for (Student s : students) {
            if (s.getId() == stdId) student = s;
        }
        return student;
    }
}
