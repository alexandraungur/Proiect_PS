package com.alecodes.studentsystem.factorypattern;


import com.alecodes.studentsystem.model.Admin;
import com.alecodes.studentsystem.model.BasicUser;
import com.alecodes.studentsystem.model.Client;

public class UserFactory {
    public BasicUser createUser (BasicUser user, UserType userType) {
        if (userType == UserType.ADMIN)
            return new Admin(user.getName(), user.getUsername(), user.getPassword());
        if (userType == UserType.CLIENT)
            return new Client(user.getName(), user.getUsername(), user.getPassword(),"","",0);
        return null;
    }
}
