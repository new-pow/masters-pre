package week2.mission2.problem2;

import java.util.List;

public class Student {
    String name;
    int id;
    String major;

    // getter setter
    List<Subject> subjects;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    /**
     * 새 학생(이름, 아이디, 전공, 과목리스트)
     */
    public Student(String name, int id, String major, List<Subject> subjects) {
        this.name = name;
        this.id = id;
        this.major = major;
        this.subjects = subjects;
    }

    public int getSubjectCount() {
        return subjects.size();
    }

    public int getTotalScore() {
        int totalScore = 0;
        for (Subject subject : subjects) totalScore += subject.getScore();
        return totalScore;
    }

    public double getAverageScore() {
        int totalScore = 0;
        for (Subject subject : subjects) totalScore += subject.getScore();
        return Math.round((double) totalScore / subjects.size()*100)/100.0;
    }

    public void showStudentsInfo() {
        System.out.printf(getName()+" 학생은 "+ getSubjectCount() +"과목을 수강했습니다.\n");
        System.out.printf("총점은 "+ getTotalScore() +"점이고 평균은 "+ getAverageScore() +"점입니다.\n");
    }

    public void showStudentsId() {
        System.out.println(getId() + " " +getName());
    }
}