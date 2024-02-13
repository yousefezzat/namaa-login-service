package org.sumerge.loginservice.model.nafaz.nafaz_request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NafazRequest {
    @JsonProperty("callbackURL")
    private String callbackURL;
}
