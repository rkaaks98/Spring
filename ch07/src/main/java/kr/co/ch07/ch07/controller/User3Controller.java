package kr.co.ch07.ch07.controller;

import kr.co.ch07.ch07.dto.User3DTO;
import kr.co.ch07.ch07.service.User3Service;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class User3Controller {

    private final User3Service service;

    public String list(Model model){


        return null;
    }

    @GetMapping("/user3/register")
    public String register(){
        return null;
    }
    public String modify(String uid, Model model){
        return null;
    }

    public String delete(String uid){
        return null;
    }
}
