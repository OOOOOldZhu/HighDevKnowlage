package com.z.highknowlage.EventBus;

/*
 * ：Created by z on 2019/5/28
 */

import android.content.Context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventBus {

    public EventBus() {
        cacheMap = new HashMap<>();
    }

    //存放每个对象方法的容器
    private Map<Object,List<SubscribeMethod>> cacheMap;
    // volatile 可见行 禁止重排序，传值进入的时候，确保线程安全
    private static volatile EventBus instance;

    public static EventBus getDefault() {

        //double check blocking 双重检索检查机制
        if (instance == null) {
            synchronized (EventBus.class) {
                if (instance == null) {
                    instance = new EventBus();
                }
            }
        }
        return instance;
    }

    public void register(Object obj) {
        List<SubscribeMethod> list = cacheMap.get(obj);
        // todo
    }

    public void post() {

    }

}
