package com.prescription.proj.helper;

public class Constants {

    //Paths
    public static final String ASSETS_PATH = "/assets";
    public static final String LOGIN_PATH = "/login";
    public static final String HOME_PATH = "/home";
    public static final String REGISTER_PATH = "/register";

    //Views
    public static final String LOGIN_VIEW = "login";
    public static final String HOME_VIEW = "home";
    public static final String REGISTER_VIEW = "register";

    public static final String USER = "user";

    public static String redirectTo(String path) {
        return "redirect:" + path;
    }
}
