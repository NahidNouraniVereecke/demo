package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {
    Demo demo = new Demo();
    @RequestMapping("/sum")
    public int sum(@RequestParam int a, @RequestParam int b){
        return demo.sum(a,b);
    }

}
