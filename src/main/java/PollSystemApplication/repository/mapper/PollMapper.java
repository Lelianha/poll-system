package PollSystemApplication.repository.mapper;

import org.springframework.jdbc.core.RowMapper;
import PollSystemApplication.model.Poll;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PollMapper implements RowMapper<Poll> {

    @Override
    public Poll mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new Poll(
                rs.getLong("id"),
                rs.getString("title"),
                rs.getString("first_option"),
                rs.getString("second_option"),
                rs.getString("third_option"),
                rs.getString("fourth_option")

        );

    }
}