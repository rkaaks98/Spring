package kr.co.ch07.ch07.repository;

import kr.co.ch07.ch07.entity.Child;
import kr.co.ch07.ch07.entity.Parent;
import kr.co.ch07.ch07.entity.User1;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class User1RepositoryTest {

    @Autowired
    private User1Repository user1Repository;

    @Test
    void findUser1ByUid() {
        //given
        String uid = "a101";
        //wher
        User1 user1 = user1Repository.findUser1ByUid(uid);
        //then
        System.out.println(user1);

    }

    @Test
    void findUser1ByName() {

        List<User1> user1List = user1Repository.findUser1ByName("홍길동");
        System.out.println(user1List);
    }

    @Test
    void findUser1ByNameNot() {

        List<User1> user1List = user1Repository.findUser1ByNameNot("홍길동");
        System.out.println(user1List);
    }

    @Test
    void selectUser1UnderAge30() {
    }

    @Test
    void selectUser1ByName() {
    }

    @Test
    void selectUser1ByNameParam() {
    }

    @Test
    void selectUser1ByUid() {
    }

    @Test
    void selectAllParentWithChild() {

        // given
        String pid = "p101";

        //when
        List<Object[]> list = user1Repository.selectAllParentWithChild(pid);

        //then
        for (Object[] arr : list) {
            Parent parent = (Parent) arr[0];
            Child child = (Child) arr[1];

            System.out.println(parent);
            System.out.println(child);
        }



    }
}