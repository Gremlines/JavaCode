package com.wxw.code;

/**
 * 单例模式
 *
 * 这里的 volatile 能够提供可见性，以及保证 getInstance 返回的是初始化完全的对象。
 * 在同步之前进行 null 检查，以尽量避免进入相对昂贵的同步块。
 * 直接在 class 级别进行同步，保证线程安全的类方法调用。
 */
public class SingleTonTest {
    //使用volatile保证可见性
    private static volatile SingleTonTest singleTonTest;

    //用private修饰
    private SingleTonTest(){

    }

    public static SingleTonTest getInstance(){
        if (singleTonTest == null){
            synchronized (SingleTonTest.class){
                if (singleTonTest == null){
                    singleTonTest = new SingleTonTest();
                }
            }
        }
        return singleTonTest;
    }
}
