package com.capgemini.profile.dao;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.capgemini.profile.entity.Feedback;

public interface FeedbackDao extends MongoRepository<Feedback, Integer>{

}
