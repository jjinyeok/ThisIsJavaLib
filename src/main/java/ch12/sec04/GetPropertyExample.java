package ch12.sec04;

import java.util.Properties;

public class GetPropertyExample {
    public static void main(String[] args) {
        String osName = System.getProperty("os.name");
        String userName = System.getProperty("user.name");
        String userHome = System.getProperty("user.home");
        System.out.println(osName); // Mac OS X
        System.out.println(userName);  // jjinyeok
        System.out.println(userHome); // /Users/jjinyeok

        System.out.println();
        System.out.println("key : value");
        Properties properties = System.getProperties();
        for (Object object : properties.keySet()) {
            String key = (String) object;
            String value = System.getProperty(key);
            System.out.println(key + " : " + value);
        }
    }
}
