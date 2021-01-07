package com.spotify.music.features.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ArtistConcertsModel implements JacksonModel, Parcelable {

    /* access modifiers changed from: package-private */
    public static final class a extends zod<ConcertResult> {
        protected a() {
            super(ArtistConcertsModel.getConcertResultCreator());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends cpd<Artist> {
        protected b() {
            super(ArtistConcertsModel.getArtistCreator());
        }
    }

    @JsonCreator
    public static ArtistConcertsModel create(@JsonProperty("artist") Artist artist, @JsonProperty("userLocation") String str, @JsonProperty("concerts") List<ConcertResult> list) {
        return new AutoValue_ArtistConcertsModel(artist, str, list);
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends Artist> getArtistCreator() {
        return AutoValue_Artist.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends ConcertResult> getConcertResultCreator() {
        return AutoValue_ConcertResult.CREATOR;
    }

    @JsonProperty("artist")
    public abstract Artist getArtist();

    @JsonProperty("concerts")
    public abstract List<ConcertResult> getConcerts();

    @JsonProperty("userLocation")
    public abstract String getUserLocation();
}
