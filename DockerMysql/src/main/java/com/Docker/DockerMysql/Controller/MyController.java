package com.Docker.DockerMysql.Controller;

import com.Docker.DockerMysql.Entity.UserData;
import com.Docker.DockerMysql.Services.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {
    @Autowired
    UserInterface userInterface;

@PostMapping("/Register")
    public UserData addUser(@RequestBody UserData userobj){
        return this.userInterface.addUser(userobj);
}
    @GetMapping("/show")
    public List<UserData> showUser(){
        return this.userInterface.showUser();
    }

}
