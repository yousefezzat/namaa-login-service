package org.sumerge.loginservice.model.nafaz.nafaz_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result {
    @JsonProperty("transactionId")
    private String transactionId;

    @JsonProperty("random")
    private String random;

    @JsonProperty("referenceId")
    private String referenceId;
}