package ch14.sec03.exam03;

public class BeepPrintExample {
    public static void main(String[] args) {
        MyThread thread = new MyThread();
        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(500);
            }
            catch (Exception e) {
            }
        }
    }
}
