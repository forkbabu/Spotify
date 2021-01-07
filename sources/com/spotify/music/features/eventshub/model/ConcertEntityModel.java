package com.spotify.music.features.eventshub.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class ConcertEntityModel implements JacksonModel, Parcelable {
    public static final String FEW_TICKETS_LEFT = "FEW_TICKETS_LEFT";
    public static final String TICKETS_NOT_AVAILABLE = "TICKETS_NOT_AVAILABLE";

    /* access modifiers changed from: package-private */
    public static final class a extends zod<Album> {
        protected a() {
            super(ConcertEntityModel.getAlbumCreator());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class b extends zod<Artist> {
        protected b() {
            super(ConcertEntityModel.getArtistCreator());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class c extends cpd<ConcertResult> {
        protected c() {
            super(ConcertEntityModel.getConcertResultCreator());
        }
    }

    /* access modifiers changed from: package-private */
    public static final class d extends zod<ConcertResult> {
        protected d() {
            super(ConcertEntityModel.getConcertResultCreator());
        }
    }

    @JsonCreator
    public static ConcertEntityModel create(@JsonProperty("concert") ConcertResult concertResult, @JsonProperty("artists") List<Artist> list, @JsonProperty("upcomingConcerts") List<ConcertResult> list2, @JsonProperty("albums") List<Album> list3, @JsonProperty("userLocation") String str, @JsonProperty("upcomingConcertsSource") String str2, @JsonProperty("color") String str3, @JsonProperty("ticketAvailability") String str4) {
        return new AutoValue_ConcertEntityModel(concertResult, list, list2, list3, str, str2, str3, str4);
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends Album> getAlbumCreator() {
        return AutoValue_Album.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends Artist> getArtistCreator() {
        return AutoValue_Artist.CREATOR;
    }

    /* access modifiers changed from: private */
    public static Parcelable.Creator<? extends ConcertResult> getConcertResultCreator() {
        return AutoValue_ConcertResult.CREATOR;
    }

    @JsonProperty("albums")
    public abstract List<Album> getAlbumsForConcert();

    @JsonProperty("artists")
    public abstract List<Artist> getArtists();

    @JsonProperty("color")
    public abstract String getColor();

    @JsonProperty("concert")
    public abstract ConcertResult getConcertResult();

    @JsonProperty("ticketAvailability")
    public abstract String getTicketAvailability();

    @JsonProperty("upcomingConcerts")
    public abstract List<ConcertResult> getUpcomingConcerts();

    @JsonProperty("upcomingConcertsSource")
    public abstract String getUpcomingConcertsSource();

    @JsonProperty("userLocation")
    public abstract String getUserLocation();
}
