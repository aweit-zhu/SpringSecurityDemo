package com.example.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.model.User;
import com.example.resposity.UserDao;

@Service
public class UserDetailsSeviceImpl implements UserDetailsService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println("loadUserByUsername: " + username);
		
		Optional<User> user = userDao.getUsers().stream().filter(u -> u.getUsername().equals(username)).findFirst();
		
		if(!user.isPresent())
			throw new UsernameNotFoundException(username);

		return user.get();
	}

}
