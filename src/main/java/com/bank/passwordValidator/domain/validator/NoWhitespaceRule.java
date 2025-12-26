package com.bank.passwordValidator.domain.validator;

public class NoWhitespaceRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }
        return !password.contains(" ");
    }
}