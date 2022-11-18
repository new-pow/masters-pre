package mission1.problem2.topping;

import mission1.problem2.Coffee;

public class Topping extends Coffee {

    Coffee coffee;

    public Topping(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(description);
    }
}
