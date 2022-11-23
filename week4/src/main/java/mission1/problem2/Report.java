package mission1.problem1;

public class Report {

    static final String SHOW_MEMBERLIST_MESSAGE = "%s님의 아이디는 %d이고 등급은 %s입니다.";
    static final String LINE = "=========================";

    // ERROR
    static final String ERROR_REMOVE_NO_MEMBER = "%d에 해당하는 멤버가 없습니다.";

    public static String getMemberInfo (String name, int id, String grade) {
        return String.format(SHOW_MEMBERLIST_MESSAGE, name, id, grade);
    }

    public static String getRemoveNoMember (int id) {
        return String.format(ERROR_REMOVE_NO_MEMBER, id);
    }
}
