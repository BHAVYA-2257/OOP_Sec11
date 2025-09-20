import java.lang.reflect.*;
class Example {
    private String message = "Hello, to  Java Reflection!";
    private void printMessage() {
        System.out.println(message);
    }
}

public class ReflectionDemo {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException, NoSuchFieldException  {
        // Obtain Class object or loading the class
        Class<?> clazz = Example.class;

        // Create an instance
        Object obj = clazz.getDeclaredConstructor().newInstance();

        // Access private field
        Field field = clazz.getDeclaredField("message");
        field.setAccessible(true);
        field.set(obj, "Reflection is powerful !");

        // Invoke private method
        Method method = clazz.getDeclaredMethod("printMessage");
        method.setAccessible(true);
        method.invoke(obj);
    }
}

