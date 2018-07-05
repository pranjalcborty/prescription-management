package com.prescription.proj.helper;

import com.prescription.proj.domain.User;

import javax.servlet.http.HttpSession;
import java.util.LinkedHashMap;
import java.util.Map;

public class Constants {

    //Paths
    public static final String PROJECT_PATH = "/prescription";
    public static final String ASSETS_PATH = "/assets";
    public static final String LOGIN_PATH = "/login";
    public static final String LOGOUT_PATH = "/logout";

    public static final String HOME_PATH = "/home";
    public static final String REG_PATH = "/register";
    public static final String CREATE_PATIENT_PATH = "/createPatient";
    public static final String ADD_USER_PATH = "/addUser";

    public static final String PRESCRIPTION_PATH = "/prescription";
    public static final String PATIENT_PATH = "/patient";
    public static final String USER_LIST_PATH = "/users";

    public static final String CREATE_PRESCRIPTION_PATH = "/createPrescription";

    //Views
    public static final String LOGIN_VIEW = "login";
    public static final String REG_VIEW = "register";
    public static final String DOCTOR_VIEW = "doctor";
    public static final String PATIENT_VIEW = "patient";
    public static final String CREATE_PATIENT_VIEW = "createPatient";
    public static final String ADD_USER_VIEW = "addUser";
    public static final String PRESCRIPTION_VIEW = "prescription";
    public static final String CREATE_PRESCRIPTION_VIEW = "createPrescription";

    //Session Attributes
    public static final String USER = "user";
    public static final String ADMIN = "admin";
    public static final String DOCTOR = "doctor";
    public static final String PATIENT = "patient";
    public static final String PATIENTS = "patients";
    public static final String DOCTORS = "doctors";
    public static final String USERS = "users";
    public static final String IS_DOCTOR = "isDoctor";
    public static final String PRESCRIPTION = "prescription";
    public static final String PRESCRIPTIONS = "prescriptions";

    public static String redirectTo(String path) {
        return "redirect:" + path;
    }

    public static boolean isDoctor(HttpSession session) {
        return (boolean) session.getAttribute(IS_DOCTOR);
    }

    public static User getUser(HttpSession session) {
        return (User) session.getAttribute(USER);
    }

    public static String urlAddParams(String url, String paramName, String paramValue) {
        return url + (url.contains("?") ? "&" : "?") + paramName + "=" + paramValue;
    }
}
