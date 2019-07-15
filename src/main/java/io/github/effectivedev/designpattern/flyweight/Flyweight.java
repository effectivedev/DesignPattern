package io.github.effectivedev.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

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
