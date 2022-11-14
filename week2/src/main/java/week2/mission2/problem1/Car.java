package week2.mission2.problem1;

public class Car {
    private int carNo;
    private static int number = 1000;


    public int getCarNo() {
        return carNo;
    }

    public void setCarNo(int carNo) {
        this.carNo = carNo;
    }

    public Car() {
        this.carNo = number++;
    }

    public String showCarNumber() {
        String carNo = String.valueOf(getCarNo());
        return carNo;
    }
}
