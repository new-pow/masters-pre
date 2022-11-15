package mission1.problem2.topping;

import mission1.problem2.Coffee;

public class WhippedCream extends Coffee {
    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print("Adding WhippedCream ");
    }
}
