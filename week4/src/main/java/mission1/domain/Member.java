package mission1.domain;

import java.util.Iterator;
import java.util.Objects;

public class Member implements Comparable<Member> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Member member = (Member) o;
        return id == member.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public int compareTo(Member o) {
        return this.getId()-o.getId();
    }

//    @Override
//    public int compareTo(Member o) {
//        return this.getName().compareTo(o.getName());
//    }
}
