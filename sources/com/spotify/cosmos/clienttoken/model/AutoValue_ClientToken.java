package com.spotify.cosmos.clienttoken.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.cosmos.clienttoken.model.ClientToken;
import java.util.List;

final class AutoValue_ClientToken extends ClientToken {
    private final String clientDataHash;
    private final String clientToken;
    private final List<String> domains;
    private final long expiresAtTime;
    private final long refreshAtTime;

    /* access modifiers changed from: package-private */
    public static final class Builder extends ClientToken.Builder {
        private String clientDataHash;
        private String clientToken;
        private List<String> domains;
        private Long expiresAtTime;
        private Long refreshAtTime;

        @Override // com.spotify.cosmos.clienttoken.model.ClientToken.Builder
        public ClientToken build() {
            String str = this.clientToken == null ? " clientToken" : "";
            if (this.expiresAtTime == null) {
                str = je.x0(str, " expiresAtTime");
            }
            if (this.refreshAtTime == null) {
                str = je.x0(str, " refreshAtTime");
            }
            if (this.clientDataHash == null) {
                str = je.x0(str, " clientDataHash");
            }
            if (this.domains == null) {
                str = je.x0(str, " domains");
            }
            if (str.isEmpty()) {
                return new AutoValue_ClientToken(this.clientToken, this.expiresAtTime.longValue(), this.refreshAtTime.longValue(), this.clientDataHash, this.domains);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientToken.Builder
        public ClientToken.Builder setClientDataHash(String str) {
            if (str != null) {
                this.clientDataHash = str;
                return this;
            }
            throw new NullPointerException("Null clientDataHash");
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientToken.Builder
        public ClientToken.Builder setClientToken(String str) {
            if (str != null) {
                this.clientToken = str;
                return this;
            }
            throw new NullPointerException("Null clientToken");
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientToken.Builder
        public ClientToken.Builder setDomains(List<String> list) {
            if (list != null) {
                this.domains = list;
                return this;
            }
            throw new NullPointerException("Null domains");
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientToken.Builder
        public ClientToken.Builder setExpiresAtTime(long j) {
            this.expiresAtTime = Long.valueOf(j);
            return this;
        }

        @Override // com.spotify.cosmos.clienttoken.model.ClientToken.Builder
        public ClientToken.Builder setRefreshAtTime(long j) {
            this.refreshAtTime = Long.valueOf(j);
            return this;
        }

        Builder() {
        }

        private Builder(ClientToken clientToken2) {
            this.clientToken = clientToken2.clientToken();
            this.expiresAtTime = Long.valueOf(clientToken2.expiresAtTime());
            this.refreshAtTime = Long.valueOf(clientToken2.refreshAtTime());
            this.clientDataHash = clientToken2.clientDataHash();
            this.domains = clientToken2.domains();
        }
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientToken
    @JsonProperty("clientDataHash")
    public String clientDataHash() {
        return this.clientDataHash;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientToken
    @JsonProperty("clientToken")
    public String clientToken() {
        return this.clientToken;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientToken
    @JsonProperty("domains")
    public List<String> domains() {
        return this.domains;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientToken)) {
            return false;
        }
        ClientToken clientToken2 = (ClientToken) obj;
        if (!this.clientToken.equals(clientToken2.clientToken()) || this.expiresAtTime != clientToken2.expiresAtTime() || this.refreshAtTime != clientToken2.refreshAtTime() || !this.clientDataHash.equals(clientToken2.clientDataHash()) || !this.domains.equals(clientToken2.domains())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientToken
    @JsonProperty("expiresAtTime")
    public long expiresAtTime() {
        return this.expiresAtTime;
    }

    public int hashCode() {
        long j = this.expiresAtTime;
        long j2 = this.refreshAtTime;
        return ((((((((this.clientToken.hashCode() ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.clientDataHash.hashCode()) * 1000003) ^ this.domains.hashCode();
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientToken
    @JsonProperty("refreshAtTime")
    public long refreshAtTime() {
        return this.refreshAtTime;
    }

    @Override // com.spotify.cosmos.clienttoken.model.ClientToken
    public ClientToken.Builder toBuilder() {
        return new Builder(this);
    }

    public String toString() {
        StringBuilder V0 = je.V0("ClientToken{clientToken=");
        V0.append(this.clientToken);
        V0.append(", expiresAtTime=");
        V0.append(this.expiresAtTime);
        V0.append(", refreshAtTime=");
        V0.append(this.refreshAtTime);
        V0.append(", clientDataHash=");
        V0.append(this.clientDataHash);
        V0.append(", domains=");
        return je.L0(V0, this.domains, "}");
    }

    private AutoValue_ClientToken(String str, long j, long j2, String str2, List<String> list) {
        this.clientToken = str;
        this.expiresAtTime = j;
        this.refreshAtTime = j2;
        this.clientDataHash = str2;
        this.domains = list;
    }
}
