package com.example.crabcake;

import org.springframework.web.bind.annotation.RequestMapping;

public class HomeController {

    public class index {
        @RequestMapping("/")
        public String home() {
            return "/";
        }

    }
}

