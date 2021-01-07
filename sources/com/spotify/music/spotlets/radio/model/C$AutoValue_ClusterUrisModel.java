package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.spotlets.radio.model.$AutoValue_ClusterUrisModel  reason: invalid class name */
abstract class C$AutoValue_ClusterUrisModel extends ClusterUrisModel {
    private final List<String> clusterUris;

    C$AutoValue_ClusterUrisModel(List<String> list) {
        if (list != null) {
            this.clusterUris = list;
            return;
        }
        throw new NullPointerException("Null clusterUris");
    }

    @Override // com.spotify.music.spotlets.radio.model.ClusterUrisModel
    @JsonProperty
    public List<String> clusterUris() {
        return this.clusterUris;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ClusterUrisModel) {
            return this.clusterUris.equals(((ClusterUrisModel) obj).clusterUris());
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return this.clusterUris.hashCode() ^ 1000003;
    }

    @Override // java.lang.Object
    public String toString() {
        return je.L0(je.V0("ClusterUrisModel{clusterUris="), this.clusterUris, "}");
    }
}
