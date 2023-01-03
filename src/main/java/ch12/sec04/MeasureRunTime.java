package ch12.sec04;

public class MeasureRunTime {
    public static void main(String[] args) {
        long time1 = System.nanoTime(); // 현재 시간 (나노초 단위)
        int sum = 0;
        for(int i = 0; i < 1000000; i++) {
            sum += i;
        }
        long time2 = System.nanoTime(); // 현재 시간 (나노초 단위)

        System.out.println("0부터 1000000까지의 합 : " + sum);
        System.out.println("계산에 " + (time2 - time1) + "나노초가 소요되었습니다.");
    }
}
