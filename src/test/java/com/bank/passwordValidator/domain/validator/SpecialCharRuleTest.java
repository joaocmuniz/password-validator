package com.bank.passwordValidator.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialCharRuleTest {

    private final PasswordRule rule = new SpecialCharRule();

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(rule.isValid(null));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasNoSpecialCharacter() {
        assertFalse(rule.isValid("AbTp9fok"));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasInvalidSpecialCharacter() {
        assertFalse(rule.isValid("AbTp9_fok"));
    }

    @Test
    void shouldReturnTrueWhenPasswordHasValidSpecialCharacter() {
        assertTrue(rule.isValid("AbTp9!fok"));
    }
}