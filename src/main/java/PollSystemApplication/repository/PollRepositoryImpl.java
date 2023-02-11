package PollSystemApplication.repository;

import PollSystemApplication.model.Poll;
import PollSystemApplication.repository.mapper.PollMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class PollRepositoryImpl implements PollRepository {

    private static final String POLL_TABLE_NAME = "poll";


    @Autowired
    JdbcTemplate jdbcTemplate;


    @Override
    public Long createPoll(Poll poll) {
        String sql = "INSERT INTO " + POLL_TABLE_NAME + " (title, first_option ,second_option , third_option , fourth_option  ) VALUES (?, ? , ? , ? , ? )";
        jdbcTemplate.update(sql, poll.getTitle(), poll.getFirstOption(), poll.getSecondOption(), poll.getThirdOption(), poll.getFourthOption());
        return jdbcTemplate.queryForObject("SELECT LAST_INSERT_ID();", Long.class);
    }


    @Override
    public Poll getPollById(Long pollId) {
        String sql = "SELECT *  FROM " + POLL_TABLE_NAME + " WHERE id=?";
        return jdbcTemplate.queryForObject(sql, new PollMapper(), pollId);
    }

    @Override
    public void updatePollById(Long pollId, Poll poll) {
        String sql = "UPDATE " + POLL_TABLE_NAME + " SET title=?, first_option=? ,  second_option=? ,   third_option=? ,  fourth_option=?" +
                "WHERE id=?";
        jdbcTemplate.update(sql, poll.getTitle(), poll.getFirstOption(), poll.getSecondOption(), poll.getThirdOption(), poll.getFourthOption(), pollId);
    }

    @Override
    public void deletePollById(Long pollId) {
        String sql = "DELETE FROM " + POLL_TABLE_NAME + " WHERE poll.id=?";
        jdbcTemplate.update(sql, pollId);
    }


}