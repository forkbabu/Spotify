package com.spotify.music.spotlets.radio.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.spotlets.radio.model.$AutoValue_RelatedArtistModel  reason: invalid class name */
abstract class C$AutoValue_RelatedArtistModel extends RelatedArtistModel {
    private final String artistName;
    private final String artistUri;

    C$AutoValue_RelatedArtistModel(String str, String str2) {
        if (str != null) {
            this.artistName = str;
            if (str2 != null) {
                this.artistUri = str2;
                return;
            }
            throw new NullPointerException("Null artistUri");
        }
        throw new NullPointerException("Null artistName");
    }

    @Override // com.spotify.music.spotlets.radio.model.RelatedArtistModel
    @JsonProperty
    public String artistName() {
        return this.artistName;
    }

    @Override // com.spotify.music.spotlets.radio.model.RelatedArtistModel
    @JsonProperty
    public String artistUri() {
        return this.artistUri;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof RelatedArtistModel)) {
            return false;
        }
        RelatedArtistModel relatedArtistModel = (RelatedArtistModel) obj;
        if (!this.artistName.equals(relatedArtistModel.artistName()) || !this.artistUri.equals(relatedArtistModel.artistUri())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((this.artistName.hashCode() ^ 1000003) * 1000003) ^ this.artistUri.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("RelatedArtistModel{artistName=");
        V0.append(this.artistName);
        V0.append(", artistUri=");
        return je.I0(V0, this.artistUri, "}");
    }
}
