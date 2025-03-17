package kr.co.ch07.ch07.repository;

import kr.co.ch07.ch07.entity.User1;
import kr.co.ch07.ch07.entity.User2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface User2Repository extends JpaRepository<User2,String> {
}
