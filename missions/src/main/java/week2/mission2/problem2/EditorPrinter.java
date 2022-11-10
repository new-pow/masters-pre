package week2.mission2.problem2;

public class EditorPrinter {
    private static final String editorOn = "점수 정보 수정을 원한다면 1을 입력하세요 >> ";
    private static final String selectStudent = "수정할 학생의 아이디를 입력하세요 >> ";
    private static final String selectSubject = "수정할 과목코드를 입력하세요 >> ";
    private static final String editScore = "새로운 점수를 입력하세요 >> ";
    private static final String done = "수정 완료되었습니다.";
    private static final String error = "수정에 실패하였습니다.";

    public static void printEditorOn () {
        System.out.print(editorOn);
    }

    public static void printSelectStudent () {
        System.out.print(selectStudent);
    }

    public static void printSelectSubject () {
        System.out.print(selectSubject);
    }

    public static void printEditScore () {
        System.out.print(editScore);
    }

    public static void printDone () {
        System.out.println(done+"\n");
    }

    public static void printError () {
        System.out.print(error+"\n");
    }
}
