package com.capgemini.profile.service;

import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import com.capgemini.profile.entity.ProfileDetails;


public interface ProfileService {

	public List<ProfileDetails> findOrderHistory(String email);

	public ProfileDetails getOrder(String email);
}
