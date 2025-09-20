package scenario4;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

// Step 1. Define a custom annotation
	@Target({ElementType.TYPE, ElementType.METHOD, ElementType.FIELD})
	@interface DebugInfo {
	    String value();
	}
