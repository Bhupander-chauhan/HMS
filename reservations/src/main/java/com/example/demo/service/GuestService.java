package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.guests.Guest;

import com.example.demo.repository.GuestRepo;

@Service
public class GuestService {
	
	@Autowired
	private GuestRepo guestRepo;
	
	//Create Operation
	public Guest create(Guest guest) {
		return guestRepo.save(guest);
		
	}
	//Retrieve Operation
	public List<Guest>getAll(){
		return guestRepo.findAll();
	}
	public Guest getByFirstname(String firstName) {
		return guestRepo.findByFirstName(firstName);
	}
	//update operation
	public Guest update(String firstName, String lastName,String age, String Address, String Aadhar) {
		Guest g = guestRepo.findByFirstName(firstName);
		g.setLastName(lastName);
		g.setAge(age);
		g.setAddress(Address);
		g.setAadhar(Aadhar);
		return guestRepo.save(g);
	}
	// delete operation
	public void deleteAll() {
		guestRepo.deleteAll();
	}
	public void delete(String firstName) {
		Guest g = guestRepo.findByFirstName(firstName);
		guestRepo.delete(g);
		}
	
	

}
