package PollSystemApplication.repository;

import PollSystemApplication.model.Poll;

public interface PollRepository {
    Long createPoll(Poll poll);

    Poll getPollById(Long pollId);

    void updatePollById(Long pollId, Poll poll);

    void deletePollById(Long pollId);

}