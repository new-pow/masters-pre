package mission2.problem2;

import mission2.problem2.Major.Major;
import mission2.problem2.score.Score;
import mission2.problem2.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    String id;
    Major major;
    List<Subject> subjects;
    List<Score> scores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Major getMajor() {
        return major;
    }

    public void setMajor(Major major) {
        this.major = major;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    public List<Score> getScores() {
        return scores;
    }

    public void setScores(List<Score> scores) {
        this.scores = scores;
    }

    public Student(String name, String id, Major major) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.subjects = new ArrayList<>();
        this.scores = new ArrayList<>();
    }

    public void addSubject(Subject subject) {
        this.subjects.add(subject);
    }
    public void addScore(Score score) {
        this.scores.add(score);
    }
    public static Student getStudentById(List<Student> list, String id) {
        for (Student student : list) {
            if (student.getId().equals(id)) return student ;
        }
        return null;
    }

}
