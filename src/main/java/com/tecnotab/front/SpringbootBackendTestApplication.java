package com.tecnotab.front;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tecnotab.front.model.User;
import com.tecnotab.front.repository.UserRepository;

@SpringBootApplication
public class SpringbootBackendTestApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBackendTestApplication.class, args);
	}
	
	@Autowired
	UserRepository userRepo;

	@Override
	public void run(String... args) throws Exception {
		
		userRepo.save(new User("Tom", "randi", "tomRandi@hotmail.com"));
		userRepo.save(new User("guru", "randhawa", "guruRandhawa@gmail.com"));
		userRepo.save(new User("Sophia", "robo", "sophiaRobo@hotmail.com"));
		userRepo.save(new User("rummy", "rozer", "rummy123@hotmail.com"));

	}

}
