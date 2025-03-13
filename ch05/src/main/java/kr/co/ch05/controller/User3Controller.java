package kr.co.ch05.controller;

import kr.co.ch05.dto.User3DTO;
import kr.co.ch05.service.User3Service;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class User3Controller {

    private final User3Service user3Service;

    public User3Controller(User3Service user3Service) {
        this.user3Service = user3Service;
    }

    @RequestMapping(value = "/user3/list", method = RequestMethod.GET)
    public String list(Model model) {

        List<User3DTO> user3DTOs = user3Service.findAll();

        System.out.println(user3DTOs);

        model.addAttribute("user3DTOs",user3DTOs);

        return "/user3/list";
    }

    @GetMapping("/user3/register")
    public String register(){
        return "/user3/register";
    }

    @PostMapping("/user3/register")
    public String register(User3DTO user3DTO) {

        user3Service.register(user3DTO);

        return "redirect:/user3/list";

    }

    @GetMapping("/user3/modify")
    public String modify(@RequestParam("uid") String uid, Model model) {

        User3DTO user3DTO = user3Service.findById(uid);

        model.addAttribute("user3DTO", user3DTO);

        return "/user3/modify";
    }
    @PostMapping("/user3/modify")
    public String modify(User3DTO user3DTO) {

        user3Service.modify(user3DTO);

        return "redirect:/user3/list";
    }

    @GetMapping("/user3/delete")
    public String delete(@RequestParam("uid") String uid) {

        user3Service.delete(uid);

        return "redirect:/user3/list";
    }


}





















