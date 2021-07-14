package Lesson14.Example2mediator;

public abstract class AbstractUser {

    private String userId;
    private Mediator chatRoom;

    abstract void send(String userId, String message);

    abstract void receive(String message);

    public String getUserId() {
        return userId;
    }

    public AbstractUser(String userId, Mediator chatRoom) {
        this.userId = userId;
        this.chatRoom = chatRoom;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setChatRoom(Mediator chatRoom) {
        this.chatRoom = chatRoom;
    }

    public Mediator getChatRoom() {
        return chatRoom;
    }

}
