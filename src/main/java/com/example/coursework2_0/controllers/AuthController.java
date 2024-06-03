package com.example.coursework2_0.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
public class LoginController {

//    @Autowired
//    private AuthenticationManager authenticationManager;

    @GetMapping("/login")
    public String showLoginForm() {
        return "login";
    }

//    @PostMapping("/login")
//    public String processLogin(@RequestParam String username, @RequestParam String password, Model model) {
//        System.out.println("TEST");
//        try {
//            UsernamePasswordAuthenticationToken auth = new UsernamePasswordAuthenticationToken(username, password);
//            Authentication authentication = authenticationManager.authenticate(auth);
//            SecurityContextHolder.getContext().setAuthentication(authentication);
//            System.out.println("TEST");
//            return "redirect:/edit";
//        } catch (Exception e) {
//            model.addAttribute("error", "Invalid username or password");
//            return "login";
//        }
//    }
}
