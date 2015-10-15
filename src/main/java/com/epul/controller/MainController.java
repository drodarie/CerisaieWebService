package com.epul.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Dimitri on 13/10/2015.
 *
 * @version 1.0
 */

@RestController
public class MainController {
    @RequestMapping("/")
    public String welcome (){
        return "Hello World !";
    }
}
