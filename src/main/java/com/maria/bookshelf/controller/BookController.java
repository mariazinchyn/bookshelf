package com.maria.bookshelf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class BookController {
    @GetMapping("/")
    public String blogMain(Model model){
        return "main";
    }
}
