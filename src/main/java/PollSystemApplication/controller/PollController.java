package PollSystemApplication.controller;

import PollSystemApplication.model.Poll;
import PollSystemApplication.service.PollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/poll")
public class PollController {

    @Autowired
    PollService pollService;


    @PostMapping(value = "/create")
    @CrossOrigin
    public Long createPoll(@RequestBody Poll poll) {
        return pollService.createPoll(poll);
    }


    @GetMapping(value = "/get/{pollId}")
    public Poll getPollById(@PathVariable Long pollId) {
        return pollService.getPollById(pollId);

    }

    @PutMapping(value = "/update/{pollId}")
    public void updatePollById(@PathVariable Long pollId,
                               @RequestBody Poll poll) {
        pollService.updatePollById(pollId, poll);
    }


    @DeleteMapping("/delete/{pollId}")
    private void deletePoll(@PathVariable("pollId") Long pollId) {
        pollService.deletePollById(pollId);
    }


}