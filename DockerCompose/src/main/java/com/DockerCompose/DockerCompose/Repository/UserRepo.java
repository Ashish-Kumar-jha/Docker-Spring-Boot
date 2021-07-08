package com.DockerCompose.DockerCompose.Repository;


import com.DockerCompose.DockerCompose.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserData,Integer> {
}
