package com.spotify.music.features.ads.model;

import com.spotify.music.features.ads.model.OfflineResources;

final class AutoValue_OfflineResources extends OfflineResources {
    private final OfflineResources.Resources resources;

    AutoValue_OfflineResources(OfflineResources.Resources resources2) {
        if (resources2 != null) {
            this.resources = resources2;
            return;
        }
        throw new NullPointerException("Null resources");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof OfflineResources) {
            return this.resources.equals(((OfflineResources) obj).resources());
        }
        return false;
    }

    public int hashCode() {
        return this.resources.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.features.ads.model.OfflineResources
    public OfflineResources.Resources resources() {
        return this.resources;
    }

    public String toString() {
        StringBuilder V0 = je.V0("OfflineResources{resources=");
        V0.append(this.resources);
        V0.append("}");
        return V0.toString();
    }
}
