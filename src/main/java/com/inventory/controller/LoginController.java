package com.inventory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
@Controller
public class LoginController {

@GetMapping("/")
public String showLoginPage() {
    return "login";
}

@GetMapping("/logout")
public String logout(HttpSession session) {
    session.invalidate(); // clears login session
    return "redirect:/";
}

@PostMapping("/login")
public String login(
        @RequestParam String username,
        @RequestParam String password,
        Model model) {


    if (username.equals("24rp01507") && password.equals("24rp01217")) {
        return "redirect:/dashboard";
    }
    model.addAttribute("error", "Invalid username or password");
    return "login";
}

}