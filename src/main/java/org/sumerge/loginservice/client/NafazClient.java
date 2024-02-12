package org.sumerge.loginservice.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.sumerge.loginservice.config.NafazClientConfig;

@FeignClient(name = "nafaz",url = "${nafaz-service.url}", configuration = NafazClientConfig.class)
public interface NafazClient {
    @PostMapping("${nafaz-service.login-url}")
    String requestRandomNumber(@RequestParam("nationalId") String nationalId, @RequestBody() String callbackUrl);
}
