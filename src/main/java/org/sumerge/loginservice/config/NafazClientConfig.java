package org.sumerge.loginservice.config;

import feign.Logger;
import feign.RequestInterceptor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

public class NafazClientConfig {
    @Bean
    RequestInterceptor requestInterceptor(@Value("${nafaz-service.client-id}") String id, @Value("${nafaz-service.client-secret}") String secret,
           @Value("${x-validation-report}") String validate ) {
        {
            return requestTemplate -> {
                requestTemplate.header("X-HRSD-Client-Id", id);
                requestTemplate.header("X-HRSD-Client-Secret", secret);
                requestTemplate.header("X-Validation-Report", validate);
            };
        }

    }
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
