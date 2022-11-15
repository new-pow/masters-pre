package mission1.problem1.member;

public class Platinum extends Member{

    public Platinum(String name) {
        super(name,"PLATINUM",0.05,0.05,false,1000);
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
