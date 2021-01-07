package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class SamsungLinkingRequest implements JacksonModel {
    @JsonCreator
    public static SamsungLinkingRequest create(@JsonProperty("access_token") String str, @JsonProperty("auth_code") String str2, @JsonProperty("auth_server_url") String str3, @JsonProperty("api_server_url") String str4) {
        return new AutoValue_SamsungLinkingRequest(str, str2, str3, str4);
    }

    @JsonProperty("access_token")
    public abstract String accessToken();

    @JsonProperty("api_server_url")
    public abstract String apiServerUrl();

    @JsonProperty("auth_code")
    public abstract String authCode();

    @JsonProperty("auth_server_url")
    public abstract String authServerUrl();
}
