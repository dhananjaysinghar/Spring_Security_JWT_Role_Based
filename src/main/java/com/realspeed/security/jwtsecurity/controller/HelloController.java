package com.realspeed.security.jwtsecurity.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class HelloController {

    @GetMapping("/hello")
    @PreAuthorize("hasAuthority('ADMIN')")
    public String hello() {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        authorities.stream().map(GrantedAuthority::getAuthority).forEach(System.out::println);
        return "Hello World";
    }

    @GetMapping("/hello1")
    public String hello1() {
        Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
        authorities.stream().map(GrantedAuthority::getAuthority).forEach(System.out::println);
        return "Hello World_1";
    }
}
