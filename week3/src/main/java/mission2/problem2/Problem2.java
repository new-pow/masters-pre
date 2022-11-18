package mission2.problem2;

import mission2.problem2.subject.Subject;

public class Problem2 {
    static School mySchool;
    public static void main(String[] args) {
        mySchool = School.getSchool();
        mySchool.init();
        mySchool.upgradeProblem();

        Report report = new Report(mySchool.getScoreList());
        for (Subject subject : mySchool.getSubjectList()) {
            report.write(subject);
        }
    }
}
