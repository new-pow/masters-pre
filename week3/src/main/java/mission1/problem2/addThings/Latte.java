package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class Latte extends Coffee {
    private Coffee coffee;
    private String DESCRIPTION ="Adding Milk ";

    public Latte(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(DESCRIPTION);
    }
}
