package com.topsyntax.service;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class JwtUserDetailsService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// hard coding password decoded by BCryptPasswordDecoder from online source
		if ("admin".equals(username)) {
			return new User("admin", "$2a$04$nARqxy3fqQ2sy6Gnk0qltOxoZYEkeqIcosWfDcTKgk19ly1GkYWMC", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
	}

}
