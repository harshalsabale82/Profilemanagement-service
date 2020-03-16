package com.bruteforce.profilemanagement.services.profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class DBseeder implements CommandLineRunner {
    private startupRepository startuprepository;

    private DBseeder(startupRepository startuprepository){
        this.startuprepository=startuprepository;
    }
    @Override
    public void run(String... args) throws Exception {
        startup Tech= new startup(
                "Harshal",
                "0001",
                "Food",
                "10001000",
                "CEO",
                "abc@gmail.com",
                21
        );

        startup Polymer= new startup(
                "Kunal",
                "0002",
                "Plastic",
                "10002000",
                "CEO",
                "abcd@gmail.com",
                21
        );

        startup Toys= new startup(
                "Shubham",
                "0003",
                "toys",
                "8888877767",
                "CEO",
                "abcd@gmail.com",
                21
        );
        //Drop the previous data
       // this.startuprepository.deleteAll();
        //add to the DB

         List<startup> Startups= Arrays.asList(Tech,Polymer,Toys);
            this.startuprepository.saveAll(Startups);
    }
}
