package PollSystemApplication.service;


import PollSystemApplication.model.Poll;
import PollSystemApplication.model.User;
import PollSystemApplication.model.UserRequest;
import PollSystemApplication.model.UserResponse;
import PollSystemApplication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    PollService pollService;

    @Override
    public Long createUser(User user) {
        return userRepository.createUser(user);
    }

    @Override
    public Map<String, Object> getUserById(Long userId) {
        return userRepository.getUserById(userId);
    }

    @Override
    public void updateUserById(Long userId, User user) {
        userRepository.updateUserById(userId, user);
    }

    @Override
    public void deleteUserById(Long userId) {
        userRepository.deleteUserById(userId);
    }

    @Override
    public UserResponse toAnswer(UserRequest userRequest) throws Exception {
        Poll selectedPoll = userRequest.getPoll();
        if (selectedPoll != null) {
            if (selectedPoll.getId() != null) {
                Poll existingPoll = pollService.getPollById(selectedPoll.getId());
                if (existingPoll != null) {
                    userRepository.toAnswer(userRequest.toUser());
                } else {
                    throw new Exception("Can't  answer with non existing poll id " + selectedPoll.getId());
                }

            } else {
                throw new Exception("Can't  answer with non existing poll id");
            }
        }
        return null;
    }

    @Override
    public List<Map<String, Object>> countUsersAnswerOption(Long questionId) {
        return userRepository.countUsersAnswerOption(questionId);
    }

    @Override
    public Map<String, Object> countUsersAnsweredInTotal(Long questionId) {
        return userRepository.countUsersAnsweredInTotal(questionId);
    }


    @Override
    public List<Map<String, Object>> getUserAnswers(Long userId) {
        return userRepository.getUserAnswers(userId);
    }

    @Override
    public Map<String, Object> countQuestionsUserAnswered(Long userId) {
        return userRepository.countQuestionsUserAnswered(userId);
    }

    @Override
    public List<Map<String, Object>> AllQuestionsWithDetails() {
        return userRepository.AllQuestionsWithDetails();
    }


}