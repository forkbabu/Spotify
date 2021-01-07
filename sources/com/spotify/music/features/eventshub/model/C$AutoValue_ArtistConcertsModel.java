package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_ArtistConcertsModel  reason: invalid class name */
abstract class C$AutoValue_ArtistConcertsModel extends ArtistConcertsModel {
    private final Artist artist;
    private final List<ConcertResult> concerts;
    private final String userLocation;

    C$AutoValue_ArtistConcertsModel(Artist artist2, String str, List<ConcertResult> list) {
        if (artist2 != null) {
            this.artist = artist2;
            this.userLocation = str;
            if (list != null) {
                this.concerts = list;
                return;
            }
            throw new NullPointerException("Null concerts");
        }
        throw new NullPointerException("Null artist");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ArtistConcertsModel)) {
            return false;
        }
        ArtistConcertsModel artistConcertsModel = (ArtistConcertsModel) obj;
        if (!this.artist.equals(artistConcertsModel.getArtist()) || ((str = this.userLocation) != null ? !str.equals(artistConcertsModel.getUserLocation()) : artistConcertsModel.getUserLocation() != null) || !this.concerts.equals(artistConcertsModel.getConcerts())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.eventshub.model.ArtistConcertsModel
    @JsonProperty("artist")
    public Artist getArtist() {
        return this.artist;
    }

    @Override // com.spotify.music.features.eventshub.model.ArtistConcertsModel
    @JsonProperty("concerts")
    public List<ConcertResult> getConcerts() {
        return this.concerts;
    }

    @Override // com.spotify.music.features.eventshub.model.ArtistConcertsModel
    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.artist.hashCode() ^ 1000003) * 1000003;
        String str = this.userLocation;
        return ((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.concerts.hashCode();
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ArtistConcertsModel{artist=");
        V0.append(this.artist);
        V0.append(", userLocation=");
        V0.append(this.userLocation);
        V0.append(", concerts=");
        return je.L0(V0, this.concerts, "}");
    }
}
