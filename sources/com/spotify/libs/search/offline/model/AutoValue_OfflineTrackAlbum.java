package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineTrackAlbum extends OfflineTrackAlbum {
    private static final long serialVersionUID = 1879427616445452548L;
    private final Optional<String> imageUri;
    private final String name;
    private final String uri;

    AutoValue_OfflineTrackAlbum(String str, String str2, Optional<String> optional) {
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
        if (!(obj instanceof OfflineTrackAlbum)) {
            return false;
        }
        OfflineTrackAlbum offlineTrackAlbum = (OfflineTrackAlbum) obj;
        if (!this.uri.equals(offlineTrackAlbum.uri()) || !this.name.equals(offlineTrackAlbum.name()) || !this.imageUri.equals(offlineTrackAlbum.imageUri())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.imageUri.hashCode();
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrackAlbum, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("image")
    public Optional<String> imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrackAlbum, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("name")
    public String name() {
        return this.name;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OfflineTrackAlbum{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", imageUri=");
        return je.F0(V0, this.imageUri, "}");
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrackAlbum, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("uri")
    public String uri() {
        return this.uri;
    }
}
