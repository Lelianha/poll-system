package PollSystemApplication.model;

public class UserRequest {

    private User user;
    private Poll poll;

    public UserRequest(User user, Poll poll) {
        this.user = user;
        this.poll = poll;
    }

    public User getUser() {
        return user;
    }

    public Poll getPoll() {
        return poll;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setPoll(Poll poll) {
        this.poll = poll;
    }


    public User toUser() {
        return new User(
                this.user.getId(),
                this.poll.getId(),
                this.user.getAnswer()
        );
    }


}