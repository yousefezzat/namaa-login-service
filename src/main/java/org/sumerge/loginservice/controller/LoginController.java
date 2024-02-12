package org.sumerge.loginservice.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.sumerge.loginservice.model.nafaz_response.NafazResponse;
import org.sumerge.loginservice.service.LoginService;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;
    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @PostMapping("/login")
    public ResponseEntity<NafazResponse> login(@RequestBody String nationalId, HttpServletRequest request) {
        logger.info("Received {} request to {} with headers: {}", request.getMethod(), request.getRequestURI(), request.getHeaderNames());
        logger.info("Received login request for nationalId: {}", nationalId);
        NafazResponse nafazResponse = loginService.login(nationalId);
        return ResponseEntity.ok(nafazResponse);
    }
    @PostMapping("/callback")
    public ResponseEntity<Void> callback() {
        return ResponseEntity.ok().build(); //temporary
    }
}
