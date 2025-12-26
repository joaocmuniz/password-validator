package com.bank.passwordValidator.domain.validator;

public class UppercaseRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                return true;
            }
        }
        return false;
    }
}