package scenarioCustomValidation;

import java.lang.reflect.Field;

// Step 3: Reflection-based on Validator Utility
class Validator {
    public static void validate(Object obj) {
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(NotEmpty.class)) {
                field.setAccessible(true); // allow access to private fields
                try {
                    Object value = field.get(obj);
                    if (value == null || value.toString().trim().isEmpty()) {
                    	System.out.println("Warning: Field '" + field.getName() + 
                                "' in class '" + clazz.getSimpleName() + 
                                "' must not be empty!");
                    }
                } catch (IllegalAccessException e) {
                    System.err.println("Error accessing field: " + field.getName());
                }
            }
        }
    }
}
