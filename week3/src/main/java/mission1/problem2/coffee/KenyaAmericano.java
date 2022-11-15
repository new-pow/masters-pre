package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class KenyaAmericano extends Coffee {
    private final String DESCRIPTION = "KenyaAmericano ";
    @Override
    public void brewing() {
        System.out.print(DESCRIPTION);
    }
}
