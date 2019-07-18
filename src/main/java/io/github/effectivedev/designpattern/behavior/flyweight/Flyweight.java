package io.github.effectivedev.designpattern.behavior.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * The goal of the flyweight pattern is to reduce memory usage by sharing as much data as possible
 */
public class Flyweight {
    Map<String, Object> map = new HashMap<>();

    public Subject getSubject(String name){
        Subject subject = (Subject) map.get(name);
        if(subject == null){
            subject = new Subject(name);
            map.put(name, subject);
        }
        return subject;
    }

}
