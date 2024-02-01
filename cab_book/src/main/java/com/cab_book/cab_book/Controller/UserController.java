package com.cab_book.cab_book.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cab_book.cab_book.Model.User;
import com.cab_book.cab_book.Repository.UserRepo;

@RestController
public class UserController {
	@Autowired
	private UserRepo userRepo;
	
	@GetMapping("/getuser")
	public ResponseEntity<List<User>> getUser(){
		List<User> userList = new ArrayList<>();
		userRepo.findAll().forEach(userList::add);
		if(userList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<>(userList, HttpStatus.OK);
		
		
	}
	
	
	@PostMapping("/register")
	public ResponseEntity<User> add_user(@RequestBody User user) {
		User userobj = userRepo.save(user);
		
		return new ResponseEntity<>(userobj, HttpStatus.OK);
		
	}
}
