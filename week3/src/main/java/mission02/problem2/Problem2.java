package mission02.problem2;

import mission02.problem2.subject.Subject;

import static mission02.problem2.School.getSchool;

public class Problem2 {
    static School mySchool;
    public static void main(String[] args) {
        mySchool = getSchool();
        mySchool.init();
        mySchool.upgradeProblem();

        Report report = new Report(mySchool.getScoreList());
        for (Subject subject : mySchool.getSubjectList()) {
            report.write(subject);
        }
    }
}
