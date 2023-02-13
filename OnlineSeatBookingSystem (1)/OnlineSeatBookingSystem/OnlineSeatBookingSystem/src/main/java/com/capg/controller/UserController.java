package com.capg.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.dto.LoginRequest;
import com.capg.entity.User;
import com.capg.exception.BookingNotFoundException;
import com.capg.exception.UserNotFoundException;
import com.capg.service.UserService;
@RestController
@RequestMapping("/osb-user")
public class UserController {

	@Autowired
	UserService userService;
	
	@PostMapping("/users")
	public User userService(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@GetMapping("/users/login")
	public User loginUser(@RequestBody LoginRequest request)throws UserNotFoundException{
		return userService.loginUser(request.getEmail(), request.getPassword());
	}
	
	@GetMapping("/users/{emailId}")
	public User findByUserEmailId(@PathVariable String emailId)throws UserNotFoundException{
		return userService.findByUserEmailId(emailId);
	}
	
	@GetMapping("/isAdmin/{emailId}")
	public boolean isAdmin(@PathVariable String emailId) {
		return userService.isAdmin(emailId);
	}
	
	@GetMapping("/validateSecurityAnswer/{emailId}/{securityAnswer}")
	public boolean validateSecurityAnswer(@PathVariable String emailId,@PathVariable String securityAnswer) {
		return userService.validateSecurityAnswer(emailId, securityAnswer);
	}
	
	@PutMapping("/resetPassword/{emailId}/{password}")
	public void resetPassword(@PathVariable String emailId,@PathVariable String password) {
		userService.resetPassword(emailId, password);
	}
	
	@DeleteMapping("/deleteUserByEmailId/{emailId}/{password}")
	public User deleteUserByEmailId(@PathVariable String emailId,@PathVariable String password) {
		return userService.deleteUserByEmailId(emailId, password);
	}
	
	@PutMapping("/updateUserPasswordByEmailId/{emailId}/{password}")
	public void updateUserPasswordByEmailId(@PathVariable String emailId,@PathVariable String password) throws UserNotFoundException{
		userService.updateUserPasswordByEmailId(emailId, password);
	}

	@PostMapping("/users")
	public void save(@RequestBody User users) {
		userService.save(users);
	}
	
	@PutMapping("/swapBookings/{bookingId1}/{bookingId2}")
	public boolean swapBookings(int bookingId1, int bookingId2) throws BookingNotFoundException{
		return userService.swapBookings(bookingId1, bookingId2);
	}
}
