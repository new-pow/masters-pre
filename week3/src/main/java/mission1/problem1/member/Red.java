package mission1.problem1.member;

public class Red extends Member{

    public Red(String name) {
        super(name,"RED",0,0.01,false,3000);
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
