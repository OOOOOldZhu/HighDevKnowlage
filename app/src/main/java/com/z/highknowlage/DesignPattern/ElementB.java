package com.z.highknowlage.DesignPattern;


/*
 * ：Created by z on 2019/6/3
 */
public class ElementB extends Element {

    @Override
    public void accept(Visitor visitor) {
        visitor.visitElementB(this);
    }
    public void operationB(){

    }
}
