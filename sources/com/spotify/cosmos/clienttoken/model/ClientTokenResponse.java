package com.spotify.cosmos.clienttoken.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.google.common.base.Optional;
import com.spotify.cosmos.clienttoken.model.AutoValue_ClientTokenResponse;
import com.spotify.cosmos.clienttoken.model.ClientToken;
import java.util.List;

@JsonDeserialize(builder = Builder.class)
public abstract class ClientTokenResponse {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return new AutoValue_ClientTokenResponse.Builder();
        }

        public abstract ClientTokenResponse build();

        @JsonProperty("clientDataHash")
        public abstract Builder setClientDataHash(String str);

        @JsonProperty("clientToken")
        public abstract Builder setClientToken(String str);

        @JsonProperty("domains")
        public abstract Builder setDomains(List<String> list);

        @JsonProperty("errorCode")
        public abstract Builder setErrorCode(Integer num);

        @JsonProperty("errorDescription")
        public abstract Builder setErrorDescription(String str);

        @JsonProperty("expiresAtTime")
        public abstract Builder setExpiresAtTime(Long l);

        @JsonProperty("refreshAtTime")
        public abstract Builder setRefreshAtTime(Long l);
    }

    @JsonProperty("clientDataHash")
    public abstract String clientDataHash();

    @JsonProperty("clientToken")
    public abstract String clientToken();

    @JsonProperty("domains")
    public abstract List<String> domains();

    @JsonProperty("errorCode")
    public abstract Integer errorCode();

    @JsonProperty("errorDescription")
    public abstract String errorDescription();

    @JsonProperty("expiresAtTime")
    public abstract Long expiresAtTime();

    public Optional<ClientToken> optionalClientToken() {
        if (errorCode() != null) {
            return Optional.absent();
        }
        return Optional.of(ClientToken.Builder.builder().setClientToken(clientToken()).setExpiresAtTime(expiresAtTime().longValue()).setRefreshAtTime(refreshAtTime().longValue()).setDomains(domains()).setClientDataHash(clientDataHash()).build());
    }

    @JsonProperty("refreshAtTime")
    public abstract Long refreshAtTime();

    public abstract Builder toBuilder();
}
