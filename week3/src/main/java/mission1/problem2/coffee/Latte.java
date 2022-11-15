package mission1.problem2.coffee;

import mission1.problem2.Coffee;

public class Latte extends Coffee {
    private Coffee coffee;

    public Latte(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print("Adding Milk ");
    }
}
