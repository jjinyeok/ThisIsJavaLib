package ch14.sec07.exam02;

public class PrintThread extends Thread{
    @Override
    public void run() {
        try {
            while (true) {
                System.out.println("실행 중");
                Thread.sleep(1); // Thread 일시정지 상태에 있을 때 InterruptException 가능
            }
        }
        catch (InterruptedException e) { }
        System.out.println("리소스 정리");
        System.out.println("실행 종료");
    }
}
