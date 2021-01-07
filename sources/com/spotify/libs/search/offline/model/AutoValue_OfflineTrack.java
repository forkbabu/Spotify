package com.spotify.libs.search.offline.model;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.common.base.Optional;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_OfflineTrack extends OfflineTrack {
    private static final long serialVersionUID = 6471750226925609451L;
    private final Optional<OfflineTrackAlbum> album;
    private final String artistNames;
    private final List<OfflineTrackArtist> artists;
    private final Optional<String> imageUri;
    private final boolean isExplicit;
    private final boolean isMogef19;
    private final String name;
    private final String uri;

    AutoValue_OfflineTrack(String str, String str2, Optional<String> optional, List<OfflineTrackArtist> list, String str3, Optional<OfflineTrackAlbum> optional2, boolean z, boolean z2) {
        if (str != null) {
            this.uri = str;
            if (str2 != null) {
                this.name = str2;
                if (optional != null) {
                    this.imageUri = optional;
                    if (list != null) {
                        this.artists = list;
                        if (str3 != null) {
                            this.artistNames = str3;
                            if (optional2 != null) {
                                this.album = optional2;
                                this.isExplicit = z;
                                this.isMogef19 = z2;
                                return;
                            }
                            throw new NullPointerException("Null album");
                        }
                        throw new NullPointerException("Null artistNames");
                    }
                    throw new NullPointerException("Null artists");
                }
                throw new NullPointerException("Null imageUri");
            }
            throw new NullPointerException("Null name");
        }
        throw new NullPointerException("Null uri");
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack
    @JsonProperty("album")
    public Optional<OfflineTrackAlbum> album() {
        return this.album;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack
    @JsonIgnoreProperties
    public String artistNames() {
        return this.artistNames;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack
    @JsonGetter("artists")
    public List<OfflineTrackArtist> artists() {
        return this.artists;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof OfflineTrack)) {
            return false;
        }
        OfflineTrack offlineTrack = (OfflineTrack) obj;
        if (!this.uri.equals(offlineTrack.uri()) || !this.name.equals(offlineTrack.name()) || !this.imageUri.equals(offlineTrack.imageUri()) || !this.artists.equals(offlineTrack.artists()) || !this.artistNames.equals(offlineTrack.artistNames()) || !this.album.equals(offlineTrack.album()) || this.isExplicit != offlineTrack.isExplicit() || this.isMogef19 != offlineTrack.isMogef19()) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = 1231;
        int hashCode = (((((((((((((this.uri.hashCode() ^ 1000003) * 1000003) ^ this.name.hashCode()) * 1000003) ^ this.imageUri.hashCode()) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ this.artistNames.hashCode()) * 1000003) ^ this.album.hashCode()) * 1000003) ^ (this.isExplicit ? 1231 : 1237)) * 1000003;
        if (!this.isMogef19) {
            i = 1237;
        }
        return hashCode ^ i;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("image")
    public Optional<String> imageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack
    @JsonProperty("explicit")
    public boolean isExplicit() {
        return this.isExplicit;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack
    @JsonProperty("mogef19")
    public boolean isMogef19() {
        return this.isMogef19;
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("name")
    public String name() {
        return this.name;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("OfflineTrack{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", imageUri=");
        V0.append(this.imageUri);
        V0.append(", artists=");
        V0.append(this.artists);
        V0.append(", artistNames=");
        V0.append(this.artistNames);
        V0.append(", album=");
        V0.append(this.album);
        V0.append(", isExplicit=");
        V0.append(this.isExplicit);
        V0.append(", isMogef19=");
        return je.P0(V0, this.isMogef19, "}");
    }

    @Override // com.spotify.libs.search.offline.model.OfflineTrack, com.spotify.libs.search.offline.model.OfflineEntity
    @JsonGetter("uri")
    public String uri() {
        return this.uri;
    }
}
