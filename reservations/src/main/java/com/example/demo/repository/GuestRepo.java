package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.guests.Guest;

@Repository

public interface GuestRepo extends MongoRepository<Guest, String>{
public Guest findByFirstName(String firstName);
public List<Guest> findByAge(int age);
	
}
