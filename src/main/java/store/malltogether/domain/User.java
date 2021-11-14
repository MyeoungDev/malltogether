package store.malltogether.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

//    @Column(name = "phoneNumber")
//    private String phoneNumber;

    @Column(name = "zipcode")
    private String zipcode;

    @Column(name = "address")
    private String address;

}
