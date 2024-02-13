package org.sumerge.loginservice.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.sumerge.loginservice.client.NafazClient;
import org.sumerge.loginservice.model.nafaz.nafaz_request.NafazRequest;
import org.sumerge.loginservice.model.login_request.NationalId;
import org.sumerge.loginservice.model.nafaz.nafaz_response.NafazResponse;

@Service
@RequiredArgsConstructor
public class LoginService {
    @Value("${baseUrl}")
    private String baseUrl;

    private final NafazClient nafazClient;

    public NafazResponse login(NationalId nationalId) {
        String id = nationalId.getNationalId();


        NafazRequest callBackUrl = new NafazRequest(baseUrl + "/callback");
        return nafazClient.sendLoginRequest(id, callBackUrl);
    }
}
