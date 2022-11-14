package mission1.problem1.member;

public class Platinum extends Member{
    private String grade = "PLATINUM";
    private double discountRate = 0.05;
    private double pointRate = 0.05;
    private boolean counselor = false;
    private int parkingFee = 1000; // per hour

    public Platinum(String name) {
        super(name);
    }


    @Override
    protected int getRealPayment(int Money) {
        double discount = Money*discountRate;
        return (int) (Money-discount);
    }

    @Override
    int getSavingPoint(int Money) {
        return (int) (Money*this.pointRate);
    }

    @Override
    int getParkingFee(int hour) {
        return hour*this.parkingFee;
    }

    @Override
    public String toString(int Money, int hour) {
        return super.toString(getName(), getRealPayment(Money), getSavingPoint(Money), getParkingFee(hour));
    }
}
