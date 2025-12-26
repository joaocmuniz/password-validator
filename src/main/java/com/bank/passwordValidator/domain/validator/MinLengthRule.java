package com.bank.passwordValidator.domain.validator;

public class MinLengthRule implements PasswordRule {

    private static final int MIN_LENGTH = 9;

    @Override
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return password.length() >= MIN_LENGTH;
    }
}