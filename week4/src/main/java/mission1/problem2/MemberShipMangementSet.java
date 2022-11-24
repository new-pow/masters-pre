package mission1.problem2;

import mission1.Report;
import mission1.domain.GRADE;
import mission1.domain.Member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MemberShipMangementSet {

    Set<Member> memberList;

    public MemberShipMangementSet() {
        this.memberList = new HashSet<>();
    }

    public boolean addMemberShip(int i, String name, GRADE grade) {
        boolean flag = true;
        Member newMember = new Member(i,name,grade);
        for (Member member : memberList) {
            if (member.equals(newMember)) {
                flag = false;
                break;
            }
        }
        if (flag) {
            memberList.add(newMember);
            return true;
        }
        System.out.println(Report.getErrorAddExistMember(i));
        return false;
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
