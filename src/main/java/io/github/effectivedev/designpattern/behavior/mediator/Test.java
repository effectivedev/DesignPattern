package io.github.effectivedev.designpattern.behavior.mediator;

/**
 * Test
 * Github : https://github.com/effectivedev
 * Created by in0@me.com on 2019/10/21 11:47 AM
 */

public class Test {
    public static void main(String[] args)
    {
        IChatRoom chatroom = new ChatRoom();

        User user1 = new ChatUser(chatroom,"1", "Alex");
        User user2 = new ChatUser(chatroom,"2", "Brian");
        User user3 = new ChatUser(chatroom,"3", "Charles");
        User user4 = new ChatUser(chatroom,"4", "David");

        chatroom.addUser(user1);
        chatroom.addUser(user2);
        chatroom.addUser(user3);
        chatroom.addUser(user4);

        user1.send("Hello brian", "2");
        user2.send("Hey buddy", "1");
    }
}
