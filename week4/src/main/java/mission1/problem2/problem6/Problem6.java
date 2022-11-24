package mission1.problem2.problem6;

import mission1.problem2.problem6.meterial.Plastic;
import mission1.problem2.problem6.meterial.Powder;

public class Problem6 {
    public static void main(String[] args) {
        GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
        powderPrinter.setMaterial(new Powder());
        Powder powder = powderPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(powderPrinter);

        GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
        plasticPrinter.setMaterial(new Plastic());
        Plastic plastic = plasticPrinter.getMaterial(); // 형변환 하지 않음
        System.out.println(plasticPrinter);

//         GenericPrinter<Water> printer = new GenericPrinter<Water>(); // 오류 코드
    }
}