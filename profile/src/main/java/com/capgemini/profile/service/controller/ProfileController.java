package com.capgemini.profile.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.profile.dao.ProfileDao;
import com.capgemini.profile.entity.Feedback;
import com.capgemini.profile.entity.ProfileDetails;
import com.capgemini.profile.service.FeedbackService;
import com.capgemini.profile.service.ProfileService;

@CrossOrigin("*")
@RestController
public class ProfileController {

	@Autowired
	private ProfileService service;
	
	@Autowired
	private FeedbackService  feedbackService;
	
	@Autowired
	private ProfileDao dao;
	
	@GetMapping("/profile/{email}")
	public List<ProfileDetails> getOrderHistory(@PathVariable String email)
	{
		List<ProfileDetails> details=service.findOrderHistory(email);
		return details;
	}
	
	@PostMapping("/profile")
	public ProfileDetails addprofileDetails(@RequestBody ProfileDetails details) {
		
		return dao.save(details);
	}
	
	
	@PostMapping("/feedback")
	public Feedback getFeedback(@RequestBody Feedback feedback) {
	
		return feedbackService.addFeedback(feedback)  ;
		
	}
}
