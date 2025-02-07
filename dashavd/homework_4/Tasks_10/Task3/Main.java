package homework_4.Tasks_10.Task3;

public class Main {
    public static void main(String[] args) {
        RationalFraction fraction1 = new RationalFraction(2, 3);
        RationalFraction fraction2 = new RationalFraction(3, 4);
        
        System.out.println("ДРОБЬ 1: " + fraction1);
        System.out.println("Дробь 2: " + fraction2);
        
        RationalFraction result = fraction1.add(fraction2);
        System.out.println("сумма: " + result);
        
        fraction1.add2(fraction2);
        System.out.println("сумма после добавления: " + fraction1);
        
        RationalFraction resultSub = fraction1.sub(fraction2);
        System.out.println("разница: " + resultSub);
    }
}