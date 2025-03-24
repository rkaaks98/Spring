package kr.co.ch07.ch07.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import kr.co.ch07.ch07.dto.User4DTO;
import lombok.*;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user4")
public class User4 {

    @Id
    private String uid;
    private String name;
    private String hp;
    private String birth;
    private String addr;
    private String gender;

    public User4DTO toDTO(){
        return User4DTO.builder()
                .uid(uid)
                .name(name)
                .hp(hp)
                .birth(birth)
                .addr(addr)
                .gender(gender)
                .build();
    }
}
