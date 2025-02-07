package Tasks_9.Task7;

public class Main {
    public static void main(String[] args) {
        Flower[] bouquet1 = {new Rose(), new Tulip()};
        Flower[] bouquet2 = {new Carnation(), new Rose()};
        Flower[] bouquet3 = {new Tulip(), new Carnation()};

        System.out.println("Цена букета 1: " + (bouquet1[0].price + bouquet1[1].price));
        System.out.println("Цена букета 2: " + (bouquet2[0].price + bouquet2[1].price));
        System.out.println("Цена букета 3: " + (bouquet3[0].price + bouquet3[1].price));
    }
}