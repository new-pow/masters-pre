package mission02.problem2.score;

import mission02.problem2.subject.Subject;

import java.util.ArrayList;
import java.util.List;

public class ScoreService {

    /** 과목으로 점수 목록 출력 */
    public static List<Score> getScoresBySubject(List<Score> list, Subject subject) {
        List<Score> scores = new ArrayList<>();
        for (Score score : list) {
            if (score.getSubject() == subject) scores.add(score);
        }
        return scores;
    }
}
