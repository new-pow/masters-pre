package mission1.problem1;

import mission1.domain.GRADE;
import mission1.domain.Member;

import java.util.ArrayList;
import java.util.List;

public class MemberShipMangementList {

    List<Member> memberList;
    Report report;

    public MemberShipMangementList() {
        this.memberList = new ArrayList<>();
    }

    public void addMemberShip(int i, String name, GRADE grade) {
        memberList.add(new Member(i, name, grade));
    }

    public void showAllMember() {
        System.out.println(Report.LINE);

        for (Member member : memberList) {
            System.out.println(Report.getMemberInfo(member.getName(), member.getId(), member.getGrade()));
        }

        System.out.println(Report.LINE);
    }

    public boolean removeMember(int i) {
        for (Member member : memberList) {
            if (member.getId() == i) {
                memberList.remove(member);
                return true;
            }
        }
        System.out.println(Report.getRemoveNoMember(i));
        return false;
    }
}
