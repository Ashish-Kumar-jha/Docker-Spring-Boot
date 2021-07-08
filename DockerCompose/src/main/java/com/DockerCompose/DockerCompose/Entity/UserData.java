package com.DockerCompose.DockerCompose.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserData {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private long pno;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getPno() {
        return pno;
    }

    public void setPno(long pno) {
        this.pno = pno;
    }
}
