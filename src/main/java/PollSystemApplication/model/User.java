package PollSystemApplication.model;


import java.time.LocalDate;
import java.util.List;


public class User {

    private Long id;
    private String firstName;
    private String lastName;

    private String email;

    private Double age;

    private String address;

    private LocalDate joiningDate;
    private Long questionId;

    private String answer;


    public User(Long id, String firstName, String lastName, String email, Double age, String address, LocalDate joiningDate, Long questionId, String answer) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.address = address;
        this.joiningDate = joiningDate;
        this.questionId = questionId;
        this.answer = answer;

    }


    public User(Long id, Long questionId, String answer) {
        this.id = id;
        this.questionId = questionId;
        this.answer = answer;
    }

    public User() {
    }


    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public Double getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public String getAnswer() {
        return answer;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAge(Double age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }


    public UserResponse toUserResponse(Poll poll, List<User> userList) {
        return new UserResponse(
                poll,
                userList
        );
    }


}