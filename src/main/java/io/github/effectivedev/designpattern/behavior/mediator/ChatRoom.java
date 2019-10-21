package io.github.effectivedev.designpattern.behavior.mediator;

import java.util.HashMap;
import java.util.Map;

/**
 * ChatRoom - Concreate Mediator
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/21 11:46 AM
 */

public class ChatRoom implements IChatRoom {

    private Map<String, User> usersMap = new HashMap<>();

    @Override
    public void sendMessage(String msg, String userId)
    {
        User u = usersMap.get(userId);
        u.receive(msg);
    }

    @Override
    public void addUser(User user) {
        this.usersMap.put(user.getId(), user);
    }
}