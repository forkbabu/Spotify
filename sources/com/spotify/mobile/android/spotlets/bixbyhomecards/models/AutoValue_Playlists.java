package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.Playlists;
import java.util.List;

final class AutoValue_Playlists extends Playlists {
    private final List<PlaylistItem> items;

    /* access modifiers changed from: package-private */
    public static final class Builder extends Playlists.Builder {
        private List<PlaylistItem> items;

        Builder() {
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Playlists.Builder
        public Playlists build() {
            return new AutoValue_Playlists(this.items);
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Playlists.Builder
        public Playlists.Builder items(List<PlaylistItem> list) {
            this.items = list;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Playlists)) {
            return false;
        }
        List<PlaylistItem> list = this.items;
        List<PlaylistItem> items2 = ((Playlists) obj).items();
        if (list != null) {
            return list.equals(items2);
        }
        if (items2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        List<PlaylistItem> list = this.items;
        return (list == null ? 0 : list.hashCode()) ^ 1000003;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.Playlists
    @JsonProperty("items")
    public List<PlaylistItem> items() {
        return this.items;
    }

    public String toString() {
        return je.L0(je.V0("Playlists{items="), this.items, "}");
    }

    private AutoValue_Playlists(List<PlaylistItem> list) {
        this.items = list;
    }
}
