package kr.co.ch08.ch08.controller;

import kr.co.ch08.ch08.dto.UserDTO;
import kr.co.ch08.ch08.entity.User;
import kr.co.ch08.ch08.security.MyUserDetails;
import kr.co.ch08.ch08.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserService service;

    @GetMapping("/user/login")
    public String login() {
        return "/user/login";
    }

    @GetMapping("/user/register")
    public String register() {
        return "/user/register";
    }
    @PostMapping("/user/register")
    public String register(UserDTO userDTO) {

        log.info("userDTO: {}", userDTO);

        service.register(userDTO);

        return "redirect:/user/login";
    }

    @GetMapping("/user/info")
    public String info(Model model) {

        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        log.info("authentication: {}", authentication);

        MyUserDetails myUserDetails = (MyUserDetails) authentication.getPrincipal();
        User user = myUserDetails.getUser();
        log.info("user: {}", user);

        model.addAttribute(user);

        return "/user/info";
    }

    //코드 기반 인가처리 예제
    @PreAuthorize("hasRole('ADMIN')")
    @GetMapping("/user/admin")
    public String admin(){
        return "/admin/index";
    }
    @PreAuthorize("hasRole('ADMIN') or hasRole('MANAGER')")
    @GetMapping("/user/manager")
    public String manager(){
        return "/manager/index";
    }
    @PreAuthorize("hasAnyRole('ADMIN','MANAGER','STAFF')")
    @GetMapping("/user/staff")
    public String staff(){
        return "/staff/index";
    }
}
