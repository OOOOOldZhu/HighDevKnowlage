package com.z.highknowlage.EventBus;

/*
 * ：Created by z on 2019/5/28
 */

import java.lang.reflect.Method;

public class SubscribeMethod {

    //回调方法
    private Method mMethod;
    //线程模式
    private ThreadMode mThreadMode;

    //方法中的参数
    private Class<?> type;

    public void setmMethod(Method mMethod) {
        this.mMethod = mMethod;
    }

    public void setmThreadMode(ThreadMode mThreadMode) {
        this.mThreadMode = mThreadMode;
    }

    public void setType(Class<?> type) {
        this.type = type;
    }

    public Method getmMethod() {
        return mMethod;
    }

    public ThreadMode getmThreadMode() {
        return mThreadMode;
    }

    public Class<?> getType() {
        return type;
    }
}
