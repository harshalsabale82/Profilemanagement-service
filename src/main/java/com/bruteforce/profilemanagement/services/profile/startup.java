package com.bruteforce.profilemanagement.services.profile;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

import java.util.*;
import java.util.List;

@Document(collection = "startup")
public class startup {
    @MongoId
    private String name;
    private String Id;
    private String domain;
    private String  profession;
    private String email;
    private String phone_no;
    private int age;

    protected startup(String name,String Id,String domain,String phone_no,String profession,String email,int age){
        this.name=name;
        this.age=age;
        this.domain=domain;
        this.Id=Id;
        this.profession=profession;
        this.email=email;
        this.phone_no=phone_no;
    }

    public String getName() {
        return name;
    }

    public String getDomain() {
        return domain;
    }

    public String getProfession() {
        return profession;
    }

    public String getId() {
        return Id;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_no() {
        return phone_no;
    }
}
