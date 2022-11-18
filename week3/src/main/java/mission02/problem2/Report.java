package mission02.problem2;

import mission02.problem2.Major.Major;
import mission02.problem2.grade.BasicEvaluation;
import mission02.problem2.grade.GradeEvaluation;
import mission02.problem2.grade.MajorEvalution;
import mission02.problem2.grade.PassFailEvaluation;
import mission02.problem2.score.Score;
import mission02.problem2.score.ScoreService;
import mission02.problem2.subject.Subject;

import java.util.List;

public class Report {
    static StringBuilder sb;
    static List<Score> scores;
    private final String LINE = "------------------------------\n";
    private final String TOP_LINE= " 이름 | 학번 | 중점과목 | 점수 \n";
    private final String TITLE = " 수강생 학점\n";
    private final String SPLIT = "\t| ";

    public Report(List<Score> scoreList) {
        this.scores = scoreList;
        sb = new StringBuilder();
    }

    public void write (Subject subject) {
        sb.append(LINE+subject.getName()+TITLE+TOP_LINE+LINE);
        List<Score> scoresBySubject = ScoreService.getScoresBySubject(scores, subject);

        for (Score score : scoresBySubject) {
            writeLine(score, subject);
        }

        sb.append(LINE);
        System.out.println(sb.toString());
        sb.setLength(0);
    }

    private void writeLine (Score score, Subject subject) {
        Student student = score.getStudent();
        Subject majorSubject = student.getMajor().getMainSubject();

        GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvalution(), new PassFailEvaluation()};

        int i = subject.getGradeEvaluation();
        if (subject.getGradeEvaluation()==0 && majorSubject == subject) i=1;

        sb.append(student.getName()+SPLIT);
        sb.append(student.getId()+SPLIT);
        sb.append(majorSubject.getName()+SPLIT);
        sb.append(score.getPoint()+":"+ gradeEvaluation[i].getGrade(score.getPoint())+SPLIT);
        sb.append("\n");
    }
}
