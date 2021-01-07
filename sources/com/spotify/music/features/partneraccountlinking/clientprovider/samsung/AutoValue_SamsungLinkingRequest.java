package com.spotify.music.features.partneraccountlinking.clientprovider.samsung;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_SamsungLinkingRequest extends SamsungLinkingRequest {
    private final String accessToken;
    private final String apiServerUrl;
    private final String authCode;
    private final String authServerUrl;

    AutoValue_SamsungLinkingRequest(String str, String str2, String str3, String str4) {
        this.accessToken = str;
        this.authCode = str2;
        if (str3 != null) {
            this.authServerUrl = str3;
            if (str4 != null) {
                this.apiServerUrl = str4;
                return;
            }
            throw new NullPointerException("Null apiServerUrl");
        }
        throw new NullPointerException("Null authServerUrl");
    }

    @Override // com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest
    @JsonProperty("access_token")
    public String accessToken() {
        return this.accessToken;
    }

    @Override // com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest
    @JsonProperty("api_server_url")
    public String apiServerUrl() {
        return this.apiServerUrl;
    }

    @Override // com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest
    @JsonProperty("auth_code")
    public String authCode() {
        return this.authCode;
    }

    @Override // com.spotify.music.features.partneraccountlinking.clientprovider.samsung.SamsungLinkingRequest
    @JsonProperty("auth_server_url")
    public String authServerUrl() {
        return this.authServerUrl;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof SamsungLinkingRequest)) {
            return false;
        }
        SamsungLinkingRequest samsungLinkingRequest = (SamsungLinkingRequest) obj;
        String str = this.accessToken;
        if (str != null ? str.equals(samsungLinkingRequest.accessToken()) : samsungLinkingRequest.accessToken() == null) {
            String str2 = this.authCode;
            if (str2 != null ? str2.equals(samsungLinkingRequest.authCode()) : samsungLinkingRequest.authCode() == null) {
                if (this.authServerUrl.equals(samsungLinkingRequest.authServerUrl()) && this.apiServerUrl.equals(samsungLinkingRequest.apiServerUrl())) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.accessToken;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.authCode;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.authServerUrl.hashCode()) * 1000003) ^ this.apiServerUrl.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("SamsungLinkingRequest{accessToken=");
        V0.append(this.accessToken);
        V0.append(", authCode=");
        V0.append(this.authCode);
        V0.append(", authServerUrl=");
        V0.append(this.authServerUrl);
        V0.append(", apiServerUrl=");
        return je.I0(V0, this.apiServerUrl, "}");
    }
}
