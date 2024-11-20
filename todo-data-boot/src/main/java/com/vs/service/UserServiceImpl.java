package com.vs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vs.entity.User;
import com.vs.repo.UserRepository;
@Service
public class UserServiceImpl implements UserService {


	@Autowired
	private UserRepository repo;

	@Override
	public String save(User u) {
		
		repo.save(u);
		
		return "User saved Successfully";
		

	}

	@Override
	public User fetch(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public List<User> list() {
	
		return repo.findAll();
	}

	@Override
	public String remove(int id) {
		
		repo.deleteById(id);
		return "User Deleted Successfully";

	}

	

	

}
