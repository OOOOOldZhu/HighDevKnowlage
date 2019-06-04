package com.z.highknowlage.DesignPattern;

/*
 * ：Created by z on 2019/6/3
 */

public interface Visitor {

    /**
     * 访问元素A，相当于给元素A添加访问者的功能
     *
     * @param element
     */
    public abstract void visitElementA(ElementA element);

    public abstract void visitElementB(ElementB element);
}

