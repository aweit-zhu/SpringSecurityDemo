package com.example.resposity;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.example.model.User;

import lombok.Data;
import lombok.ToString;

@Repository
@ToString
@Data
public class UserDao {

	public List<User> users;
	
	{
		User admin = new User("admin","$2a$10$eFi3fxM2cPHOpFyVArde9egAbqN571ziadeKKSZx6WWm2svLGjRTO","ROLE_ADMIN,ROLE_USER");
		User user = new User("user","$2a$10$eFi3fxM2cPHOpFyVArde9egAbqN571ziadeKKSZx6WWm2svLGjRTO","ROLE_ADMIN,ROLE_USER");
	
		users = new ArrayList<>();
		users.add(admin);
		users.add(user);
		System.out.println(users);
	}
	
	public static void main(String[] args) {
		BCryptPasswordEncoder b = new BCryptPasswordEncoder();
		System.out.println(b.encode("123456")); //$2a$10$eFi3fxM2cPHOpFyVArde9egAbqN571ziadeKKSZx6WWm2svLGjRTO
	}
}
