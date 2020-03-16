package com.bruteforce.profilemanagement.services.profile;


import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/startup")
public class startupController {
    private startupRepository startuprepository;
    public startupController(startupRepository startuprepository){
        this.startuprepository=startuprepository;

    }
    @GetMapping("/all")
    public List<startup> getall(){
    List<startup>startups=this.startuprepository.findAll();
    return startups;
    }

    @PutMapping
        public void insert(@RequestBody startup startup){
        this.startuprepository.insert(startup);
    }

    @PostMapping
    public void update(@RequestBody startup startup){
        this.startuprepository.save(startup);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") String id){
            this.startuprepository.deleteById("0001");
    }
}
