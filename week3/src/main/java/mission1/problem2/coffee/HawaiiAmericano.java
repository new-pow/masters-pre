package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class HawaiiAmericano extends Coffee {
    private final String DESCRIPTION = "HawaiiAmericano ";
    @Override
    public void brewing() {
        System.out.print(DESCRIPTION);
    }
}
