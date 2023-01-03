package ch12.sec06;

public class BoxingUnBoxingExample {
    public static void main(String[] args) {
        Integer object = 100;
        System.out.println(object.intValue());

        int value = object;
        System.out.println(value);

        int result = object + 100;
        System.out.println(result);
    }
}
