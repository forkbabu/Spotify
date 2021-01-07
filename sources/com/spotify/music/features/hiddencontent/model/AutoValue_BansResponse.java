package com.spotify.music.features.hiddencontent.model;

import com.spotify.music.libs.collection.json.ArtistJacksonModel;
import com.spotify.music.libs.collection.json.TrackJacksonModel;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_BansResponse extends BansResponse {
    private final List<ArtistJacksonModel> artists;
    private final List<TrackJacksonModel> tracks;

    AutoValue_BansResponse(List<TrackJacksonModel> list, List<ArtistJacksonModel> list2) {
        if (list != null) {
            this.tracks = list;
            if (list2 != null) {
                this.artists = list2;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null tracks");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BansResponse)) {
            return false;
        }
        BansResponse bansResponse = (BansResponse) obj;
        if (!this.tracks.equals(bansResponse.getTracks()) || !this.artists.equals(bansResponse.getArtists())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.features.hiddencontent.model.BansResponse
    public List<ArtistJacksonModel> getArtists() {
        return this.artists;
    }

    @Override // com.spotify.music.features.hiddencontent.model.BansResponse
    public List<TrackJacksonModel> getTracks() {
        return this.tracks;
    }

    public int hashCode() {
        return ((this.tracks.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("BansResponse{tracks=");
        V0.append(this.tracks);
        V0.append(", artists=");
        return je.L0(V0, this.artists, "}");
    }
}
