package mission1.problem3;

public class Report {

    static final String SHOW_MEMBERLIST_MESSAGE = "%s님의 아이디는 %d이고 등급은 %s입니다.";
    static final String LINE = "=========================";
    static final String EDIT_EXIST_MEMBER = "이미 있는 아이디 %d의 값이 변경됩니다.";

    // ERROR
    static final String ERROR_REMOVE_NO_MEMBER = "%d에 해당하는 멤버가 없습니다.";
    static final String ERROR_ADD_EXIST_MEMBER = "이미 있는 아이디 %d는 추가할 수 없습니다.";

    public static String getMemberInfo (String name, int id, String grade) {
        return String.format(SHOW_MEMBERLIST_MESSAGE, name, id, grade);
    }

    public static String getRemoveNoMember (int id) {
        return String.format(ERROR_REMOVE_NO_MEMBER, id);
    }
    public static String getErrorAddExistMemberMember (int id) {
        return String.format(ERROR_ADD_EXIST_MEMBER, id);
    }
    public static String getEditExistMember (int id) {
        return String.format(EDIT_EXIST_MEMBER, id);
    }


}
