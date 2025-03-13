package kr.co.ch06.dto;

import lombok.*;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class User2DTO {

    private String uid;
    private String name;
    private String birth;
    private String addr;
}
