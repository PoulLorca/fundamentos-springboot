package com.fundamentosplatzi.springboot.fundamentos.bean;

public class MyCreationImplementation implements MyCreation{

    private ForDependency forDependency;

    public MyCreationImplementation(ForDependency forDependency) {
        this.forDependency = forDependency;
    }

    @Override
    public void show() {
        forDependency.show();
        System.out.println("Hola desde mi creacion");
    }
}
