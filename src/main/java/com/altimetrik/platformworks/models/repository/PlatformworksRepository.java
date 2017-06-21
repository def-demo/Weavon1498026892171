package com.altimetrik.platformworks.models.repository;

import com.altimetrik.platformworks.models.*;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface PlatformworksRepository extends MongoRepository<Platformworks, String>{

}



