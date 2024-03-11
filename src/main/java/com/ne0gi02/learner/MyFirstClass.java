package com.ne0gi02.learner;

public class MyFirstClass {

    private String myVar;

    public MyFirstClass(String myVar) {
        this.myVar = myVar;
    }

    public String sayHello() {
        return ">> Hello from MyFirstClass = " + myVar;
    }
}
