package io.github.effectivedev.designpattern.behavior.mediator;

/**
 * design pattern
 * ChatUser
 * Github : https://github. com/effectivedev
 * Created by in0@me.com on 2019/10/21 11:16 AM
 */

public class ChatUser extends User {

    public ChatUser(IChatRoom room, String id, String name) {
        super(room, id, name);
    }

    @Override
    public void send(String msg, String userId) {
        System.out.println(this.getName() + " :: Sending Message : " + msg);
        getMediator().sendMessage(msg, userId);
    }

    @Override
    public void receive(String msg) {
        System.out.println(this.getName() + " :: Received Message : " + msg);
    }


}
