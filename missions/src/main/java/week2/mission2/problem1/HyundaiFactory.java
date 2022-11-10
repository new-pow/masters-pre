package week2.mission2.problem1;

public class HyundaiFactory {
    // 인스턴스 만들때마다 누적되야 하므로 static
    private static int id;

    // 생성자 호출시 각 공장 인스턴스마다 초기화
    public static HyundaiFactory getFactory() {
        id = 1000;
        return new HyundaiFactory();
    }

    public Car createCar() {
        return new Car(id++);
    }
}
