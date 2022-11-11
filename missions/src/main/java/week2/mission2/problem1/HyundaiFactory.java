package week2.mission2.problem1;

public class HyundaiFactory {
    // 인스턴스 만들때마다 누적되야 하므로 static
    private static int id;
    private static HyundaiFactory hyundaiFactory;

    public static HyundaiFactory getFactory() {
        if (hyundaiFactory == null) {
            hyundaiFactory = new HyundaiFactory();
        }
        return hyundaiFactory;
    }

    // 생성자 호출시 각 공장 인스턴스마다 초기화
    private HyundaiFactory() {
        id = 1000;
    }

    public Car createCar() {
        return new Car(id++);
    }
}
