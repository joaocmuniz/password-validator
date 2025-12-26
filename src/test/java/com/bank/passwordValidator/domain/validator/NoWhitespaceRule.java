package com.bank.passwordValidator.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoWhitespaceRuleTest {

    private final PasswordRule rule = new NoWhitespaceRule();

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(rule.isValid(null));
    }

    @Test
    void shouldReturnFalseWhenPasswordContainsWhitespace() {
        assertFalse(rule.isValid("AbTp9 fok"));
    }

    @Test
    void shouldReturnTrueWhenPasswordHasNoWhitespace() {
        assertTrue(rule.isValid("AbTp9!fok"));
    }
}