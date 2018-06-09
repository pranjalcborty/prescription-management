package com.prescription.proj.service;

import com.prescription.proj.dao.UserDao;
import com.prescription.proj.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public boolean isAllowed(User user) {
        User retrievedUser = userDao.getUserByUserName(user.getUserName());

        if (Objects.isNull(retrievedUser)) {
            return false;
        }

        return retrievedUser.getPassword().equals(user.getPassword());
    }
}
