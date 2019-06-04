package com.z.highknowlage.DesignPattern;


/*
 * ：Created by z on 2019/6/3
 */
public class ElementA extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementA(this);
    }
    public void operationA(){

    }
}
