package mission1.problem1.member;

public class Member {
    protected String name;
    protected String grade;
    protected double discountRate;
    protected double pointRate;
    protected boolean counselor;
    protected int parkingFee;
    protected int hour;
    protected int point;

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public double getDiscount() {
        return discountRate;
    }

    public void setDiscount(double discount) {
        this.discountRate = discount;
    }

    public double getPointRate() {
        return pointRate;
    }

    public void setPointRate(double pointRate) {
        this.pointRate = pointRate;
    }

    public boolean isCounselor() {
        return counselor;
    }

    public void setCounselor(boolean counselor) {
        this.counselor = counselor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(int parkingFee) {
        this.parkingFee = parkingFee;
    }

    public Member(String name) {
        this.name = name;
    }

    /** 지불 금액 계산 */
    protected int getRealPayment(int Money){
        return (int) (Money/(1-this.discountRate));
    }

    /** 적립 포인트 계산 */
    int getSavingPoint(int Money) {
        return (int) (Money*this.pointRate);
    }

    /** 주차요금 계산 */
    int getParkingFee(int hour) {
        return hour*this.parkingFee;
    }


    public String toString(int Money, int hour) {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()+"님의 지불 금액은 "+getRealPayment(Money)+"원이고, 적립 포인트는 "+getSavingPoint(Money)+"점 입니다. ");
        sb.append("주차 요금은 "+getParkingFee(hour)+"원 입니다.");
        return String.valueOf(sb);
    }

    public String toString(String name, int payment, int point, int parkingFee) {
        StringBuilder sb = new StringBuilder();
        sb.append(name+"님의 지불 금액은 "+payment+"원이고, 적립 포인트는 "+point+"점 입니다. ");
        sb.append("주차 요금은 "+parkingFee+"원 입니다.");
        return String.valueOf(sb);
    }


}
