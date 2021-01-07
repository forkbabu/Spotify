package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

final class AutoValue_SavedStationModel extends SavedStationModel {
    private final String seedUri;

    AutoValue_SavedStationModel(String str) {
        if (str != null) {
            this.seedUri = str;
            return;
        }
        throw new NullPointerException("Null seedUri");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SavedStationModel) {
            return this.seedUri.equals(((SavedStationModel) obj).seedUri());
        }
        return false;
    }

    public int hashCode() {
        return this.seedUri.hashCode() ^ 1000003;
    }

    @Override // com.spotify.music.spotlets.radio.model.SavedStationModel
    @JsonProperty
    public String seedUri() {
        return this.seedUri;
    }

    public String toString() {
        return je.I0(je.V0("SavedStationModel{seedUri="), this.seedUri, "}");
    }
}
