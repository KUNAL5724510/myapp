package com.myapp.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ServiceApp
{
	@Autowired
	   private RepositoryApp rf;

	   public EntityApp saveUser(EntityApp user) {
		   return rf.save(user);
	   }
}
