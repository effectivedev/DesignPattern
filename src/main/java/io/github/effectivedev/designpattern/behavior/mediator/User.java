package io.github.effectivedev.designpattern.behavior.mediator;

/**
 * Colleague Class
 * User
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/21 11:13 AM
 */

public abstract class User
{
    private IChatRoom mediator;

    private String id;
    private String name;

    public User(IChatRoom room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }

    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);

    public IChatRoom getMediator() {
        return mediator;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}