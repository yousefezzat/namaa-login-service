package org.sumerge.loginservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.sumerge.loginservice.client.NafazClient;
import org.sumerge.loginservice.model.NafazResponse;

@Service
@RequiredArgsConstructor
public class LoginService {
    @Value("${baseUrl}")
    private String baseUrl;

    private final NafazClient nafazClient;

    public NafazResponse login(String nationalId) {

        String callBackUrl = baseUrl + "/callback";
        String OTP = nafazClient.requestRandomNumber(nationalId, callBackUrl);
        return new NafazResponse(OTP);
    }
}
