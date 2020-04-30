package com.jvm;

public class MyClassLoad extends ClassLoader {

    private String path;
    private String classLoadName;
    

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        return super.findClass(name);
    }
}
