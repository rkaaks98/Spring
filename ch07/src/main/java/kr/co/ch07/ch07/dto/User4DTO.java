package kr.co.ch07.ch07.dto;

import kr.co.ch07.ch07.entity.User4;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User4DTO {

    private String uid;
    private String name;
    private String hp;
    private String birth;
    private String addr;
    private String gender;

    public User4 toEntity(){
        return User4.builder()
                .uid(uid)
                .name(name)
                .hp(hp)
                .birth(birth)
                .addr(addr)
                .gender(gender)
                .build();
    }
}
