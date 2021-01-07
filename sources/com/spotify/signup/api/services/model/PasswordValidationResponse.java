package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.dataenum.dataenum_case;
import java.util.HashMap;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PasswordValidationResponse {
    @d20("errors")
    @JsonProperty("errors")
    private Map<String, String> mErrors;
    @d20("status")
    @JsonProperty("status")
    private int mStatus;

    interface PasswordValidation_dataenum {
        dataenum_case Error(int i, Map<String, String> map);

        dataenum_case Ok();
    }

    public PasswordValidation status() {
        int i = this.mStatus;
        if (i == 1) {
            return PasswordValidation.ok();
        }
        Map map = this.mErrors;
        if (map == null) {
            map = new HashMap();
        }
        return PasswordValidation.error(i, map);
    }
}
