package com.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.Test.Entity.User;
import com.Test.Repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);

		UserRepository userRepo = context.getBean(UserRepository.class);
		System.out.println(userRepo.getClass().getName());
		User entity = new User();

		entity.setUserid(106);
		entity.setUsername("maxwell");
		entity.setUseremail("glen@gmail.com");
		entity.setUserage(31);
		entity.setUserphno(4100332255l);
		entity.setUsercountry("australia");

		userRepo.save(entity);
//		System.out.println("**** Record Inserted ****"); 

		/*
		 * User entity1 = new User(); entity1.setUserid(102);
		 * entity1.setUsername("Mic"); entity1.setUseremail("mic@gmail.com");
		 * entity1.setUserage(26); entity1.setUserphno(9966332525l);
		 * entity1.setUsercountry("australia");
		 * 
		 * User entity2 = new User(); entity2.setUserid(103);
		 * entity2.setUsername("Jos"); entity2.setUseremail("Jos@gmail.com");
		 * entity2.setUserage(30); entity2.setUserphno(9966330000l);
		 * entity2.setUsercountry("england");
		 * 
		 * List<User> entriesList =Arrays.asList(entity1,entity2);
		 * 
		 * userRepo.saveAll(entriesList);
		 */

		/*
		 * Optional<User> findById= userRepo.findById(103); if(findById.isPresent()) {
		 * System.out.println(findById.get()); }
		 */

		/*
		 * Iterable<User> findAllById = userRepo.findAllById(Arrays.asList(101,103));
		 * findAllById.forEach(User->{ System.out.println(User); });
		 */

		/*
		 * Iterable<User> findAll = userRepo.findAll(); findAll.forEach(User->{
		 * System.out.println(User); });
		 */

//		System.out.println("total records : : "+userRepo.count());

//		System.out.println("The Existed record :: "+userRepo.existsById(104));

//		userRepo.deleteById(103);

	}

}
