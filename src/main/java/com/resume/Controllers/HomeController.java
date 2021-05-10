package com.resume.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/blue")
    public String welcomeDefault(){
      return "home";
    }
}
