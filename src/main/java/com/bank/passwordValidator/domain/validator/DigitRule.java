package com.bank.passwordValidator.domain.validator;

public class DigitRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}