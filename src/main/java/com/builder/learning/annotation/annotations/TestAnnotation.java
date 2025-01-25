package com.builder.learning.annotation.annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//These are test annotation to see how annotation works.

public class TestAnnotation {

    @Retention(RetentionPolicy.RUNTIME)
    public @interface ClassAnnotation {
        public String classMetaData() default "";

        public String creator() default "";

    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface MethodAnnotation {
        public String setterFieldName();

    }

    @Retention(RetentionPolicy.RUNTIME)
    public @interface FieldAnnotation {
        public String fieldName();
    }
}
