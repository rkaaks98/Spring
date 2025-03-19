package kr.co.ch08.ch08.service;

import kr.co.ch08.ch08.dto.UserDTO;
import kr.co.ch08.ch08.entity.User;
import kr.co.ch08.ch08.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public void register(UserDTO userDTO) {

        //DTO를 Entity로 변환
        String pass = userDTO.getPass();
        String encodePass= passwordEncoder.encode(pass);
        userDTO.setPass(encodePass);

        User user = userDTO.toEntity();

        //사용자 저장
        userRepository.save(user);

    }
}
