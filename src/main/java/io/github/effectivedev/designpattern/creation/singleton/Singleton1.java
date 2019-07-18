package io.github.effectivedev.designpattern.creation.singleton;

/**
 * Singleton
 */
public class Singleton1 {
    private static Singleton1 ourInstance = new Singleton1();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public static synchronized Singleton1 getInstance() {
        return ourInstance;
    }

    private Singleton1() {
    }
}
