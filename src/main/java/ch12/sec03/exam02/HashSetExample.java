package ch12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        Student student1 = new Student(1, "홍길동");
        Student student2 = new Student(1, "홍길동");
        Student student3 = new Student(2, "임꺽정");

        hashSet.add(student1);
        System.out.println("hashSet 길이 : " + hashSet.size());

        hashSet.add(student2);
        System.out.println("hashSet 길이 : " + hashSet.size());

        hashSet.add(student3);
        System.out.println("hashSet 길이 : " + hashSet.size());
    }
}
