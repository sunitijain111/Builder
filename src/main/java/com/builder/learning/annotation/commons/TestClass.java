package com.builder.learning.annotation.commons;

import com.builder.learning.annotation.annotations.TestAnnotation;

//class to use annotations on
@TestAnnotation.ClassAnnotation(
        classMetaData = "this is a test class to test annotations",
        creator = "suniti jain"
)
public class TestClass {

    @TestAnnotation.FieldAnnotation(fieldName = "field1")
    Integer integer;

    @TestAnnotation.FieldAnnotation(fieldName = "field2")
    String string;

    @TestAnnotation.MethodAnnotation(setterFieldName = "field1")
    void setInteger(Integer value) {
        integer = value;
    }

    @TestAnnotation.MethodAnnotation(setterFieldName = "field2")
    void setString(String value) {
        string = value;
    }

    public TestClass() {
        System.out.println("test object created");
    }
}