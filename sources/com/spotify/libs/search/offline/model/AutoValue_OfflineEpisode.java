package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineEpisode extends OfflineEpisode {
    private static final long serialVersionUID = 6573089720037526087L;
    private final Optional<String> imageUri;
    private final boolean isExplicit;
    private final String name;
    private final String uri;

    AutoValue_OfflineEpisode(String str, String str2, Optional<String> optional, boolean z) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (optional != null) {
                    this.imageUri = optional;
                    this.isExplicit = z;
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
        if (!(obj instanceof OfflineEpisode)) {
            return false;
        }
        OfflineEpisode offlineEpisode = (OfflineEpisode) obj;
        if (!this.uri.equals(offlineEpisode.uri()) || !this.name.equals(offlineEpisode.name()) || !this.imageUri.equals(offlineEpisode.imageUri()) || this.isExplicit != offlineEpisode.isExplicit()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.imageUri.hashCode()) * 1000003) ^ (this.isExplicit ? 1231 : 1237);
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEpisode, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("image")
    public Optional<String> imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEpisode
    @JsonProperty("explicit")
    public boolean isExplicit() {
        return this.isExplicit;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEpisode, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("name")
    public String name() {
        return this.name;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OfflineEpisode{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", imageUri=");
        V0.append(this.imageUri);
        V0.append(", isExplicit=");
        return je.P0(V0, this.isExplicit, "}");
    }

    @Override // com.spotify.libs.search.offline.model.OfflineEpisode, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("uri")
    public String uri() {
        return this.uri;
    }
}
