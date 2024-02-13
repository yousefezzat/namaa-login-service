package org.sumerge.loginservice.model.callback;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class CallbackRequest {
    @JsonProperty("JWTtoken")
    private String JWTtoken;

    @JsonProperty("referenceId")
    private String referenceId;
}
