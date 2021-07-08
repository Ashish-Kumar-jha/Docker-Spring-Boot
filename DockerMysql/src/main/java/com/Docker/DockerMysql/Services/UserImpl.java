package com.Docker.DockerMysql.Services;

import com.Docker.DockerMysql.Entity.UserData;
import com.Docker.DockerMysql.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserImpl implements UserInterface{
@Autowired
    UserRepo userRepo;
    @Override
    public UserData addUser(UserData userobj) {
       return userRepo.save(userobj);
    }

    @Override
    public List<UserData>showUser() {
        return userRepo.findAll();
    }
}
