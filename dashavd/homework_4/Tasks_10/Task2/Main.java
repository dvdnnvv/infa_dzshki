package homework_4.Tasks_10.Task2;

public class Main {
    public static void main(String[] args) {
        Vector2D v1 = new Vector2D(3.0, 4.0);
        Vector2D v2 = new Vector2D(1.0, 2.0);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);

        Vector2D v3 = v1.add(v2);
        System.out.println("v1 + v2: " + v3);

        v1.add2(v2);
        System.out.println("v1 after addition: " + v1);

        System.out.println("Scalar product: " + v1.scalarProduct(v2));
        System.out.println("Cosine of angle: " + v1.cos(v2));
    }
}