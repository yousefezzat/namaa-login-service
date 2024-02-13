package org.sumerge.loginservice.model.nafaz.nafaz_response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Status {
    @JsonProperty("code")
    private String code;

    @JsonProperty("description")
    private String description;
}

