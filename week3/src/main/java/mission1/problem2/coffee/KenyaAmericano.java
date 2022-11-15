package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class KenyaAmericano extends Coffee {
    public KenyaAmericano() {
        super("KenyaAmericano ");
    }
    @Override
    public void brewing() {
        System.out.print(description);
    }
}
