package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class EtiopiaAmericano extends Coffee {
    public EtiopiaAmericano() {
        super("EtiopiaAmericano ");
    }
    @Override
    public void brewing() {
        System.out.print(description);
    }
}
