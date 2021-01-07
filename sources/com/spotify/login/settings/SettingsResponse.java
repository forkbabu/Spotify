package com.spotify.login.settings;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class SettingsResponse implements JacksonModel {
    private boolean offlineMode;

    public SettingsResponse(@JsonProperty("offline_mode") boolean z) {
        this.offlineMode = z;
    }

    public static /* synthetic */ SettingsResponse copy$default(SettingsResponse settingsResponse, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = settingsResponse.offlineMode;
        }
        return settingsResponse.copy(z);
    }

    public final boolean component1() {
        return this.offlineMode;
    }

    public final SettingsResponse copy(@JsonProperty("offline_mode") boolean z) {
        return new SettingsResponse(z);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof SettingsResponse) && this.offlineMode == ((SettingsResponse) obj).offlineMode;
        }
        return true;
    }

    public final boolean getOfflineMode() {
        return this.offlineMode;
    }

    public int hashCode() {
        boolean z = this.offlineMode;
        if (z) {
            return 1;
        }
        return z ? 1 : 0;
    }

    public final void setOfflineMode(boolean z) {
        this.offlineMode = z;
    }

    public String toString() {
        return je.P0(je.V0("SettingsResponse(offlineMode="), this.offlineMode, ")");
    }
}
