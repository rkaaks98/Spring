package kr.co.ch06.dao;

import kr.co.ch06.dto.User1DTO;
import org.junit.jupiter.api.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class User1MapperTest {

    @Autowired
    private User1Mapper user1Mapper;

    private String testUid = "test2";
    
    @DisplayName("user1 등록")
    @Test
    @Order(1)
    void insertUser1() {

        //given - 테스트를 수행하기 위한 준비단계
        User1DTO u1 = User1DTO.builder()
                .uid(testUid)
                .name("테스트")
                .hp("010-2211-1111")
                .age(21)
                .build();

        //when - 테스트를 진행하는 단계
        user1Mapper.insertUser1(u1);


        //then - 테스트 결과를 검증하는 단계
        User1DTO user1DTO = user1Mapper.selectUser1(u1.getUid());
        Assertions.assertEquals(user1DTO.getUid(), u1.getUid());

        System.out.println(user1DTO);

    }

    @DisplayName("user1 조회")
    @Test
    @Order(2)
    void selectUser1() {
        //given
        //String testUid = "testUid1";

        //when
        User1DTO user1DTO= user1Mapper.selectUser1(testUid);

        //then
        assertEquals(testUid, user1DTO.getUid());
    }

    @DisplayName("user1 전체 조회")
    @Test
    @Order(3)
    void selectAllUser1() {

        //given
        List<User1DTO> user1List = null;


        //when
        user1List= user1Mapper.selectAllUser1();


        //then
        Assertions.assertNotNull(user1List);
        System.out.println(user1List);



    }

    @DisplayName("user1 수정")
    @Test
    @Order(4)
    void updateUser1() {

        //given
        User1DTO u1 = User1DTO.builder()
                .uid(testUid)
                .name("수정테스트")
                .hp("010-2211-1111")
                .age(21)
                .build();

        //when
        user1Mapper.updateUser1(u1);

        //then
        User1DTO resultDTO= user1Mapper.selectUser1(u1.getUid());
        Assertions.assertEquals(resultDTO.getUid(), u1.getUid());

        System.out.println(resultDTO);

    }

    @DisplayName("user1 삭제")
    @Test
    @Order(5)
    void deleteUser1() {

        //given
        //String testUid = "testUid1";

        //when
        user1Mapper.deleteUser1(testUid);


        //then
        User1DTO resultDTO= user1Mapper.selectUser1(testUid);
        Assertions.assertNull(resultDTO);

        System.out.println(resultDTO);

    }
}