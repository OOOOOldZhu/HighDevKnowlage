package com.z.highknowlage.DesignPattern;

/*
 * ：Created by z on 2019/6/3
 *
 * 访问者模式
 */
public abstract class Element {
    public abstract void accept(Visitor visitor);
}
