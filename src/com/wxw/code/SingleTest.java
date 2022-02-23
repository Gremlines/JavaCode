package com.wxw.code;

/**
 * 单例模式
 * 这个实现在单线程环境不存在问题，但是如果处于并发场景，就需要考虑线程安全
 */
public class SingleTest {
    private static SingleTest singleTest;

    private SingleTest(){

    }

    public static SingleTest getInstance(){
        if (singleTest == null){
            singleTest = new SingleTest();
        }
        return singleTest;
    }
}
