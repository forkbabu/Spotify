package com.spotify.signup.api.services.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.collect.ImmutableMap;
import com.spotify.dataenum.dataenum_case;
import com.spotify.signup.api.services.SignupErrorStatus;
import java.util.Map;

@JsonIgnoreProperties(ignoreUnknown = true)
public class IdentifierTokenSignupResponse {
    @d20("errors")
    @JsonProperty("errors")
    private Map<String, String> mErrors;
    @d20("login_token")
    @JsonProperty("login_token")
    private String mOneTimeToken;
    @d20("status")
    @JsonProperty("status")
    private int mStatus;
    @d20("username")
    @JsonProperty("username")
    private String mUserName;

    interface IdentifierTokenSignupStatus_dataenum {
        dataenum_case Error(SignupErrorStatus signupErrorStatus, Map<String, String> map);

        dataenum_case Ok(String str, String str2);

        dataenum_case Unknown();
    }

    public IdentifierTokenSignupStatus status() {
        int i = this.mStatus;
        if (i == 1) {
            return IdentifierTokenSignupStatus.ok(this.mUserName, this.mOneTimeToken);
        }
        SignupErrorStatus d = SignupErrorStatus.d(i);
        if (d == SignupErrorStatus.STATUS_UNKNOWN_ERROR) {
            return IdentifierTokenSignupStatus.unknown();
        }
        Map map = this.mErrors;
        if (map == null) {
            map = ImmutableMap.of();
        }
        return IdentifierTokenSignupStatus.error(d, map);
    }
}
