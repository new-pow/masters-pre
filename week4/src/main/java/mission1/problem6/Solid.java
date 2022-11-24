package mission1.problem6;

public class Solid {
    protected String name;
    private final String FORMAT_TO_STRING = "재료는 %s입니다.";

    public Solid(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format(FORMAT_TO_STRING, name);
    }
}
