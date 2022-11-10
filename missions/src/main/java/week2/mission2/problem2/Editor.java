package week2.mission2.problem2;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Editor {
    School school;
    private static Scanner sc = new Scanner(System.in);

    public static void askEdit(School school) throws IOException {
        EditorPrinter.printEditorOn();
        int input = sc.nextInt();
        if (input == 1) {
            runEditor(school);
        }
    }
    public static void runEditor(School school) throws IOException {
        System.out.println();
        school.showAllStudentsId();

        System.out.println();
        EditorPrinter.printSelectStudent();
        int studentId = sc.nextInt();
        Student student = school.searchStudent(studentId);
        Subject subject = selectScore(student);

        editSubject(subject);
        InputOutput.saveContents(school.getStudents());
        school.showAllStudentsInfo();
    }

    private static void editSubject(Subject subject) {
        try {
            EditorPrinter.printEditScore();
            int newScore = sc.nextInt();
            subject.setScore(newScore);
            EditorPrinter.printDone();
        } catch (NumberFormatException e) {
            EditorPrinter.printError();
        }

    }

    private static Subject selectScore(Student student) {
        int count = 1;
        List<Subject> subjects = student.getSubjects();
        for (Subject s : subjects) {
            System.out.println(count++ + " " +s.getName() + " " + s.getScore());
        }
        EditorPrinter.printSelectSubject();
        sc.nextLine();
        int idx = sc.nextInt();

        return subjects.get(idx-1);
    }
}
