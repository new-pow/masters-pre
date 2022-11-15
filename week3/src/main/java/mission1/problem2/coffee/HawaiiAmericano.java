package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class HawaiiAmericano extends Coffee {
    public HawaiiAmericano() {
        super("HawaiiAmericano ");
    }
    @Override
    public void brewing() {
        System.out.print(description);
    }
}
