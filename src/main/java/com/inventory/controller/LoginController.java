package com.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
@Controller
public class LoginController {

@GetMapping("/login")
public String showLoginPage() {
    return "login";
}

@GetMapping("/logout")
public String logout(HttpSession session) {
    session.invalidate(); // clears login session
    return "redirect:/login";
}

@PostMapping("/login")
public String login(
        @RequestParam String username,
        @RequestParam String password,
        Model model) {

    // USER 1
    if (username.equals("24rp01507") && password.equals("24rp01217")) {
        return "redirect:/assets";
    }

    model.addAttribute("error", "Invalid username or password");
    return "login";
}

}