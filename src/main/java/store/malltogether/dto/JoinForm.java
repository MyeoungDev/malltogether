package store.malltogether.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;

@Data
@NoArgsConstructor
public class JoinForm {

    @NotEmpty(message = "회원 아이디는 필수 입니다.")
    private String userName;

    private String password;
    private String email;
//    private String userPhoneNumber;
    private String zipcode;
    private String address;

}
