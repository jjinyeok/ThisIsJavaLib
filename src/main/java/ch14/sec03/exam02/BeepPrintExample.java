package ch14.sec03.exam02;

import lombok.extern.slf4j.Slf4j;

import java.awt.*;


public class BeepPrintExample {
    public static void main(String[] args) {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                for(int i = 0; i < 5; i++) {
                    toolkit.beep();
                    try {
                        Thread.sleep(1000);
                    }
                    catch (Exception e) {
                    }
                }
            }
        });
        thread.start();

        for(int i = 0; i < 5; i++) {
            System.out.println("띵");
            try {
                Thread.sleep(1000);
            }
            catch (Exception e) {
            }
        }
    }
}
