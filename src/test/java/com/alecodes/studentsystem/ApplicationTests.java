package com.alecodes.studentsystem;


import com.alecodes.studentsystem.factorypattern.UserFactory;
import com.alecodes.studentsystem.factorypattern.UserType;
import com.alecodes.studentsystem.logic.AdminLogic;
import com.alecodes.studentsystem.logic.ClientLogic;
import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.BasicUser;
import com.alecodes.studentsystem.model.Client;
import org.apache.catalina.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;


@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ApplicationTests {



	@Test
	public void createUserAdmin(){
		UserFactory userFactory = new UserFactory();
		BasicUser basicUser = userFactory.createUser( (BasicUser) userFactory, UserType.ADMIN);
		Admin admin = new Admin("Alexandra Ungur", "aleungur", "ciocolata02");
		assertEquals(admin.getName(), basicUser.getName());
		assertEquals(admin.getUsername(), basicUser.getUsername() );
		assertEquals(admin.getPassword(), basicUser.getPassword());

	}



	}



