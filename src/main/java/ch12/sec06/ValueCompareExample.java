package ch12.sec06;

public class ValueCompareExample {
    public static void main(String[] args) {
        Integer object1 = 300;
        Integer object2 = 300;
        System.out.println("(object1 == object2) : " + (object1 == object2));
        System.out.println("object1.equals(object2) = " + object1.equals(object2));
        System.out.println();

        Integer object3 = 10;
        Integer object4 = 10;
        System.out.println("(object3 == object4) : " + (object3 == object4)); // -128~127 범위값일 경우
        System.out.println("object3.equals(object4) = " + object3.equals(object4));
    }
}
