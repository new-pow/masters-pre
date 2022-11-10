package week2.mission2.problem2;

public class Subject {
    String name;
    int score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Subject() {}

    public Subject(String name, String score) {
        this.name = name;
        this.score = Integer.parseInt(score);
    }
}
