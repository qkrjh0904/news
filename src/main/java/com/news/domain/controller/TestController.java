package com.news.domain.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "안녕하세요, 타임리프로 만든 페이지입니다.");
        return "index";
    }

}
