package com.spring.will.springbootcrudwithmangodb.service;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.spring.will.springbootcrudwithmangodb.model.Tutorial;

public interface TutorialRepositoryService extends MongoRepository<Tutorial, String> {
    List<Tutorial> findByTitleContaining(String title);
    
    List<Tutorial> findByPublished(boolean published);

}
