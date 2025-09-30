package com.cognizant.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.cognizant.entity.UsserCredential;
import com.cognizant.repository.UserCredentialRepository;

@Service
public class AuthService {

	@Autowired
	private UserCredentialRepository repository;

	@Autowired
	private PasswordEncoder passwordEncoder;

	@Autowired
	private JwtService jwtService;

	public String saveUser(UsserCredential credential) {

		if (repository.existsByUsername(credential.getUsername())) {
			throw new RuntimeException("Username already exists");
		}

		credential.setPassword(passwordEncoder.encode(credential.getPassword())); // bCrypt to encrypt -->saving in db
		repository.save(credential);
		return "User added to the system";
	}

	public String generateToken(String username) {
		return jwtService.generateToken(username);
	}

	public void validateToken(String token) {
		jwtService.validateToken(token);
	}
}
