package mission1.problem2.domain;

public enum GRADE {
    SILVER(0.01, false, 3000),
    VIP(0.05, false, 1000),
    PLATINUM(0.1, true, 0);

    private double pointRate;
    private boolean counselor;
    private int parkingFee;

    GRADE(double pointRate, boolean counselor, int parkingFee) {
        this.pointRate = pointRate;
        this.counselor = counselor;
        this.parkingFee = parkingFee;
    }

    public double getPointRate() {
        return pointRate;
    }

    public boolean isCounselor() {
        return counselor;
    }

    public int getParkingFee() {
        return parkingFee;
    }
}
