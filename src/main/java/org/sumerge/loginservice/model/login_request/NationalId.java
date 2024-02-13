package org.sumerge.loginservice.model.login_request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NationalId {
    @JsonProperty("national_id")

    private String nationalId;
}
