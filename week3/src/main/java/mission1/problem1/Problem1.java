package mission1.problem1;

import mission1.problem1.domain.Diamond;
import mission1.problem1.domain.Member;
import mission1.problem1.domain.Platinum;
import mission1.problem1.domain.Red;

public class Problem1 {

    public static void main(String[] args) {
        Member James = new Red("James");
        Member Tomas = new Red("Tomas");
        Member Edward = new Platinum("Edward");
        Member Percy = new Platinum("Percy");
        Member Elizabet = new Diamond("Elizabet");

        System.out.println(James.toString(10000,2));
        System.out.println();
        System.out.println(Tomas.toString(30000,2));
        System.out.println();
        System.out.println(Edward.toString(10000,2));
        System.out.println();
        System.out.println(Percy.toString(30000,2));
        System.out.println();
        System.out.println(Elizabet.toString(30000,2));
    }
}
