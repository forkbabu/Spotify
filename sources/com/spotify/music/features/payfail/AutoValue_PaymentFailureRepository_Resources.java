package com.spotify.music.features.payfail;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.music.features.payfail.PaymentFailureRepository;
import java.util.List;

final class AutoValue_PaymentFailureRepository_Resources extends PaymentFailureRepository.Resources {
    private final List<PaymentFailureRepository.Resources.Resource> offlineAvailabilities;

    AutoValue_PaymentFailureRepository_Resources(List<PaymentFailureRepository.Resources.Resource> list) {
        if (list != null) {
            this.offlineAvailabilities = list;
            return;
        }
        throw new NullPointerException("Null offlineAvailabilities");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PaymentFailureRepository.Resources) {
            return this.offlineAvailabilities.equals(((PaymentFailureRepository.Resources) obj).offlineAvailabilities());
        }
        return false;
    }

    public int hashCode() {
        return this.offlineAvailabilities.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.payfail.PaymentFailureRepository.Resources
    @JsonProperty("resources")
    public List<PaymentFailureRepository.Resources.Resource> offlineAvailabilities() {
        return this.offlineAvailabilities;
    }

    public String toString() {
        return je.L0(je.V0("Resources{offlineAvailabilities="), this.offlineAvailabilities, "}");
    }
}
