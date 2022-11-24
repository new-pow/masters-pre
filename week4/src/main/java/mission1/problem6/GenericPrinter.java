package mission1.problem6;


public class GenericPrinter<Meterial> {

    Meterial meterial;

    public void setMaterial(Meterial meterial) {
        this.meterial = meterial;
    }

    public Meterial getMaterial() {
        return meterial;
    }

    @Override
    public String toString() {
        return String.format("재료는 %s입니다.", meterial);
    }

}
