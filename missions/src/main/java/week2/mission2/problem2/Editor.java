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
    private static void runEditor(School school) throws IOException {
        System.out.println();
        school.showAllStudentsId();

        System.out.println();

        EditorPrinter.printSelectStudent();     // 학생 id로 선택
        int studentId = sc.nextInt();
        Student student = school.searchStudent(studentId);

        Subject subject = selectScore(student); // 과목 선택
        editSubject(subject);                   // 점수 수정

        InputOutput.saveContents(school.getStudents()); // 수정된 사항 파일에 저장

        school.showAllStudentsInfo();           // 다시 학생 정보 보기
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
