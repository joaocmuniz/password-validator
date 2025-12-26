package com.bank.passwordValidator.application.dto;

public class PasswordResponse {

    private boolean valid;

    public PasswordResponse(boolean valid) {
        this.valid = valid;
    }

    public boolean isValid() {
        return valid;
    }
}
