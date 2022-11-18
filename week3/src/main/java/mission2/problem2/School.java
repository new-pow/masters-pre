package mission2.problem2;

import mission2.problem2.Major.Major;
import mission2.problem2.score.Score;
import mission2.problem2.subject.Dance;
import mission2.problem2.subject.Korean;
import mission2.problem2.subject.Math;
import mission2.problem2.subject.Subject;

import java.util.*;

import static mission2.problem2.Student.getStudentById;
import static mission2.problem2.Major.Major.getMajorById;

public class School {
    private static School school;
    private static List<Subject> subjectList;
    private static List<Major> majorList;
    private static List<Student> studentList;
    private static List<Score> scoreList;
    Subject korean = new Korean();
    Subject math = new Math();
    Subject dance = new Dance();

    public static School getSchool() {
        if (school==null) school = new School();
        return school;
    }

    public static List<Subject> getSubjectList() {
        return subjectList;
    }

    public static List<Major> getMajorList() {
        return majorList;
    }

    public static List<Student> getStudentList() {
        return studentList;
    }

    public static List<Score> getScoreList() {
        return scoreList;
    }

    public void init() {
        this.subjectList = Arrays.asList(korean,math,dance);
        this.majorList = Arrays.asList(
                new Major("국어국문학과", korean),
                new Major("컴퓨터공학과", math)
        );
        this.studentList = Arrays.asList(
                new Student("김감찬", "211213", getMajorById(majorList, 100)),
                new Student("김유신", "212330", getMajorById(majorList, 101)),
                new Student("신사임당", "201518", getMajorById(majorList, 100)),
                new Student("이순신", "202360", getMajorById(majorList, 100)),
                new Student("홍길동", "201290", getMajorById(majorList, 101))
        );
        this.scoreList = new ArrayList<>();
        scoreList.add(new Score(getStudentById(studentList, "211213"), korean, 95));
        scoreList.add(new Score(getStudentById(studentList, "211213"), math, 56));

        scoreList.add(new Score(getStudentById(studentList, "212330"), korean, 95));
        scoreList.add(new Score(getStudentById(studentList, "212330"), math, 98));

        scoreList.add(new Score(getStudentById(studentList, "201518"), korean, 100));
        scoreList.add(new Score(getStudentById(studentList, "201518"), math, 88));

        scoreList.add(new Score(getStudentById(studentList, "202360"), korean, 89));
        scoreList.add(new Score(getStudentById(studentList, "202360"), math, 95));

        scoreList.add(new Score(getStudentById(studentList, "201290"), korean, 83));
        scoreList.add(new Score(getStudentById(studentList, "201290"), math, 56));
    }

    public void upgradeProblem() {
        scoreList.add(new Score(getStudentById(studentList,"211213"),dance,95));
        scoreList.add(new Score(getStudentById(studentList,"212330"),dance,95));
        scoreList.add(new Score(getStudentById(studentList,"201518"),dance,95));
    }
}
