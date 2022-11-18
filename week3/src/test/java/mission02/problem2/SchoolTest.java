package mission02.problem2;

import mission02.problem2.subject.Korean;
import mission02.problem2.subject.Math;
import mission02.problem2.subject.Subject;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {

    @Test
    void 과목_init() {
        List<Subject> subjectList = Arrays.asList(new Korean(), new Math());
        System.out.println(subjectList.get(0).getId()+" "+subjectList.get(1).getId());
    }
}