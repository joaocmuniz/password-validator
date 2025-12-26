package com.bank.passwordValidator.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UppercaseRuleTest {

    private final PasswordRule rule = new UppercaseRule();

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(rule.isValid(null));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasNoUppercaseLetter() {
        assertFalse(rule.isValid("abtp9!fok"));
    }

    @Test
    void shouldReturnTrueWhenPasswordHasAtLeastOneUppercaseLetter() {
        assertTrue(rule.isValid("AbTp9!fok"));
    }
}