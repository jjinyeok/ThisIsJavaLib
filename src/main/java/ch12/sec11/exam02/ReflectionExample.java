package ch12.sec11.exam02;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionExample {
    public static void main(String[] args) {
        Class clazz = Car.class;
        System.out.println("[생성자 정보]");
        Constructor[] declaredConstructors = clazz.getDeclaredConstructors();
        for (Constructor declaredConstructor : declaredConstructors) {
            String name = declaredConstructor.getName();
            System.out.print(name + "(");
            Class[] parameterTypes = declaredConstructor.getParameterTypes();
            printParameters(parameterTypes);
        }
        System.out.println();

        System.out.println("[필드 정보]");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getType().getName() + " " + field.getName());
        }
        System.out.println();

        System.out.println("[메소드 정보]");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.print(declaredMethod.getName() + "(");
            Class[] parameterTypes = declaredMethod.getParameterTypes();
            printParameters(parameterTypes);
        }
    }
    private static void printParameters (Class[] parameterTypes) {
        if(parameterTypes.length == 0) {
            System.out.println(")");
        }
        for (int i = 0; i < parameterTypes.length; i++) {
            System.out.print(parameterTypes[i].getName());
            if(i < parameterTypes.length - 1) {
                System.out.print(", ");
            }
            else {
                System.out.println(")");
            }
        }
    }
}
