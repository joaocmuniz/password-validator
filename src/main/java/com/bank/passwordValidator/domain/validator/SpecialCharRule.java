package com.bank.passwordValidator.domain.validator;

import java.util.Set;

public class SpecialCharRule implements PasswordRule {

    private static final Set<Character> VALID_SPECIAL_CHARS =
            Set.of('!', '@', '#', '$', '%', '^', '&', '*', '(', ')', '-', '+');

    @Override
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        for (char c : password.toCharArray()) {
            if (VALID_SPECIAL_CHARS.contains(c)) {
                return true;
            }
        }
        return false;
    }
}