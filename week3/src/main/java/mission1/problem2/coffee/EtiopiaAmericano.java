package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class EtiopiaAmericano extends Coffee {
    private final String DESCRIPTION = "EtiopiaAmericano ";
    @Override
    public void brewing() {
        System.out.print(DESCRIPTION);
    }
}
