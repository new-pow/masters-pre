package mission1.problem2.domain;

public class Member {
    protected int id;
    protected String name;
    protected GRADE grade;

    public String getGrade() {
        return grade.name();
    }
    public String getName() {
        return name;
    }
    public int getId() { return id; }

    public Member(int id, String name, GRADE grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }
}
