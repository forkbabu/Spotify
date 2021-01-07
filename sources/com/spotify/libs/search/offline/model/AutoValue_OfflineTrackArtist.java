package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineTrackArtist extends OfflineTrackArtist {
    private static final long serialVersionUID = 4807632244952093030L;
    private final Optional<String> imageUri;
    private final String name;
    private final String uri;

    AutoValue_OfflineTrackArtist(String str, String str2, Optional<String> optional) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (optional != null) {
                    this.imageUri = optional;
                    return;
                }
                throw new NullPointerException("Null imageUri");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineTrackArtist)) {
            return false;
        }
        OfflineTrackArtist offlineTrackArtist = (OfflineTrackArtist) obj;
        if (!this.uri.equals(offlineTrackArtist.uri()) || !this.name.equals(offlineTrackArtist.name()) || !this.imageUri.equals(offlineTrackArtist.imageUri())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.imageUri.hashCode();
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrackArtist, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("image")
    public Optional<String> imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrackArtist, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("name")
    public String name() {
        return this.name;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OfflineTrackArtist{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", imageUri=");
        return je.F0(V0, this.imageUri, "}");
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrackArtist, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("uri")
    public String uri() {
        return this.uri;
    }
}
