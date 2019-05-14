package com.capgemini.profile.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.profile.entity.ProfileDetails;

@Repository
public interface ProfileDao extends MongoRepository<ProfileDetails,Long> {

	List<ProfileDetails> findAllByEmail(String email);

//	public ProfileDetails getByEmail(String email);

}
