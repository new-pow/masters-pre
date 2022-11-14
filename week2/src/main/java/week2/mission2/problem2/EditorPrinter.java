package week2.mission2.problem2;

public class EditorPrinter {
    private static final String EDITOR_ON = "점수 정보 수정을 원한다면 1을 입력하세요 >> ";
    private static final String SELECT_STUDENT = "수정할 학생의 아이디를 입력하세요 >> ";
    private static final String SELECT_SUBJECT = "수정할 과목코드를 입력하세요 >> ";
    private static final String EDIT_SCORE = "새로운 점수를 입력하세요 >> ";
    private static final String DONE = "수정 완료되었습니다.";
    private static final String ERROR = "수정에 실패하였습니다.";

    public static void printEditorOn () {
        System.out.print(EDITOR_ON);
    }

    public static void printSelectStudent () {
        System.out.print(SELECT_STUDENT);
    }

    public static void printSelectSubject () {
        System.out.print(SELECT_SUBJECT);
    }

    public static void printEditScore () {
        System.out.print(EDIT_SCORE);
    }

    public static void printDone () {
        System.out.println(DONE+"\n");
    }

    public static void printError () {
        System.out.print(ERROR+"\n");
    }
}
