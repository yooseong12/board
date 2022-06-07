package com.board.controller;

import com.board.controller.request.LoginRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginForm(Model model) {

        model.addAttribute("member", new LoginRequest());
        return "login";
    }
    
    @GetMapping("/logout")
    public String logoutForm(Model model) {
    	return "login";
    }
}