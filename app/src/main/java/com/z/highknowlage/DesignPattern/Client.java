package com.z.highknowlage.DesignPattern;

/*
 * ：Created by z on 2019/6/4
 */

public class Client {

    public static void main(String[] args){

        ObjectStructure objectStructure = new ObjectStructure();
        Element elementA = new ElementA();
        Element elementB = new ElementB();

        objectStructure.addElement(elementA);
        objectStructure.addElement(elementB);

        Visitor visitor = new ConcreteVisitorA();

        objectStructure.handleRequest(visitor);

    }

}
