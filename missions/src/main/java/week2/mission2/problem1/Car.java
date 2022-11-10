package week2.mission2.problem1;

public class Car {
    private int carNo;

    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public Car(int carNo) {
        this.carNo = carNo;
    }

    public String showCarNumber() {
        String carNo = String.valueOf(getCarNo());
        return carNo;
    }
}
