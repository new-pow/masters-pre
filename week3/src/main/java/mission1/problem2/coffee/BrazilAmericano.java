package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class BrazilAmericano extends Coffee {
    private final String DESCRIPTION = "BrazilAmericano ";
    @Override
    public void brewing() {
        System.out.print(DESCRIPTION);
    }
}
