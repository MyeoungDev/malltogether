package store.malltogether.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import store.malltogether.dto.JoinForm;
import store.malltogether.service.UserService;

@Controller
@Slf4j
@RequiredArgsConstructor
public class JoinController {

    private final UserService userService;

    @GetMapping("/join")
    public String joinForm() {
        log.info("joinForm controller");
        return "join";
    }

    @PostMapping("/join/new")
    public String join(JoinForm form) {
        log.info("join Controller");

        userService.save(form);

        return "redirect:/login";
    }
}
