package com.fundamentosplatzi.springboot.fundamentos.bean;

public class ForDependencyImplementation implements ForDependency{
    @Override
    public void show() {
        System.out.println("Soy yna implementacion de for dependency");
    }
}
