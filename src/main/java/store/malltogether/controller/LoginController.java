package store.malltogether.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Slf4j
public class LoginController {

    @GetMapping("/login")
    public String loginForm() {
        log.info("loginForm controller");
        return "login";

    }

    @RequestMapping("/login")
    public String login() {
        log.info("loginForm controller");
        return "redirect:/index";
    }
}
