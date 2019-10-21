package io.github.effectivedev.designpattern.behavior.mediator;

/**
 * design pattern
 * IChatRoom
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/21 11:11 AM
 */
public interface IChatRoom {

    public void sendMessage(String msg, String userId);
    void addUser(User user);
}
