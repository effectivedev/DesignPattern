package io.github.effectivedev.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

@Slf4j
public class CommandExecutorImpl implements CommandExecutor {

    @Override
    public void runCommand(String cmd) throws IOException {
        Process process = Runtime.getRuntime().exec(cmd);
        InputStream is = process.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String line =null;

        StringBuffer sb = new StringBuffer();
        while((line=br.readLine())!=null ){
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        log.info(sb.toString());

    }
}
