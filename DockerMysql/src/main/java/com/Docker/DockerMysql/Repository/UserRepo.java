package com.Docker.DockerMysql.Repository;

import com.Docker.DockerMysql.Entity.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<UserData,Integer> {
}
