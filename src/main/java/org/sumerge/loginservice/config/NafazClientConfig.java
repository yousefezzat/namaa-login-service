package org.sumerge.loginservice.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

public class NafazClientConfig {
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }

}
