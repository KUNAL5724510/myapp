package com.myapp.myapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/tikki")
public class ControllerApp
{
	@Autowired
	  private ServiceApp su;


	  @PostMapping("/save")
	  public ResponseEntity<EntityApp> saveUser(@RequestBody EntityApp user) {
	      EntityApp savedUser = su.saveUser(user);
	      return ResponseEntity.ok(savedUser);
	  }
}
