package PollSystemApplication.repository.mapper;

import PollSystemApplication.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new User(
                rs.getLong("id"),
                rs.getString("first_name"),
                rs.getString("last_name"),
                rs.getString("email"),
                rs.getDouble("age"),
                rs.getString("address"),
                rs.getDate("joining_date").toLocalDate(),
                rs.getLong("question_id"),
                rs.getString("answer")

        );
    }
}