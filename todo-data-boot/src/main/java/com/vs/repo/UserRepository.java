package com.vs.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.vs.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

	
}
