package kr.co.ch04.dao;

import kr.co.ch04.dto.User1DTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class User1DAO {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    private void insertUser1(User1DTO dto) {

        String sql = "insert into user1 values(?,?,?,?)";

        Object[] params = {dto.getUid(), dto.getName(), dto.getHp(), dto.getAge()};

        jdbcTemplate.update(sql, params);
    }

    public User1DTO selectUser1(String uid) {
        String sql = "select * from user1 where uid=?";
        Object[] params = {uid};

        return jdbcTemplate.queryForObject(sql, User1RowMapper, params);
    }

    public void updateUser1(User1DTO dto) {

        String sql = "update user1 set name=?,hp=?,age=? where uid=?";
        Object[] params = {dto.getName(), dto.getHp(), dto.getAge(), dto.getUid()};
        jdbcTemplate.update(sql, params);
    }

    public void deleteUser1(String uid) {
        String sql = "delete from user1 where uid=?";
        Object[] params = {uid};
        jdbcTemplate.update(sql, params);
    }
}
