package Lesson14.Example2mediator;

public class User extends AbstractUser {

    public User(String userId, Mediator chatRoom) {
        super(userId, chatRoom);
    }

    @Override
    void send(String userId, String message) {
        System.out.println(this.getUserId() + " send  a" + message);
        this.getChatRoom().sendMessage(userId, message);
    }

    @Override
    void receive(String message) {
        System.out.println(getUserId() + " received a " + message + " message");
    }

}
