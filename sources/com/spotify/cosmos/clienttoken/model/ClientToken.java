package com.spotify.cosmos.clienttoken.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.clienttoken.model.AutoValue_ClientToken;
import java.util.List;

public abstract class ClientToken {

    public static abstract class Builder {
        @JsonCreator
        public static Builder builder() {
            return new AutoValue_ClientToken.Builder();
        }

        public abstract ClientToken build();

        @JsonProperty("clientDataHash")
        public abstract Builder setClientDataHash(String str);

        @JsonProperty("clientToken")
        public abstract Builder setClientToken(String str);

        @JsonProperty("domains")
        public abstract Builder setDomains(List<String> list);

        @JsonProperty("expiresAtTime")
        public abstract Builder setExpiresAtTime(long j);

        @JsonProperty("refreshAtTime")
        public abstract Builder setRefreshAtTime(long j);
    }

    @JsonProperty("clientDataHash")
    public abstract String clientDataHash();

    @JsonProperty("clientToken")
    public abstract String clientToken();

    @JsonProperty("domains")
    public abstract List<String> domains();

    @JsonProperty("expiresAtTime")
    public abstract long expiresAtTime();

    @JsonProperty("refreshAtTime")
    public abstract long refreshAtTime();

    public abstract Builder toBuilder();
}
