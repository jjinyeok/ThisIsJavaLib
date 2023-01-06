package ch12.sec12;

import java.lang.reflect.Method;

public class PrintAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method[] declaredMethods = Service.class.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            PrintAnnotation printAnnotation = declaredMethod.getAnnotation(PrintAnnotation.class);
            System.out.println(printAnnotation);
            printLine(printAnnotation);
            declaredMethod.invoke(new Service());
            printLine(printAnnotation);
        }
    }

    private static void printLine(PrintAnnotation printAnnotation) {
        if(printAnnotation != null) {
            int num = printAnnotation.number();
            for(int i = 0; i < num; i++) {
                String value = printAnnotation.value();
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
