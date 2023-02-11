package PollSystemApplication.repository;

import PollSystemApplication.model.User;

import java.util.List;
import java.util.Map;

public interface UserRepository {
    Long createUser(User user);

    Map<String, Object> getUserById(Long userId);

    void updateUserById(Long userId, User user);

    void deleteUserById(Long userId);

    void toAnswer(User user) throws Exception;

    List<Map<String, Object>> countUsersAnswerOption(Long questionId);

    Map<String, Object> countUsersAnsweredInTotal(Long questionId);

    List<Map<String, Object>> getUserAnswers(Long userId);

    Map<String, Object> countQuestionsUserAnswered(Long userId);

    List<Map<String, Object>> AllQuestionsWithDetails();


}