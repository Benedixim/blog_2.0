package com.projects.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller//перехды на сайте
public class MainController {

    @GetMapping("/")//url адрес - Главная страница
    public String home(Model model) {
        model.addAttribute("title", "Главная страница");//данные передаваемые в шаблон
        return "home";//вызов html шаблона
    }

    @GetMapping("/about")//url адрес - Главная страница
    public String about(Model model) {
        model.addAttribute("title", "Страница про нас");//данные передаваемые в шаблон
        return "about";//вызов html шаблона
    }

}
