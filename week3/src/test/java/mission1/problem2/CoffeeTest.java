package mission1.problem2;

import mission1.problem2.coffee.*;
import mission1.problem2.topping.Mocha;
import mission1.problem2.topping.WhippedCream;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {
    @Test

    public static void main(String[] args) {

        Coffee etiopiaAmericano = new EtiopiaAmericano();
        etiopiaAmericano.brewing();
        System.out.println();

        Coffee kenyaAmericano = new KenyaAmericano();
        kenyaAmericano.brewing();
        System.out.println();

        Coffee kenyaLatte = new Latte(kenyaAmericano);
        kenyaLatte.brewing();
        System.out.println();

        Coffee brazilMocha = new Mocha(new Latte(new BrazilAmericano()));
        brazilMocha.brewing();
        System.out.println();

        Coffee hawaiiWhippedMocha =
                new WhippedCream(new Mocha(new Latte( new HawaiiAmericano())));
        hawaiiWhippedMocha.brewing();
        System.out.println();

    }
}