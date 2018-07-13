package com.prescription.proj.helper;

import com.prescription.proj.domain.User;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import static com.prescription.proj.domain.User.Role.*;
import static java.util.Arrays.stream;
import static org.springframework.web.context.request.RequestContextHolder.currentRequestAttributes;

public class Constants {

    public static Map<User.Role, User.Role> creationAuthority;

    static {
        creationAuthority = new LinkedHashMap<>();
        creationAuthority.put(RECEPTIONIST, User.Role.ADMIN);
        creationAuthority.put(REFERRER, User.Role.ADMIN);
        creationAuthority.put(User.Role.DOCTOR, User.Role.ADMIN);
        creationAuthority.put(PATHOLOGIST, User.Role.ADMIN);
        creationAuthority.put(PHARMACIST, User.Role.ADMIN);
        creationAuthority.put(User.Role.ADMIN, User.Role.ADMIN);

        creationAuthority = Collections.unmodifiableMap(creationAuthority);
    }

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
    public static final String APPOINTMENT_PATH = "/appointment";
    public static final String PATIENT_PATH = "/patient";
    public static final String USER_LIST_PATH = "/users";

    public static final String CREATE_PRESCRIPTION_PATH = "/createPrescription";
    public static final String CREATE_APPOINTMENT_PATH = "/createAppointment";

    //Views
    public static final String LOGIN_VIEW = "login";
    public static final String REG_VIEW = "register";
    public static final String USERS_LIST_VIEW = "userList";
    public static final String PATIENT_VIEW = "patient";
    public static final String CREATE_PATIENT_VIEW = "createPatient";
    public static final String ADD_USER_VIEW = "addUser";
    public static final String PRESCRIPTION_VIEW = "prescription";
    public static final String APPOINTMENTS_VIEW = "appointments";
    public static final String CREATE_PRESCRIPTION_VIEW = "createPrescription";
    public static final String CREATE_APPOINTMENT_VIEW = "createAppointment";
    public static final String FAIL_VIEW = "failPage";

    //Session Attributes
    public static final String USER = "user";
    public static final String ROLE = "currentRole";
    public static final String PATIENT = "patient";
    public static final String APPOINTMENT = "appointment";
    public static final String APPOINTMENTS = "appointments";
    public static final String PATIENTS = "patients";
    public static final String USERS = "users";
    public static final String DOCTORS = "doctors";
    public static final String PRESCRIPTION = "prescription";
    public static final String PRESCRIPTIONS = "prescriptions";

    public static String redirectTo(String path) {
        return "redirect:" + path;
    }

    public static User getUser(HttpSession session) {
        return (User) session.getAttribute(USER);
    }

    public static User getUser() {
        return getUser(getSession());
    }
    public static User.Role getRole() {
        return getUser().getRole();
    }

    public static HttpSession getSession() {
        return ((ServletRequestAttributes) currentRequestAttributes()).getRequest().getSession();
    }

    public static String urlAddParams(String url, String paramName, String paramValue) {
        return url + (url.contains("?") ? "&" : "?") + paramName + "=" + paramValue;
    }

    public static boolean notHasRole(User.Role... roles) {
        User user = getUser();
        return stream(roles).noneMatch(role -> user.getRole().equals(role));
    }
}
