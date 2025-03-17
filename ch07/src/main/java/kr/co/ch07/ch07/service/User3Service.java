package kr.co.ch07.ch07.service;

import kr.co.ch07.ch07.dto.User3DTO;
import kr.co.ch07.ch07.entity.User3;
import kr.co.ch07.ch07.repository.User3Repository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class User3Service {

    private final User3Repository repository;

    public void register(User3DTO user3DTO){
        log.info("user3DTO : " + user3DTO);

        User3 user3 = user3DTO.toEntity();
        log.info("user3 : " + user3);

        repository.save(user3);


    }
}
