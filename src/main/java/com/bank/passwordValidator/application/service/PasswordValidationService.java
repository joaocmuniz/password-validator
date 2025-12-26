package com.bank.passwordValidator.application.service;

import com.bank.passwordValidator.domain.validator.PasswordRule;

import java.util.List;

public class PasswordValidationService {

    private final List<PasswordRule> rules;

    public PasswordValidationService(List<PasswordRule> rules) {
        this.rules = rules;
    }

    public boolean validate(String password) {
        return rules.stream().allMatch(rule -> rule.isValid(password));
    }
}