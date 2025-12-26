package com.bank.passwordValidator.application.service;

import com.bank.passwordValidator.domain.validator.PasswordRule;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PasswordValidationServiceTest {

    @Test
    void shouldReturnTrueWhenAllRulesAreValid() {
        PasswordRule rule1 = Mockito.mock(PasswordRule.class);
        PasswordRule rule2 = Mockito.mock(PasswordRule.class);

        Mockito.when(rule1.isValid("password")).thenReturn(true);
        Mockito.when(rule2.isValid("password")).thenReturn(true);

        PasswordValidationService service =
                new PasswordValidationService(List.of(rule1, rule2));

        assertTrue(service.validate("password"));
    }

    @Test
    void shouldReturnFalseWhenAnyRuleIsInvalid() {
        PasswordRule rule1 = Mockito.mock(PasswordRule.class);
        PasswordRule rule2 = Mockito.mock(PasswordRule.class);

        Mockito.when(rule1.isValid("password")).thenReturn(true);
        Mockito.when(rule2.isValid("password")).thenReturn(false);

        PasswordValidationService service =
                new PasswordValidationService(List.of(rule1, rule2));

        assertFalse(service.validate("password"));
    }
}