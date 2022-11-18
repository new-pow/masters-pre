package mission02.problem2.subject;

import mission02.problem2.Student;
import mission02.problem2.grade.GradeEvaluation;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    int id;
    static int increadId = 1000;
    String name;
    List<Student> studentList;
    // 0 기본, 2 PassFail
    int gradeEvaluation;

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getGradeEvaluation() {
        return gradeEvaluation;
    }

    public Subject() {
        this.id = increadId++;
        studentList = new ArrayList<>();
    }

    public void addStudentToSubject(Student student) {
        studentList.add(student);
    }
}
