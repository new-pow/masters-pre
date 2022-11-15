package mission1.problem2.topping;

import mission1.problem2.Coffee;

public class Mocha extends Coffee {

    private Coffee coffee;

    public Mocha(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print("Adding Mocha Syrup ");
    }
}
