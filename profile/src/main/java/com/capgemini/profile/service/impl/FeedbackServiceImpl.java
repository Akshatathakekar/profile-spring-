package com.capgemini.profile.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.profile.dao.FeedbackDao;
import com.capgemini.profile.entity.Feedback;
import com.capgemini.profile.service.FeedbackService;

@Service
public class FeedbackServiceImpl implements FeedbackService{

	@Autowired 
	private FeedbackDao dao;
	
	@Override
	public Feedback addFeedback(Feedback feedback) {
		// TODO Auto-generated method stub
		return dao.save(feedback);
	}

	
	
}
