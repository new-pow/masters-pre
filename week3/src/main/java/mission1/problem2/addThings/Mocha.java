package mission1.problem2.addThings;

import mission1.problem2.Coffee;

public class Mocha extends Coffee {

    Mocha() {
        this.description= "Adding Mocha Syrup ";
    }

    @Override
    public void brewing() {
        coffee.brewing();
        System.out.print(description);
    }
}
