package com.xworkz.jwt.service;

import com.xworkz.jwt.dao.RoleDao;
import com.xworkz.jwt.dao.UserDao;
import com.xworkz.jwt.entity.Role;
import com.xworkz.jwt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;
    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;



    public void initRoleAndUsers() {
        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for new created record ");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserFirstName("prem");
        adminUser.setUserLastName("p");
        adminUser.setUserPassword(getEncodedPassword("ppp@123"));
        adminUser.setUserName("ppp@123");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

       /* User user = new User();
        user.setUserFirstName("Raju");
        user.setUserLastName("Kumar");
        user.setUserPassword(getEncodedPassword("raaju@333"));
        user.setUserName("raaju@123");
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(userRole);
        user.setRole(userRoles);
        userDao.save(user);*/
    }

    public User registerNewUser(User user){
        Role role = roleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));
        return  userDao.save(user);
    }

    public String getEncodedPassword(String password){
        return  passwordEncoder.encode(password);
    }
}
