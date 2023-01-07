package ch13.sec04;

public class GenericExample {
    private static <T extends Number> boolean compare(T t1, T t2) {
        System.out.println("compare(" + t1.getClass().getName() + ", " + t2.getClass().getName() + ")");

        double v1 = t1.doubleValue();
        double v2 = t2.doubleValue();

        return (v1 == v2);
    }

    public static void main(String[] args) {
        boolean result1 = compare(10, 10.0);
        System.out.println("result1 : " + result1);

        boolean result2 = compare(4.5, 4.5);
        System.out.println("result2 : " + result2);
    }
}
