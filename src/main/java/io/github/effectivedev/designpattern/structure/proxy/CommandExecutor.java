package io.github.effectivedev.designpattern.structure.proxy;

public interface CommandExecutor {
    void runCommand(String cmd) throws Exception;
}
