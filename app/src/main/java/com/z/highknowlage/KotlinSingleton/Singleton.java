package com.z.highknowlage.KotlinSingleton;

/*
 * ：Created by z on 2019/5/28
 */

import android.content.Context;

public class Singleton {

    /*
    * 加上volatile（不稳定的）是为了可见性、禁止重排序，这样就可以保证把参数传递进去的同时，确保线程安全。
    */
    private volatile static Singleton singleton;

    public Singleton(Context context) {
        // init
    }

    public static Singleton getInstance(Context context) {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton(context);
                }
            }
        }
        return singleton;
    }

}

