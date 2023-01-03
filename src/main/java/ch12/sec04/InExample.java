package ch12.sec04;

public class InExample {
    public static void main(String[] args) throws Exception{
        int speed = 0;
        int keyCode = 0;

        while(true) {
            if(keyCode != 13 && keyCode != 10) { // ENTER가 아닌 경우
                if(keyCode == 49) { // 숫자 키 1를 읽었을 경우
                    speed++;
                }
                else if(keyCode == 50) { // 숫자 키 2를 읽었을 경우
                    speed--;
                }
                else if(keyCode == 51) { // 숫자 키 3을 읽었을 경우
                    break;
                }
                System.out.println("------------------");
                System.out.println("1. 증속 | 2. 감속 | 3. 중지");
                System.out.println("------------------");
                System.out.println("현재 속도 : " + speed);
                System.out.println("선택");
            }

            keyCode = System.in.read();
        }
        System.out.println("프로그램 종료");
    }
}
