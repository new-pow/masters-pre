package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class Latte extends Coffee {
    private Coffee coffee;

    public Latte(Coffee coffee) {
        super("Adding Milk ");
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(description);
    }
}
