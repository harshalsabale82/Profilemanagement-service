package com.bruteforce.profilemanagement.services.profile;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface startupRepository extends MongoRepository<startup,String> {

}
