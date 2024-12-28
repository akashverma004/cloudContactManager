package com.akash.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name", "Akash");
        return "home";
    }

    @RequestMapping("/about")
    public String aboutPage() {
        System.out.println("About are loading");
        return "about";
    }

    @RequestMapping("/services")
    public String contactPage(Model model) {
        System.out.println("Services are loading");
        return "services";
    }
}
