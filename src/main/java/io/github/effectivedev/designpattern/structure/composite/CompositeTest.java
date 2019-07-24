package io.github.effectivedev.designpattern.structure.composite;

public class CompositeTest {

    public static void main(String[] args) {
        Directory directory = new Directory();
        File file = new File();
        directory.add(file);
    }
}
