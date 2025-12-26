package com.bank.passwordValidator.domain.validator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NoRepeatedCharRuleTest {

    private final PasswordRule rule = new NoRepeatedCharRule();

    @Test
    void shouldReturnFalseWhenPasswordIsNull() {
        assertFalse(rule.isValid(null));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasRepeatedCharacter() {
        assertFalse(rule.isValid("AbTp9!foo"));
    }

    @Test
    void shouldReturnFalseWhenPasswordHasRepeatedUppercaseCharacter() {
        assertFalse(rule.isValid("AbTp9!foA"));
    }

    @Test
    void shouldReturnTrueWhenPasswordHasNoRepeatedCharacters() {
        assertTrue(rule.isValid("AbTp9!fok"));
    }
}