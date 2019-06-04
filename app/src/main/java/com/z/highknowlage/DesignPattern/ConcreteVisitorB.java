package com.z.highknowlage.DesignPattern;

/*
 * ：Created by z on 2019/6/3
 */

public class ConcreteVisitorB implements Visitor {

    @Override
    public void visitElementA(ElementA element) {
        System.out.println("ConcreteVisitorA 访问 ElementA");
        //访问 ElementA 时，把需要实现的操作在这里实现
        //可能需要访问元素已有的功能，例如
        element.operationA();
    }

    @Override
    public void visitElementB(ElementB element) {
        System.out.println("ConcreteVisitorA 访问 ElementB");
        //访问 ElementB 时，把需要实现的操作在这里实现
        //可能需要访问元素已有的功能，例如
        element.operationB();
    }
}