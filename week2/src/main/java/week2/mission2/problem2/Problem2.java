package week2.mission2.problem2;

import java.io.IOException;
import java.util.List;

import static week2.mission2.problem2.InputOutput.addStudents;

public class Problem2 {
    public static void main(String[] args) throws IOException {
        School school = new School();

        List<String> contents = InputOutput.getContents();

        for (int i=1; i<contents.size(); i++) {
            addStudents(school, contents.get(i));
        }

        System.out.println();

        school.showAllStudentsInfo();
    }
}
