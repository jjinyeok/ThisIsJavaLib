package ch12.sec03.exam01;

public class EqualsExample {
    public static void main(String[] args) {
        Member member1 = new Member("blue");
        Member member2 = new Member("blue");
        Member member3 = new Member("red");

        if(member1.equals(member2)) {
            System.out.println("member1과 member2는 동등합니다.");
        }
        else {
            System.out.println("member1과 member2는 동등하지 않습니다.");
        }

        if(member1.equals(member3)) {
            System.out.println("member1과 member3는 동등합니다.");
        }
        else {
            System.out.println("member1과 member3는 동등하지 않습니다.");
        }
    }
}
