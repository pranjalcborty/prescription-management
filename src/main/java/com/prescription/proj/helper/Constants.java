package com.prescription.proj.helper;

import com.prescription.proj.domain.User;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.*;

import static org.springframework.web.context.request.RequestContextHolder.currentRequestAttributes;

public class Constants {

    public static List<String> genderList = new ArrayList<>();
    public static List<String> bloodList = new ArrayList<>();
    public static List<String> religionList = new ArrayList<>();

    static {
        genderList.add("Female");
        genderList.add("Male");
        genderList.add("Other");
        genderList = Collections.unmodifiableList(genderList);

        bloodList.add("A(+)ve");
        bloodList.add("B(+)ve");
        bloodList.add("AB(+)ve");
        bloodList.add("O(+)ve");
        bloodList.add("A(-)ve");
        bloodList.add("B(-)ve");
        bloodList.add("AB(-)ve");
        bloodList.add("O(-)ve");
        bloodList = Collections.unmodifiableList(bloodList);

        religionList.add("Islam");
        religionList.add("Hinduism");
        religionList.add("Buddhism");
        religionList.add("Christianity");
        religionList.add("Other");
        religionList = Collections.unmodifiableList(religionList);
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
    public static final String TEST_PATH = "/prescribeTest";

    public static final String PRESCRIPTION_PATH = "/prescription";
    public static final String APPOINTMENT_PATH = "/appointment";
    public static final String MEDICINE_PATH = "/medicine";
    public static final String PATIENT_PATH = "/patient";
    public static final String USER_LIST_PATH = "/users";

    public static final String CREATE_PRESCRIPTION_PATH = "/createPrescription";
    public static final String CREATE_APPOINTMENT_PATH = "/createAppointment";
    public static final String CREATE_PATHOLOGY_PATH = "/createPathReport";

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
    public static final String CREATE_TEST_VIEW = "createTest";
    public static final String MEDICINE_VIEW = "viewAddMedicine";
    public static final String PATHOLOGY_VIEW = "createPathReport";
    public static final String HOME_VIEW = "home";
    public static final String FAIL_VIEW = "failPage";

    //Session Attributes
    public static final String USER = "user";
    public static final String PATIENT = "patient";
    public static final String APPOINTMENT = "appointment";
    public static final String APPOINTMENTS = "appointments";
    public static final String PATIENTS = "patients";
    public static final String USERS = "users";
    public static final String DOCTORS = "doctors";
    public static final String PRESCRIPTION = "prescription";
    public static final String PRESCRIPTIONS = "prescriptions";
    public static final String MEDICINES = "medicines";
    public static final String MEDICINE = "medicine";
    public static final String TEST = "test";
    public static final String TESTS = "tests";
    public static final String REPORT = "report";
    public static final String REPORTS = "reports";
    public static final String GENDER = "gender";
    public static final String RELIGION = "religion";
    public static final String BLOOD = "blood";

    public static String redirectTo(String path) {
        return "redirect:" + path;
    }

    public static User getUser(HttpSession session) {
        return (User) session.getAttribute(USER);
    }

    public static User getUser() {
        return getUser(getSession());
    }

    private static Collection<User.Role> getRoles() {
        return getUser().getRole();
    }

    private static HttpSession getSession() {
        return ((ServletRequestAttributes) currentRequestAttributes()).getRequest().getSession();
    }

    public static String urlAddParams(String url, String paramName, String paramValue) {
        return url + (url.contains("?") ? "&" : "?") + paramName + "=" + paramValue;
    }

    public static boolean notHasRole(User.Role... roles) {
        return Arrays.stream(roles).noneMatch(getRoles()::contains);
    }

    public static boolean isEmpty(Collection c) {
        return Objects.isNull(c) || c.isEmpty();
    }
}
