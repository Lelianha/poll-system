package PollSystemApplication.service;

import PollSystemApplication.model.User;
import PollSystemApplication.model.UserRequest;
import PollSystemApplication.model.UserResponse;

import java.util.List;
import java.util.Map;

public interface UserService {
    Long createUser(User user);

    Map<String, Object> getUserById(Long userId);

    void updateUserById(Long userId, User user);

    void deleteUserById(Long userId);

    UserResponse toAnswer(UserRequest userRequest) throws Exception;

    List<Map<String, Object>> countUsersAnswerOption(Long questionId);

    Map<String, Object> countUsersAnsweredInTotal(Long questionId);

    List<Map<String, Object>> getUserAnswers(Long userId);

    Map<String, Object> countQuestionsUserAnswered(Long userId);

    List<Map<String, Object>> AllQuestionsWithDetails();


}