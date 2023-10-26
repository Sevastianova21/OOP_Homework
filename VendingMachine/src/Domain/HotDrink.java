package Domain;

public class HotDrink extends Product{
    private int temperature;

    public HotDrink(String name, int price, PrType type, int temperature) {
        super(name, price, type);
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return super.toString() + "; temperature=" + temperature;
    }
}
