package com.jvm;

public class TestClass {
    private static int m =4;
    static {
        m = 3;
        System.out.println("static");
    }

    public static void main(String[] args) {
        System.out.println(TestClass.class.getClassLoader());
        System.out.println(TestClass.class.getClassLoader().getParent());
        System.out.println(TestClass.class.getClassLoader().getParent().getParent());
    }
}
