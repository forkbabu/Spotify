package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.dataenum.dataenum_case;
import com.spotify.signup.api.services.SignupErrorStatus;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EmailSignupResponse {
    @d20("errors")
    @JsonProperty("errors")
    private Map<String, String> mErrors;
    @d20("status")
    @JsonProperty("status")
    private int mStatus;
    @d20("username")
    @JsonProperty("username")
    private String mUserName;

    interface EmailSignupStatus_dataenum {
        dataenum_case Error(SignupErrorStatus signupErrorStatus, Map<String, String> map);

        dataenum_case Ok(String str);

        dataenum_case Unknown();
    }

    public EmailSignupStatus status() {
        int i = this.mStatus;
        if (i == 1) {
            return EmailSignupStatus.ok(this.mUserName);
        }
        SignupErrorStatus d = SignupErrorStatus.d(i);
        if (d == SignupErrorStatus.STATUS_UNKNOWN_ERROR) {
            return EmailSignupStatus.unknown();
        }
        Map map = this.mErrors;
        if (map == null) {
            map = ImmutableMap.of();
        }
        return EmailSignupStatus.error(d, map);
    }
}
