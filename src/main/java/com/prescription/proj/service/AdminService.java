package com.prescription.proj.service;

import com.prescription.proj.dao.AdminDao;
import com.prescription.proj.domain.Admin;
import com.prescription.proj.domain.LoginUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class AdminService {

    private final AdminDao adminDao;

    @Autowired
    public AdminService(AdminDao adminDao) {
        this.adminDao = adminDao;
    }

    public void save(Admin admin) {
        adminDao.save(admin);
    }

    public boolean isNoAdmin() {
        return adminDao.countAdmin() == 0;
    }

    public Admin getUserByUserName(String userName) {
        return adminDao.getUserByUserName(userName);
    }

    public boolean isUserExistsWithUniqueIdentifiers(Admin admin) {
        return !adminDao.getUserListWithUniqueIdentifiers(admin).isEmpty();
    }

    public boolean isAllowedUser(LoginUser user) {
        Admin retrievedAdmin = getUserByUserName(user.getUserName());

        if (Objects.isNull(retrievedAdmin)) {
            return false;
        }

        return retrievedAdmin.getPassword().equals(user.getPassword());
    }
}
