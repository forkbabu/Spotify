package com.spotify.music.behindthelyrics.model.business;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* access modifiers changed from: package-private */
public final class AutoValue_TrackAnnotationSet extends TrackAnnotationSet {
    private final List<TrackAnnotation> annotations;
    private final String artistName;
    private final int geniusTrackId;
    private final String spotifyTrackId;
    private final String trackTitle;

    AutoValue_TrackAnnotationSet(String str, int i, String str2, String str3, List<TrackAnnotation> list) {
        if (str != null) {
            this.spotifyTrackId = str;
            this.geniusTrackId = i;
            if (str2 != null) {
                this.artistName = str2;
                if (str3 != null) {
                    this.trackTitle = str3;
                    if (list != null) {
                        this.annotations = list;
                        return;
                    }
                    throw new NullPointerException("Null annotations");
                }
                throw new NullPointerException("Null trackTitle");
            }
            throw new NullPointerException("Null artistName");
        }
        throw new NullPointerException("Null spotifyTrackId");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof TrackAnnotationSet)) {
            return false;
        }
        TrackAnnotationSet trackAnnotationSet = (TrackAnnotationSet) obj;
        if (!this.spotifyTrackId.equals(trackAnnotationSet.getSpotifyTrackId()) || this.geniusTrackId != trackAnnotationSet.getGeniusTrackId() || !this.artistName.equals(trackAnnotationSet.getArtistName()) || !this.trackTitle.equals(trackAnnotationSet.getTrackTitle()) || !this.annotations.equals(trackAnnotationSet.getAnnotations())) {
            return false;
        }
        return true;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet
    @JsonProperty("annotations")
    public List<TrackAnnotation> getAnnotations() {
        return this.annotations;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet
    @JsonProperty("artist")
    public String getArtistName() {
        return this.artistName;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet
    @JsonProperty("genius_song_id")
    public int getGeniusTrackId() {
        return this.geniusTrackId;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet
    @JsonProperty("spotify_uuid")
    public String getSpotifyTrackId() {
        return this.spotifyTrackId;
    }

    @Override // com.spotify.music.behindthelyrics.model.business.TrackAnnotationSet
    @JsonProperty("title")
    public String getTrackTitle() {
        return this.trackTitle;
    }

    public int hashCode() {
        return ((((((((this.spotifyTrackId.hashCode() ^ 1000003) * 1000003) ^ this.geniusTrackId) * 1000003) ^ this.artistName.hashCode()) * 1000003) ^ this.trackTitle.hashCode()) * 1000003) ^ this.annotations.hashCode();
    }

    public String toString() {
        StringBuilder V0 = je.V0("TrackAnnotationSet{spotifyTrackId=");
        V0.append(this.spotifyTrackId);
        V0.append(", geniusTrackId=");
        V0.append(this.geniusTrackId);
        V0.append(", artistName=");
        V0.append(this.artistName);
        V0.append(", trackTitle=");
        V0.append(this.trackTitle);
        V0.append(", annotations=");
        return je.L0(V0, this.annotations, "}");
    }
}
