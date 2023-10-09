package com.springboot.WebApplication.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class AboutController {
    @GetMapping("/about")
    public String aboutUs(Model model) {
        model.addAttribute("title", "Page about us");
        return "about";
    }
}
