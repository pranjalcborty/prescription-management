package com.prescription.proj.helper;

import com.prescription.proj.domain.User;

import javax.servlet.http.HttpSession;

public class Constants {

    //Paths
    public static final String PROJECT_PATH = "/prescription";
    public static final String ASSETS_PATH = "/assets";
    public static final String LOGIN_PATH = "/login";
    public static final String HOME_PATH = "/home";
    public static final String REG_PATH = "/register";
    public static final String PRESCRIPTION_PATH = "/prescription";
    public static final String DOCTOR_PATH = "/doctor";
    public static final String ADD_DOCTOR_PATH = "/addDoctor";
    public static final String LOGOUT_PATH = "/logout";

    //Views
    public static final String LOGIN_VIEW = "login";
    public static final String REG_VIEW = "register";
    public static final String DOCTOR_VIEW = "doctor";
    public static final String ADD_DOCTOR_VIEW = "addDoctor";

    //Session Attributes
    public static final String USER = "user";
    public static final String ADMIN = "admin";
    public static final String DOCTOR = "doctor";
    public static final String IS_DOCTOR = "isDoctor";

    public static String redirectTo(String path) {
        return "redirect:" + path;
    }

    public static boolean isDoctor(HttpSession session) {
        return (boolean) session.getAttribute(IS_DOCTOR);
    }

    public static User getUser(HttpSession session) {
        return (User) session.getAttribute(USER);
    }
}
