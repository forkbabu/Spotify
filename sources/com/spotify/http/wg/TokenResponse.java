package com.spotify.http.wg;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TokenResponse implements JacksonModel {
    public final String accessToken;
    public final int errorCode;
    public final String errorDescription;
    public final int expiresIn;
    public final String refreshToken;
    public final List<String> scope;
    public final String tokenType;

    @JsonCreator
    public TokenResponse(@JsonProperty("refreshToken") String str, @JsonProperty("accessToken") String str2, @JsonProperty("expiresIn") int i, @JsonProperty("tokenType") String str3, @JsonProperty("scope") List<String> list, @JsonProperty("errorCode") int i2, @JsonProperty("errorDescription") String str4) {
        this.refreshToken = str;
        this.accessToken = str2;
        this.expiresIn = i;
        this.tokenType = str3;
        this.scope = list;
        this.errorCode = i2;
        this.errorDescription = str4;
    }
}
