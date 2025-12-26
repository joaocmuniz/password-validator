package com.bank.passwordValidator.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LowercaseRuleTest {

    private final PasswordRule rule = new LowercaseRule();

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(rule.isValid(null));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasNoLowercaseLetter() {
        assertFalse(rule.isValid("ABTP9!FOK"));
    }

    @Test
    void shouldReturnTrueWhenPasswordHasAtLeastOneLowercaseLetter() {
        assertTrue(rule.isValid("AbTp9!fok"));
    }
}