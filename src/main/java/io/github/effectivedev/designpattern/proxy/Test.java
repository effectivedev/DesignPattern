package io.github.effectivedev.designpattern.proxy;

public class Test {
    public static void main(String[] args) {
        CommandExecutor commandExecutor = new RunProxy();
        try {
            commandExecutor.runCommand("ls -al");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
