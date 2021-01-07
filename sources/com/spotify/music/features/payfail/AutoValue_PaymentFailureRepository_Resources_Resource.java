package com.spotify.music.features.payfail;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.payfail.PaymentFailureRepository;

final class AutoValue_PaymentFailureRepository_Resources_Resource extends PaymentFailureRepository.Resources.Resource {
    private final String offlineAvailability;
    private final String uri;

    AutoValue_PaymentFailureRepository_Resources_Resource(String str, String str2) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.offlineAvailability = str2;
                return;
            }
            throw new NullPointerException("Null offlineAvailability");
        }
        throw new NullPointerException("Null uri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PaymentFailureRepository.Resources.Resource)) {
            return false;
        }
        PaymentFailureRepository.Resources.Resource resource = (PaymentFailureRepository.Resources.Resource) obj;
        if (!this.uri.equals(resource.uri()) || !this.offlineAvailability.equals(resource.offlineAvailability())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.offlineAvailability.hashCode();
    }

    @Override // com.spotify.music.features.payfail.PaymentFailureRepository.Resources.Resource
    @JsonProperty("offline_availability")
    public String offlineAvailability() {
        return this.offlineAvailability;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Resource{uri=");
        V0.append(this.uri);
        V0.append(", offlineAvailability=");
        return je.I0(V0, this.offlineAvailability, "}");
    }

    @Override // com.spotify.music.features.payfail.PaymentFailureRepository.Resources.Resource
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }
}
