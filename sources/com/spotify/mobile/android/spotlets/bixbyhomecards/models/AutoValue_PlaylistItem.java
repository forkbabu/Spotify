package com.spotify.mobile.android.spotlets.bixbyhomecards.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem;
import java.util.List;

final class AutoValue_PlaylistItem extends PlaylistItem {
    private final List<Image> images;
    private final String name;
    private final Owner owner;
    private final String uri;

    /* access modifiers changed from: package-private */
    public static final class Builder extends PlaylistItem.Builder {
        private List<Image> images;
        private String name;
        private Owner owner;
        private String uri;

        Builder() {
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem.Builder
        public PlaylistItem build() {
            String str = this.uri == null ? " uri" : "";
            if (this.name == null) {
                str = je.x0(str, " name");
            }
            if (this.owner == null) {
                str = je.x0(str, " owner");
            }
            if (str.isEmpty()) {
                return new AutoValue_PlaylistItem(this.uri, this.name, this.owner, this.images);
            }
            throw new IllegalStateException(je.x0("Missing required properties:", str));
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem.Builder
        public PlaylistItem.Builder images(List<Image> list) {
            this.images = list;
            return this;
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem.Builder
        public PlaylistItem.Builder name(String str) {
            if (str != null) {
                this.name = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem.Builder
        public PlaylistItem.Builder owner(Owner owner2) {
            if (owner2 != null) {
                this.owner = owner2;
                return this;
            }
            throw new NullPointerException("Null owner");
        }

        @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem.Builder
        public PlaylistItem.Builder uri(String str) {
            if (str != null) {
                this.uri = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlaylistItem)) {
            return false;
        }
        PlaylistItem playlistItem = (PlaylistItem) obj;
        if (this.uri.equals(playlistItem.uri()) && this.name.equals(playlistItem.name()) && this.owner.equals(playlistItem.owner())) {
            List<Image> list = this.images;
            if (list == null) {
                if (playlistItem.images() == null) {
                    return true;
                }
            } else if (list.equals(playlistItem.images())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.owner.hashCode()) * 1000003;
        List<Image> list = this.images;
        return hashCode ^ (list == null ? 0 : list.hashCode());
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem
    @JsonProperty("images")
    public List<Image> images() {
        return this.images;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem
    @JsonProperty("name")
    public String name() {
        return this.name;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem
    @JsonProperty("owner")
    public Owner owner() {
        return this.owner;
    }

    @Override // com.spotify.mobile.android.spotlets.bixbyhomecards.models.PlaylistItem
    @JsonProperty("uri")
    public String uri() {
        return this.uri;
    }

    private AutoValue_PlaylistItem(String str, String str2, Owner owner2, List<Image> list) {
        this.uri = str;
        this.name = str2;
        this.owner = owner2;
        this.images = list;
    }
}
