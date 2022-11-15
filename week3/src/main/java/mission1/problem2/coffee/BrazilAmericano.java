package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class BrazilAmericano extends Coffee {
    public BrazilAmericano() {
        super("BrazilAmericano ");
    }
    @Override
    public void brewing() {
        System.out.print(description);
    }
}
