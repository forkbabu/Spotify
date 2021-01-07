package com.spotify.cosmos.clienttoken.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.clienttoken.model.ClientTokenResponse;
import java.util.List;

final class AutoValue_ClientTokenResponse extends ClientTokenResponse {
    private final String clientDataHash;
    private final String clientToken;
    private final List<String> domains;
    private final Integer errorCode;
    private final String errorDescription;
    private final Long expiresAtTime;
    private final Long refreshAtTime;

    static final class Builder extends ClientTokenResponse.Builder {
        private String clientDataHash;
        private String clientToken;
        private List<String> domains;
        private Integer errorCode;
        private String errorDescription;
        private Long expiresAtTime;
        private Long refreshAtTime;

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse build() {
            return new AutoValue_ClientTokenResponse(this.clientToken, this.expiresAtTime, this.refreshAtTime, this.clientDataHash, this.domains, this.errorCode, this.errorDescription);
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse.Builder setClientDataHash(String str) {
            this.clientDataHash = str;
            return this;
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse.Builder setClientToken(String str) {
            this.clientToken = str;
            return this;
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse.Builder setDomains(List<String> list) {
            this.domains = list;
            return this;
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse.Builder setErrorCode(Integer num) {
            this.errorCode = num;
            return this;
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse.Builder setErrorDescription(String str) {
            this.errorDescription = str;
            return this;
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse.Builder setExpiresAtTime(Long l) {
            this.expiresAtTime = l;
            return this;
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse.Builder
        public ClientTokenResponse.Builder setRefreshAtTime(Long l) {
            this.refreshAtTime = l;
            return this;
        }

        Builder() {
        }

        private Builder(ClientTokenResponse clientTokenResponse) {
            this.clientToken = clientTokenResponse.clientToken();
            this.expiresAtTime = clientTokenResponse.expiresAtTime();
            this.refreshAtTime = clientTokenResponse.refreshAtTime();
            this.clientDataHash = clientTokenResponse.clientDataHash();
            this.domains = clientTokenResponse.domains();
            this.errorCode = clientTokenResponse.errorCode();
            this.errorDescription = clientTokenResponse.errorDescription();
        }
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    @JsonProperty("clientDataHash")
    public String clientDataHash() {
        return this.clientDataHash;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    @JsonProperty("clientToken")
    public String clientToken() {
        return this.clientToken;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    @JsonProperty("domains")
    public List<String> domains() {
        return this.domains;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientTokenResponse)) {
            return false;
        }
        ClientTokenResponse clientTokenResponse = (ClientTokenResponse) obj;
        String str = this.clientToken;
        if (str != null ? str.equals(clientTokenResponse.clientToken()) : clientTokenResponse.clientToken() == null) {
            Long l = this.expiresAtTime;
            if (l != null ? l.equals(clientTokenResponse.expiresAtTime()) : clientTokenResponse.expiresAtTime() == null) {
                Long l2 = this.refreshAtTime;
                if (l2 != null ? l2.equals(clientTokenResponse.refreshAtTime()) : clientTokenResponse.refreshAtTime() == null) {
                    String str2 = this.clientDataHash;
                    if (str2 != null ? str2.equals(clientTokenResponse.clientDataHash()) : clientTokenResponse.clientDataHash() == null) {
                        List<String> list = this.domains;
                        if (list != null ? list.equals(clientTokenResponse.domains()) : clientTokenResponse.domains() == null) {
                            Integer num = this.errorCode;
                            if (num != null ? num.equals(clientTokenResponse.errorCode()) : clientTokenResponse.errorCode() == null) {
                                String str3 = this.errorDescription;
                                if (str3 == null) {
                                    if (clientTokenResponse.errorDescription() == null) {
                                        return true;
                                    }
                                } else if (str3.equals(clientTokenResponse.errorDescription())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    @JsonProperty("errorCode")
    public Integer errorCode() {
        return this.errorCode;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    @JsonProperty("errorDescription")
    public String errorDescription() {
        return this.errorDescription;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    @JsonProperty("expiresAtTime")
    public Long expiresAtTime() {
        return this.expiresAtTime;
    }

    public int hashCode() {
        String str = this.clientToken;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        Long l = this.expiresAtTime;
        int hashCode2 = (hashCode ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Long l2 = this.refreshAtTime;
        int hashCode3 = (hashCode2 ^ (l2 == null ? 0 : l2.hashCode())) * 1000003;
        String str2 = this.clientDataHash;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        List<String> list = this.domains;
        int hashCode5 = (hashCode4 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        Integer num = this.errorCode;
        int hashCode6 = (hashCode5 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str3 = this.errorDescription;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode6 ^ i;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    @JsonProperty("refreshAtTime")
    public Long refreshAtTime() {
        return this.refreshAtTime;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientTokenResponse
    public ClientTokenResponse.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ClientTokenResponse{clientToken=");
        V0.append(this.clientToken);
        V0.append(", expiresAtTime=");
        V0.append(this.expiresAtTime);
        V0.append(", refreshAtTime=");
        V0.append(this.refreshAtTime);
        V0.append(", clientDataHash=");
        V0.append(this.clientDataHash);
        V0.append(", domains=");
        V0.append(this.domains);
        V0.append(", errorCode=");
        V0.append(this.errorCode);
        V0.append(", errorDescription=");
        return je.I0(V0, this.errorDescription, "}");
    }

    private AutoValue_ClientTokenResponse(String str, Long l, Long l2, String str2, List<String> list, Integer num, String str3) {
        this.clientToken = str;
        this.expiresAtTime = l;
        this.refreshAtTime = l2;
        this.clientDataHash = str2;
        this.domains = list;
        this.errorCode = num;
        this.errorDescription = str3;
    }
}
