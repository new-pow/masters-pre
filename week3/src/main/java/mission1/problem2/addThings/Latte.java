package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class Latte extends Coffee {
    public Latte() {
        super();
        this.description = "Adding Milk ";
    }



    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(description);
    }
}
