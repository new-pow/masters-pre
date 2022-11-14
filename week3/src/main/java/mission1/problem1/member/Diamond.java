package mission1.problem1.member;

public class Diamond extends Member{
    private String grade = "DIAMOND";
    private double discountRate = 0.10;
    private double pointRate = 0.10;
    private boolean counselor = true;
    private int parkingFee = 0; // per hour


    public Diamond(String name) {
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
