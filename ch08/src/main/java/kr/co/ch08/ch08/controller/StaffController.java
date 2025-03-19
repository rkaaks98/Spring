package kr.co.ch08.ch08.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/staff")
public class StaffController {

    @GetMapping(value = {"", "/index"})
    public String index(){
        return "/staff/index";
    }
}
