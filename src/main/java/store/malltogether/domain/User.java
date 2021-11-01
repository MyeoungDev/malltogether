package store.malltogether.domain;

import lombok.Getter;
import lombok.Setter;
import store.malltogether.domain.Address;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @NotNull
    @NotBlank(message = "이름을 입력하세요")
    private String username;

    @NotNull
    @NotBlank(message = "비밀번호를 입력하세요")
    private String password;

    @NotNull
    @NotBlank(message = "이메일을 입력하세요")
    private String email;

    @NotNull
    @NotBlank(message = "핸드폰번호를 입력하세요")
    private String phoneNumber;

    @Embedded
    private Address address;


}
