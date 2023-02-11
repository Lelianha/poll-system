package PollSystemApplication.model;

import java.util.List;


public class UserResponse {


    private Poll poll;

    private List<User> users;

    public UserResponse(Poll poll, List<User> users) {
        this.poll = poll;
        this.users = users;

    }

    public Poll getPoll() {
        return poll;
    }

    public List<User> getUsers() {
        return users;
    }


    public void setPoll(Poll poll) {
        this.poll = poll;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }


}