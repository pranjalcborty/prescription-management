package com.prescription.proj.service;

import com.prescription.proj.dao.UserDao;
import com.prescription.proj.domain.User;
import com.prescription.proj.domain.LoginUser;
import com.prescription.proj.domain.User;
import com.prescription.proj.domain.User.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class UserService {

    private final UserDao userDao;

    @Autowired
    public UserService(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }

    public User getUserByUserName(String userName) {
        return userDao.getUserByUserName(userName);
    }

    public boolean isUserExistsWithUniqueIdentifiers(User User) {
        return !userDao.getUserListWithUniqueIdentifiers(User).isEmpty();
    }

    public boolean isAllowedUser(LoginUser user) {
        User retrievedUser = getUserByUserName(user.getUserName());

        if (Objects.isNull(retrievedUser)) {
            return false;
        }

        return retrievedUser.getPassword().equals(user.getPassword());
    }

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }

    public List<User> getAllUsers(Role role) {
        return userDao.getUsers(role);
    }
}
