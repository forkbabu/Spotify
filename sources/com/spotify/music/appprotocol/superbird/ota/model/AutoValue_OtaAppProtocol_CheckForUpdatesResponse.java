package com.spotify.music.appprotocol.superbird.ota.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_OtaAppProtocol_CheckForUpdatesResponse extends OtaAppProtocol$CheckForUpdatesResponse {
    private final List<OtaAppProtocol$CheckForUpdatesResponseItem> result;

    AutoValue_OtaAppProtocol_CheckForUpdatesResponse(List<OtaAppProtocol$CheckForUpdatesResponseItem> list) {
        if (list != null) {
            this.result = list;
            return;
        }
        throw new NullPointerException("Null result");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OtaAppProtocol$CheckForUpdatesResponse) {
            return this.result.equals(((OtaAppProtocol$CheckForUpdatesResponse) obj).result());
        }
        return false;
    }

    public int hashCode() {
        return this.result.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.appprotocol.superbird.ota.model.OtaAppProtocol$CheckForUpdatesResponse
    @JsonProperty("result")
    public List<OtaAppProtocol$CheckForUpdatesResponseItem> result() {
        return this.result;
    }

    public String toString() {
        return je.L0(je.V0("CheckForUpdatesResponse{result="), this.result, "}");
    }
}
