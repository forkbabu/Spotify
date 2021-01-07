package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_Album  reason: invalid class name */
abstract class C$AutoValue_Album extends Album {
    private final String artistName;
    private final String imageUri;
    private final String name;
    private final String uri;

    C$AutoValue_Album(String str, String str2, String str3, String str4) {
        if (str != null) {
            this.uri = str;
            this.name = str2;
            this.imageUri = str3;
            this.artistName = str4;
            return;
        }
        throw new NullPointerException("Null uri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Album)) {
            return false;
        }
        Album album = (Album) obj;
        if (this.uri.equals(album.getUri()) && ((str = this.name) != null ? str.equals(album.getName()) : album.getName() == null) && ((str2 = this.imageUri) != null ? str2.equals(album.getImageUri()) : album.getImageUri() == null)) {
            String str3 = this.artistName;
            if (str3 == null) {
                if (album.getArtistName() == null) {
                    return true;
                }
            } else if (str3.equals(album.getArtistName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.Album
    @JsonProperty("artistName")
    public String getArtistName() {
        return this.artistName;
    }

    @Override // com.spotify.music.features.eventshub.model.Album
    @JsonProperty("imageUri")
    public String getImageUri() {
        return this.imageUri;
    }

    @Override // com.spotify.music.features.eventshub.model.Album
    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    @Override // com.spotify.music.features.eventshub.model.Album
    @JsonProperty("uri")
    public String getUri() {
        return this.uri;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.uri.hashCode() ^ 1000003) * 1000003;
        String str = this.name;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.imageUri;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.artistName;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Album{uri=");
        V0.append(this.uri);
        V0.append(", name=");
        V0.append(this.name);
        V0.append(", imageUri=");
        V0.append(this.imageUri);
        V0.append(", artistName=");
        return je.I0(V0, this.artistName, "}");
    }
}
