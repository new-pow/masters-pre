package mission1.problem2;

public class Coffee {
    protected String description;
    protected Coffee coffee;

    public Coffee() {
        coffee.brewing();
    }

    public Coffee(Coffee coffee) {
        this.coffee = coffee;
    }

    public void brewing(){
        System.out.print(description);
    };
}
