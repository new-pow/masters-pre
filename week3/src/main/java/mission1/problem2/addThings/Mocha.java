package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class Mocha extends Coffee {

    private Coffee coffee;

    public Mocha(Coffee coffee) {
        super("Adding Mocha Syrup ");
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(description);
    }
}
