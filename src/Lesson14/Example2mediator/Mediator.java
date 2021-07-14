package Lesson14.Example2mediator;

public interface Mediator {

    void sendMessage(String userId, String message);

    void addUser(AbstractUser user);

}
