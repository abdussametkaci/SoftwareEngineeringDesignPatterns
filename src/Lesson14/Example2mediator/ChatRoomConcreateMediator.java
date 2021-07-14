package Lesson14.Example2mediator;

import java.util.HashMap;
import java.util.Map;

public class ChatRoomConcreateMediator implements Mediator {

    private Map<String, AbstractUser> users = new HashMap();

    @Override
    public void sendMessage(String userId, String message) {
        AbstractUser u = users.get(userId);
        u.receive(message);
    }

    @Override
    public void addUser(AbstractUser user) {
        users.put(user.getUserId(), user);
    }

}
