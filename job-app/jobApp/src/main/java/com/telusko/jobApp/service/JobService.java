package com.telusko.jobApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.telusko.jobApp.model.JobPost;
import com.telusko.jobApp.repo.JobRepo;

@Service
public class JobService {
	@Autowired
	private JobRepo repo;
	
	                          //DTO object 
	public void addJob(JobPost jobPost) {
		repo.addJob(jobPost);	
	}
	
	public List<JobPost> getAllJobs(){
		return repo.getAllJobs();
		
	}
	

}
