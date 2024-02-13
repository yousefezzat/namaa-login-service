package org.sumerge.loginservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;
import org.sumerge.loginservice.config.NafazClientConfig;
import org.sumerge.loginservice.model.nafaz.nafaz_request.NafazRequest;
import org.sumerge.loginservice.model.nafaz.nafaz_response.NafazResponse;

@FeignClient(name = "nafaz",url = "${nafaz-service.url}", configuration = NafazClientConfig.class)
public interface NafazClient {



    @PostMapping("/hrsd-dev/internal-services/v1/nafath/login-requests/{Id}/send")
    NafazResponse sendLoginRequest(@PathVariable("Id") String nationalId, @RequestBody() NafazRequest callbackUrl);

}
