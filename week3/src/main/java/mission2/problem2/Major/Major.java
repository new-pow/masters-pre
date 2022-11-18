package mission2.problem2.Major;

import mission2.problem2.Student;
import mission2.problem2.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Major {
    private int id;
    private static int increaseId = 100;
    private String name;
    private Subject mainSubject;
    private List<Student> studentList;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Subject getMainSubject() {
        return mainSubject;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public Major(String name, Subject mainSubject) {
        this.id = increaseId++;
        this.name = name;
        this.mainSubject = mainSubject;
        this.studentList = new ArrayList<>();
    }

    public static Major getMajorById(List<Major> list, int id) {
        for (Major major : list) {
            if (major.getId() == id) return major;
        }
        return null;
    }
}
