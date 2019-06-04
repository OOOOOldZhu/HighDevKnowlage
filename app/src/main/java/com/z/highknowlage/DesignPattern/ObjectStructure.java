package com.z.highknowlage.DesignPattern;

import java.util.ArrayList;
import java.util.List;

/*
 * ：Created by z on 2019/6/3
 */
public class ObjectStructure {

    //保存所有需要被访问的元素
    private List<Element> elements = new ArrayList<>();

    public void handleRequest(Visitor visitor) {
        //访问所有元素
        for(Element ele : elements) {
            ele.accept(visitor);
        }
    }

    public void addElement(Element ele) {
        elements.add(ele);
    }
}
