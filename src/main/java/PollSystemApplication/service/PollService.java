package PollSystemApplication.service;

import PollSystemApplication.model.Poll;

public interface PollService {
    Long createPoll(Poll poll);

    Poll getPollById(Long pollId);

    void updatePollById(Long pollId, Poll poll);

    void deletePollById(Long pollId);

}