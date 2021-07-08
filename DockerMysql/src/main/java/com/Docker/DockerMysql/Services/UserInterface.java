package com.Docker.DockerMysql.Services;

import com.Docker.DockerMysql.Entity.UserData;

import java.util.List;

public interface UserInterface {
public UserData addUser(UserData userobj);

   public List<UserData> showUser();
}
