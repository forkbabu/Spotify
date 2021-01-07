package com.spotify.music.spotlets.optintrial;

import com.fasterxml.jackson.annotation.JsonProperty;

/* access modifiers changed from: package-private */
public final class AutoValue_StartTrialRequest extends StartTrialRequest {
    private final String country;
    private final String deviceId;
    private final String trial;

    AutoValue_StartTrialRequest(String str, String str2, String str3) {
        if (str != null) {
            this.trial = str;
            if (str2 != null) {
                this.deviceId = str2;
                if (str3 != null) {
                    this.country = str3;
                    return;
                }
                throw new NullPointerException("Null country");
            }
            throw new NullPointerException("Null deviceId");
        }
        throw new NullPointerException("Null trial");
    }

    @Override // com.spotify.music.spotlets.optintrial.StartTrialRequest
    @JsonProperty("country")
    public String country() {
        return this.country;
    }

    @Override // com.spotify.music.spotlets.optintrial.StartTrialRequest
    @JsonProperty("device_id")
    public String deviceId() {
        return this.deviceId;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof StartTrialRequest)) {
            return false;
        }
        StartTrialRequest startTrialRequest = (StartTrialRequest) obj;
        if (!this.trial.equals(startTrialRequest.trial()) || !this.deviceId.equals(startTrialRequest.deviceId()) || !this.country.equals(startTrialRequest.country())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((((this.trial.hashCode() ^ 1000003) * 1000003) ^ this.deviceId.hashCode()) * 1000003) ^ this.country.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("StartTrialRequest{trial=");
        V0.append(this.trial);
        V0.append(", deviceId=");
        V0.append(this.deviceId);
        V0.append(", country=");
        return je.I0(V0, this.country, "}");
    }

    @Override // com.spotify.music.spotlets.optintrial.StartTrialRequest
    @JsonProperty("trial")
    public String trial() {
        return this.trial;
    }
}
