package io.github.effectivedev.designpattern.creation.singleton;

/**
 * Enum Singleton
 */
public enum Singleton3 {
    INSTANCE;

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    private String test;

    public static Singleton3 getInstance(){
        return INSTANCE;
    }
}
