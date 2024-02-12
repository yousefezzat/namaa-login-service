package org.sumerge.loginservice.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.sumerge.loginservice.model.nafaz_response.NafazResponse;
import org.sumerge.loginservice.service.LoginService;

import java.util.logging.Logger;

@RestController
@RequiredArgsConstructor
public class LoginController {
    private final LoginService loginService;
    @PostMapping("/login")
    public ResponseEntity<NafazResponse> login(@RequestBody String nationalId) {
        NafazResponse nafazResponse = loginService.login(nationalId);

            return  ResponseEntity.ok(nafazResponse);

    }

    @PostMapping("/callback")
    public ResponseEntity<Void> callback() {
        return ResponseEntity.ok().build(); //temporary
    }

}
