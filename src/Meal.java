public class Meal {
    private String taste;
    private String colour;
    private int prices;

    private View names;
    public Meal(String colour, int prices) {
        this.colour = colour;
        this.prices = prices;
    }

    public int getPrices() {
        return prices;
    }

    public String getColour() {
        return colour;
    }

    public String getTaste() {
        return taste;
    }
}