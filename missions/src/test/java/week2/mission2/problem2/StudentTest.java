package week2.mission2.problem2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class StudentTest {

    @Test
    void 학번() {
        School school = new School();

        // Kim
        List<Subject> kimScores = Arrays.asList(
                new Subject("국어", "100"),
                new Subject("수학", "100")
        );
        Student kim = school.initStudent("Kim","수학", kimScores);

        // Lee
        List<Subject> leeScores = Arrays.asList(
                new Subject("국어", "55"),
                new Subject("수학", "55"),
                new Subject("영어", "100")
        );
        Student lee = school.initStudent("Lee","국어", leeScores);

        System.out.println(kim.getId());
        System.out.println(lee.getId());
    }
}