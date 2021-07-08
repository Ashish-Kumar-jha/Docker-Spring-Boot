package com.DockerCompose.DockerCompose.Services;
import com.DockerCompose.DockerCompose.Entity.UserData;

import java.util.List;

public interface UserInterface {
public UserData addUser(UserData userobj);

   public List<UserData> showUser();
}
