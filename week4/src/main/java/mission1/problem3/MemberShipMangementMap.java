package mission1.problem3;

import mission1.problem3.domain.GRADE;
import mission1.problem3.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class MemberShipMangementMap {
    Map<Integer, Member> memberList;

    public MemberShipMangementMap() {
        this.memberList = new HashMap<>();
    }

    public void addMemberShip(int i, String name, GRADE grade) {
        if (memberList.get(i) != null) {
            System.out.println(Report.getEditExistMember(i));
        }
        memberList.put(i,new Member(i,name,grade));
    }

    public void showAllMember() {
        System.out.println(Report.LINE);

        for (Map.Entry<Integer, Member> memberMap : memberList.entrySet()) {
            Member member = memberMap.getValue();
            System.out.println(Report.getMemberInfo(member.getName(), member.getId(), member.getGrade()));
        }

        System.out.println(Report.LINE);
    }

    public boolean removeMember(int i) {
        if (memberList.get(i)!=null) {
            memberList.remove(i);
            return true;
        }
        System.out.println(Report.getRemoveNoMember(i));
        return false;
    }
}
