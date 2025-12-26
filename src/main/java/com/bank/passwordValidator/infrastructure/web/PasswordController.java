package com.bank.passwordValidator.infrastructure.web;

import com.bank.passwordValidator.application.dto.PasswordRequest;
import com.bank.passwordValidator.application.dto.PasswordResponse;
import com.bank.passwordValidator.application.service.PasswordValidationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/password")
public class PasswordController {

    private final PasswordValidationService service;

    public PasswordController(PasswordValidationService service) {
        this.service = service;
    }

    @PostMapping("/validate")
    public ResponseEntity<PasswordResponse> validate(
            @RequestBody PasswordRequest request
    ) {
        boolean valid = service.validate(request.getPassword());
        return ResponseEntity.ok(new PasswordResponse(valid));
    }
}