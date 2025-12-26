package com.bank.passwordValidator.domain.validator;

import java.util.HashSet;
import java.util.Set;

public class NoRepeatedCharRule implements PasswordRule {

    @Override
    public boolean isValid(String password) {
        if (password == null) {
            return false;
        }

        Set<Character> seenCharacters = new HashSet<>();

        for (char c : password.toCharArray()) {
            if (!seenCharacters.add(c)) {
                return false;
            }
        }
        return true;
    }
}