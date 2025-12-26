package com.bank.passwordValidator.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinLengthRuleTest {

    private final PasswordRule rule = new MinLengthRule();

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(rule.isValid(null));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasLessThanNineCharacters() {
        assertFalse(rule.isValid("AbTp9!fo"));
    }

    @Test
    void shouldReturnTrueWhenPasswordHasNineOrMoreCharacters() {
        assertTrue(rule.isValid("AbTp9!fok"));
    }
}