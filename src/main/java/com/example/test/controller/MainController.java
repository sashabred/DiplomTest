package com.example.test.controller;

import com.example.test.authorization.repository.UserRepo;
import com.example.test.repository.HouseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;


@Controller
public class MainController {

    @Autowired
    private UserRepo userRepo;


    @Autowired
    private HouseRepo houseRepo;

    @GetMapping
    String getHello(Model model) {
            model.addAttribute("something", "good");
            model.addAttribute("houseList",houseRepo.findAll());
            return "index";
    }

    @ModelAttribute("User")
    @GetMapping("/signin")
    String signIn(Model model) {

        return "auth/login";
    }

}
