package mission2.problem2;

import mission2.problem2.grade.BasicEvaluation;
import mission2.problem2.grade.GradeEvaluation;
import mission2.problem2.grade.MajorEvalution;
import mission2.problem2.grade.PassFailEvaluation;
import mission2.problem2.score.Score;
import mission2.problem2.score.ScoreService;
import mission2.problem2.subject.Subject;

import java.util.List;

public class Report {
    static StringBuilder sb;
    static List<Score> scores;
    private final String LINE = "------------------------------\n";
    private final String TOP_LINE= " 이름 | 학번 | 중점과목 | 점수 \n";
    private final String TITLE = " 수강생 학점\n";
    private final String SPLIT = "\t| ";
    private static GradeEvaluation[] gradeEvaluation = {
            new BasicEvaluation(), new MajorEvalution(), new PassFailEvaluation()
    };

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

        int i = subject.getGradeEvaluation();

        // Basic을 따르고 전공과목일 때
        if (subject.getGradeEvaluation()==0 && majorSubject == subject) i=1;

        // 학생정보
        sb.append(student.getName()+SPLIT);
        sb.append(student.getId()+SPLIT);
        sb.append(majorSubject.getName()+SPLIT);

        // 점수
        sb.append(score.getPoint()+":"+ gradeEvaluation[i].getGrade(score.getPoint())+SPLIT);
        sb.append("\n");
    }
}
