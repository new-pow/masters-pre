package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class WhippedCream extends Coffee {

    public WhippedCream() {
        super();
        this.description = "Adding WhippedCream ";
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(description);
    }
}
