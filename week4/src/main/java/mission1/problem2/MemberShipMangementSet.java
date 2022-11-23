package mission1.problem2;

import mission1.problem2.domain.GRADE;
import mission1.problem2.domain.Member;

import java.util.HashSet;
import java.util.Set;

public class MemberShipMangementSet {

    Set<Member> memberList;

    public MemberShipMangementSet() {
        this.memberList = new HashSet<>();
    }

    public boolean addMemberShip(int i, String name, GRADE grade) {
        boolean flag = true;
        for (Member member : memberList) {
            if (member.getId()==i) {
                flag = false;
            }
        }

        if (flag) {
            memberList.add(new Member(i,name,grade));
            return true;
        }
        System.out.println(Report.getErrorAddExistMemberMember(i));
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
