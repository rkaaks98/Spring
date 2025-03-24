package kr.co.sboard.sboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class indexController {

    @GetMapping(value = {"/", "/index"})
    public String index(){
        return "/index";
    }
}
