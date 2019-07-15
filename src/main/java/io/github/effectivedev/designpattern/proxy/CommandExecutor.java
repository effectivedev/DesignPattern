package io.github.effectivedev.designpattern.proxy;

public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}
