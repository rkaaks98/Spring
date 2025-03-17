package kr.co.ch06.service;

import kr.co.ch06.dao.User1Mapper;
import kr.co.ch06.dao.User2Mapper;
import kr.co.ch06.dto.User2DTO;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class User2Service {

    private final User2Mapper user2Mapper;

    public void register(User2DTO user2DTO) {
        user2Mapper.insertUser2(user2DTO);
    }
    public List<User2DTO> findAll() {
        return user2Mapper.selectAllUser2();
    }
    public User2DTO findById(String uid) {
        return user2Mapper.selectUser2(uid);
    }
    public void modify(User2DTO user2DTO) {
        user2Mapper.updateUser2(user2DTO);
    }
    public void delete(String uid) {
        user2Mapper.deleteUser2(uid);
    }
}
