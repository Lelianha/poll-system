package PollSystemApplication.controller;

import PollSystemApplication.model.User;
import PollSystemApplication.model.UserRequest;
import PollSystemApplication.model.UserResponse;
import PollSystemApplication.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;


    @PostMapping(value = "/create")
    @CrossOrigin
    public Long createUser(@RequestBody User user) {
        return userService.createUser(user);
    }


    @GetMapping(value = "/get/{userId}")
    public Map<String, Object> getUserById(@PathVariable Long userId ) {
        return userService.getUserById(userId);
    }

    @PutMapping(value = "/update/{userId}")
    public void updateUserById(@PathVariable Long userId,
                               @RequestBody User user)  {

        userService.updateUserById(userId, user);

    }

    @DeleteMapping("/delete/{userId}")
    private void deleteUser(@PathVariable("userId") Long userId) {
        userService.deleteUserById(userId);
    }



    @PostMapping(value = "/toAnswer")
    public UserResponse toAnswer(@RequestBody UserRequest userRequest) throws Exception {
        return userService.toAnswer(userRequest);
    }


    @GetMapping(value = "/get/{questionId}/countUsersForEachAnswerOption")
    public List<Map<String, Object>> countUsersAnswerOption( @PathVariable Long questionId)  {
        return userService.countUsersAnswerOption(questionId);
    }


    @GetMapping(value = "/get/{questionId}/countUsersAnsweredInTotal")
    public Map<String, Object> countUsersAnsweredInTotal(@PathVariable Long questionId) {
        return userService.countUsersAnsweredInTotal(questionId);
    }
    @GetMapping(value = "/get/{userId}/userAnswersToEachQuestion")
    public  List<Map<String, Object>> getUserAnswers( @PathVariable  Long userId)  {
        return userService.getUserAnswers(userId);
    }


    @GetMapping(value = "/get/{userId}/countQuestionsUserAnsweredTo")
    public  Map<String, Object> countQuestionsUserAnswered(@PathVariable  Long userId)  {
        return userService.countQuestionsUserAnswered( userId);
    }

    @GetMapping(value = "/get/AllQuestionsWithCountUsersAnswerOptions")
    public List<Map<String, Object>> AllQuestionsWithDetails() {
        return userService.AllQuestionsWithDetails();
    }



}