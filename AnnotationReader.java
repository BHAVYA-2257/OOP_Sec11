package demoAnnotation;

import java.lang.reflect.Method;

public class AnnotationReader {
    public static void main(String[] args) {
        try {
            // Load the class using reflection
            Class<?> clazz = Class.forName("demoAnnotation.UserService");

            // Class-level annotation
            if (clazz.isAnnotationPresent(APIDescription.class)) {
                APIDescription classAnnotation = clazz.getAnnotation(APIDescription.class);
                System.out.println("Class Description: " + classAnnotation.description());
            }

            // Method-level annotations
            for (Method method : clazz.getDeclaredMethods()) {
                if (method.isAnnotationPresent(APIDescription.class)) {
                    APIDescription methodAnnotation = method.getAnnotation(APIDescription.class);
                    System.out.println("Method: " + method.getName() +
                                       " | Description: " + methodAnnotation.description());
                }
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
