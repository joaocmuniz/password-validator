package com.bank.passwordValidator.domain.validator;

public interface PasswordRule {
    boolean isValid(String password);
}
