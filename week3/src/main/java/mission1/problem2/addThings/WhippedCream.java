package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class WhippedCream extends Coffee {
    private Coffee coffee;
    private final String DESCRITION = "Adding WhippedCream ";

    public WhippedCream(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(DESCRITION);
    }
}
