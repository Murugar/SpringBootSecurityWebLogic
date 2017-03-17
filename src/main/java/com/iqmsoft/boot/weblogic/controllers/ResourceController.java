package com.iqmsoft.boot.weblogic.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ResourceController {
 
    @RequestMapping(method = RequestMethod.GET)
    String readResource() {
        return "Spring Boot MVC Security weblogic! ";
    }
}
