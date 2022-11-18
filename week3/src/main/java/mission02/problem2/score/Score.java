package mission02.problem2.score;

import mission02.problem2.Student;
import mission02.problem2.subject.Subject;

public class Score {
    Student student;
    Subject subject;
    int point;

    public Student getStudent() {
        return student;
    }

    public Subject getSubject() {
        return subject;
    }

    public int getPoint() {
        return point;
    }

    public Score(Student student, Subject subject, int point) {
        this.student = student;
        student.addSubject(subject);
        this.subject = subject;
        subject.addStudentToSubject(student);
        this.point = point;
        student.addScore(this);
    }
}
