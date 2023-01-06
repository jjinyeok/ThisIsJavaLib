package ch12.sec08;

import java.util.TimeZone;

public class PrintTimeZoneId {
    public static void main(String[] args) {
        String[] availableIDs = TimeZone.getAvailableIDs();
        for (String availableID : availableIDs) {
            System.out.println(availableID);
        }
    }
}
