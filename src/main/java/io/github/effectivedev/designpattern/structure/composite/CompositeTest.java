package io.github.effectivedev.designpattern.structure.composite;

public class CompositeTest {

    public static void main(String[] args) {

        Directory directory = new Directory("tommy");
        directory.add(new File("1.txt"));
        directory.add(new File("2.txt"));
        directory.add(new File("3.txt"));
        Directory directory2 = new Directory("john");
        directory2.add(new File("4.txt"));
        directory2.add(new File("5.txt"));
        directory2.add(new File("6.txt"));
        Directory directory3 = new Directory("aiden");
        directory3.add(new File("7.txt"));
        directory3.add(new File("8.txt"));
        directory3.add(new File("9.txt"));
        directory3.add(new File("10.txt"));

        directory2.add(directory3);
        directory.add(directory2);

        directory.ls();
    }
}
