package ch12.sec08;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeOperationExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd a HH:mm:ss");
        System.out.println("현재 시간 : " + now.format(dateTimeFormatter));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈 : " + result1.format(dateTimeFormatter));

        LocalDateTime result2 = now.minusMonths(2);
        System.out.println("2년 뺄셈 : " + result2.format(dateTimeFormatter));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 덧셈 : " + result3.format(dateTimeFormatter));
    }
}
