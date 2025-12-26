package com.bank.passwordValidator.domain.validator;

public class LowercaseRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isLowerCase(c)) {
                return true;
            }
        }
        return false;
    }
}