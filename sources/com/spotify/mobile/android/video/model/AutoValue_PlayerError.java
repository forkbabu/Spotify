package com.spotify.mobile.android.video.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/* access modifiers changed from: package-private */
public final class AutoValue_PlayerError extends PlayerError {
    private final Map<String, String> data;
    private final String type;

    AutoValue_PlayerError(String str, Map<String, String> map) {
        if (str != null) {
            this.type = str;
            if (map != null) {
                this.data = map;
                return;
            }
            throw new NullPointerException("Null data");
        }
        throw new NullPointerException("Null type");
    }

    @Override // com.spotify.mobile.android.video.model.PlayerError
    @JsonProperty("data")
    public Map<String, String> data() {
        return this.data;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerError)) {
            return false;
        }
        PlayerError playerError = (PlayerError) obj;
        if (!this.type.equals(playerError.type()) || !this.data.equals(playerError.data())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.type.hashCode() ^ 1000003) * 1000003) ^ this.data.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("PlayerError{type=");
        V0.append(this.type);
        V0.append(", data=");
        return je.M0(V0, this.data, "}");
    }

    @Override // com.spotify.mobile.android.video.model.PlayerError
    @JsonProperty("type")
    public String type() {
        return this.type;
    }
}
