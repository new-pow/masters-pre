package mission2.problem2;

import mission2.problem2.subject.Korean;
import mission2.problem2.subject.Math;
import mission2.problem2.subject.Subject;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

class SchoolTest {

    @Test
    void 과목_init() {
        List<Subject> subjectList = Arrays.asList(new Korean(), new Math());
        System.out.println(subjectList.get(0).getId()+" "+subjectList.get(1).getId());
    }
}