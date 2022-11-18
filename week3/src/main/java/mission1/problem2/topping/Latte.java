package mission1.problem2.topping;

import mission1.problem2.Coffee;

public class Latte extends Topping {
    public Latte(Coffee coffee) {
        super(coffee);
        this.description = "Adding Milk ";
    }
}
