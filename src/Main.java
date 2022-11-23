public class Main {
    public static void main(String[] args) {
        Meal meal = new Meal("red", 30);
        Apples apples1 = new Apples("red", 20);
        Apples apples2 = new Apples("green", 25);
        Apples apples3 = new Apples("pink", 35);

        apples1.i("sweet", "red", 20);
        apples2.l(25, "green");
        apples3.m("sour", "pink");
        System.out.println(View.RedDelicious + " " + apples1.getColour() + " " + apples1.getTaste() + " " + apples1.getTaste());
        System.out.println(View.GrannySmith + " " + apples2.getColour() + " " + apples2.getPrices());
        System.out.println(View.PinkLady + " " + apples3.getTaste() + " " + apples3.getPrices());
    }
    }



    