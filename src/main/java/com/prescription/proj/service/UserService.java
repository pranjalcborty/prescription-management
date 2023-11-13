package com.prescription.proj.service;

import com.prescription.proj.dao.UserDao;
import com.prescription.proj.domain.User;
import com.prescription.proj.domain.LoginUser;
import com.prescription.proj.domain.User.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NoResultException;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

    public User getUser(String userName) {
        try {
            return userDao.getUser(userName);
        } catch (NoResultException e) {
            return null;
        }
    }

    public User getUser(long id) {
        return userDao.getUser(id);
    }

    public boolean isUserExistsWithUniqueIdentifiers(User User) {
        return !userDao.getUserListWithUniqueIdentifiers(User).isEmpty();
    }

    public boolean isAllowedUser(LoginUser user) {
        User retrievedUser = getUser(user.getUserName());

        if (Objects.isNull(retrievedUser)) {
            return false;
        }

        return retrievedUser.getPassword().equals(user.getPassword());
    }

    public List<User> getAllUsers() {
        return userDao.getUsers();
    }

    public List<User> getAllUsers(Role role) {
        return getAllUsers().stream().filter(u -> u.getRole().contains(role)).collect(Collectors.toList());
    }
}
