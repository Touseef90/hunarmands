package com.hunarmand.io.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.hunarmand.io.model.User;

public interface HunarmandRepository extends MongoRepository<User, Integer> {

	List<User> findByName(String name);

}
