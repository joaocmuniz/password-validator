package com.bank.passwordValidator.infrastructure.config;

import com.bank.passwordValidator.application.service.PasswordValidationService;
import com.bank.passwordValidator.domain.validator.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PasswordValidationConfig {

    @Bean
    public PasswordValidationService passwordValidationService() {
        return new PasswordValidationService(List.of(
                new MinLengthRule(),
                new NoWhitespaceRule(),
                new DigitRule(),
                new LowercaseRule(),
                new UppercaseRule(),
                new SpecialCharRule(),
                new NoRepeatedCharRule()
        ));
    }
}