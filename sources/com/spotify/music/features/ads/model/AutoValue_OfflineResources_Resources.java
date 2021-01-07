package com.spotify.music.features.ads.model;

import com.spotify.music.features.ads.model.OfflineResources;

final class AutoValue_OfflineResources_Resources extends OfflineResources.Resources {
    private final String offlineAvailability;
    private final String uri;

    AutoValue_OfflineResources_Resources(String str, String str2) {
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
        if (!(obj instanceof OfflineResources.Resources)) {
            return false;
        }
        OfflineResources.Resources resources = (OfflineResources.Resources) obj;
        if (!this.uri.equals(resources.uri()) || !this.offlineAvailability.equals(resources.offlineAvailability())) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.offlineAvailability.hashCode();
    }

    @Override // com.spotify.music.features.ads.model.OfflineResources.Resources
    public String offlineAvailability() {
        return this.offlineAvailability;
    }

    public String toString() {
        StringBuilder V0 = je.V0("Resources{uri=");
        V0.append(this.uri);
        V0.append(", offlineAvailability=");
        return je.I0(V0, this.offlineAvailability, "}");
    }

    @Override // com.spotify.music.features.ads.model.OfflineResources.Resources
    public String uri() {
        return this.uri;
    }
}
