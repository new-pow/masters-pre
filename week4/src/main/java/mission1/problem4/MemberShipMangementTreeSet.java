package mission1.problem4;

import mission1.Report;
import mission1.domain.GRADE;
import mission1.domain.Member;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MemberShipMangementTreeSet {

    Set<Member> memberSet;

    public MemberShipMangementTreeSet() {
        this.memberSet = new TreeSet<>();
    }

    public boolean addMemberShip(int i, String name, GRADE grade) {
        Member newMember = new Member(i,name,grade);
        for (Member member : memberSet) {
            if (member.getName().equals(newMember.getName())) {
                System.out.println(Report.getErrorAddExistName(member.getName()));
                return false;
            }
            if (member.getId()== newMember.getId()) {
                System.out.println(Report.getErrorAddExistMember(i));
                return false;
            }
        }
        memberSet.add(new Member(i,name,grade));
        return true;
    }

    public void showAllMember() {
        System.out.println(Report.LINE);
        Iterator<Member> memberIterator = memberSet.iterator();

        while (memberIterator.hasNext()) {
            Member member = memberIterator.next();
            System.out.println(Report.getMemberInfo(member.getName(), member.getId(), member.getGrade()));
        }

        System.out.println(Report.LINE);
    }

    public boolean removeMember(int i) {
        for (Member member : memberSet) {
            if (member.getId() == i) {
                memberSet.remove(member);
                return true;
            }
        }
        System.out.println(Report.getRemoveNoMember(i));
        return false;
    }
}
