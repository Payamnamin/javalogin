package com.javalogin.javalogin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    @GetMapping("/register")
    public String register() {
        return "register"; // فایل register.html
    }

    @GetMapping("/mina-ordrar")
    public String minaOrdrar() {
        return "mina-ordrar"; // فایل mina-ordrar.html
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // فایل login.html (در صورت نیاز سفارشی‌سازی شود)
    }
}