package com.vapy.creator.Singleton;
/**
 * 
 * @author vapy
 * 
 * 静态内部类，线程安全
 * 
 */
public class StaticNested {  
    private static class NestedSingleton {  
        private static final StaticNested INSTANCE = new StaticNested();
    }

    private StaticNested (){}  

    public static final StaticNested getInstance() {  
        return NestedSingleton.INSTANCE; 
    }  
}