package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class WhippedCream extends Coffee {
    private Coffee coffee;

    public WhippedCream(Coffee coffee) {
        super("Adding WhippedCream ");
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(description);
    }
}
