package com.mkyong.core;

public class HelloWorld {
    private String name;
 
    public void setName(String _name) {
	name = _name;
    }

    public void printHello() {
	System.out.println( "Spring 3: Hello " + name + "!");
    }
}