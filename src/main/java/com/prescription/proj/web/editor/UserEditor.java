package com.prescription.proj.web.editor;

import com.prescription.proj.service.UserService;

import java.beans.PropertyEditorSupport;

public class UserEditor extends PropertyEditorSupport {

    private UserService service;

    public UserEditor(UserService service) {
        this.service = service;
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        long id = Long.parseLong(text);

        if (id == 0) {
            setValue(null);
        } else {
            setValue(service.getUser(id));
        }
    }
}
