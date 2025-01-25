package com.builder.learning.annotation;

import com.builder.learning.annotation.annotations.TestAnnotation.FieldAnnotation;
import com.builder.learning.annotation.annotations.TestAnnotation.MethodAnnotation;
import com.builder.learning.annotation.annotations.TestAnnotation.ClassAnnotation;
import com.builder.learning.annotation.commons.TestClass;

public class Run {


    //main method
    public static void main(String[] args) {
        System.out.println("hello suniti");
        TestClass testClass = new TestClass();

        ClassAnnotation classAnnotation = testClass.getClass().getAnnotation(ClassAnnotation.class);
        if (classAnnotation != null) {
            System.out.println("creator: " + classAnnotation.creator());
            System.out.println("metaData: " + classAnnotation.classMetaData());
        }

    }
}
