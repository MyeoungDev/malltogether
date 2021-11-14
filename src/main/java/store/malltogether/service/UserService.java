package store.malltogether.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import store.malltogether.domain.User;
import store.malltogether.dto.JoinForm;
import store.malltogether.dto.LoginForm;
import store.malltogether.repository.UserRepository;

@Service
@RequiredArgsConstructor
@Transactional
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public Long save(JoinForm form) {

        User user = new User();

        user.setUsername(form.getUserName());
        user.setPassword(form.getPassword());
        user.setEmail(form.getEmail());
//        user.setPhoneNumber(form.getUserPhoneNumber());
        user.setZipcode(form.getZipcode());
        user.setAddress(form.getAddress());

        userRepository.save(user);
        return user.getId();
    }

    @Transactional
    public Long login(LoginForm form) {

    }

}
