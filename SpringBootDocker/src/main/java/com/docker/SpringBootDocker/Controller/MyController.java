package com.docker.SpringBootDocker.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
@GetMapping("/docker")
public String CallDocker(){
    return "HELLO ASHISH, FIRST DOCKER DEPLOY";
}
}
