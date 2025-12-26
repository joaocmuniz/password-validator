package com.bank.passwordValidator.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DigitRuleTest {

    private final PasswordRule rule = new DigitRule();

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(rule.isValid(null));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasNoDigit() {
        assertFalse(rule.isValid("AbTp!fok"));
    }

    @Test
    void shouldReturnTrueWhenPasswordHasAtLeastOneDigit() {
        assertTrue(rule.isValid("AbTp9!fok"));
    }
}