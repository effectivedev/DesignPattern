package io.github.effectivedev.designpattern.singleton;

/**
 * LazyHolder Singleton
 */
public class Singleton2 {
    public Singleton2() {
    }

    private static class LazyHolder{
        static final Singleton2 INSTANCE = new Singleton2();
    }
    public static Singleton2 getINSTANCE() {
        return LazyHolder.INSTANCE;
    }
}
