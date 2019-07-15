package io.github.effectivedev.designpattern.proxy;

import lombok.extern.log4j.Log4j2;

@Log4j2
public class RunProxy implements CommandExecutor{
    CommandExecutor commandExecutor;

    @Override
    public void runCommand(String cmd) throws Exception {
        log.info("proxy Start");
        commandExecutor = new CommandExecutorImpl();
        commandExecutor.runCommand(cmd);
        log.info("proxy End");
    }
}
