package io.github.effectivedev.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

@Slf4j
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) {
        log.info("runCommand: {}", cmd);

    }
}
