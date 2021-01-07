package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_ConcertEntityModel  reason: invalid class name */
abstract class C$AutoValue_ConcertEntityModel extends ConcertEntityModel {
    private final List<Album> albumsForConcert;
    private final List<Artist> artists;
    private final String color;
    private final ConcertResult concertResult;
    private final String ticketAvailability;
    private final List<ConcertResult> upcomingConcerts;
    private final String upcomingConcertsSource;
    private final String userLocation;

    C$AutoValue_ConcertEntityModel(ConcertResult concertResult2, List<Artist> list, List<ConcertResult> list2, List<Album> list3, String str, String str2, String str3, String str4) {
        if (concertResult2 != null) {
            this.concertResult = concertResult2;
            if (list != null) {
                this.artists = list;
                this.upcomingConcerts = list2;
                this.albumsForConcert = list3;
                this.userLocation = str;
                this.upcomingConcertsSource = str2;
                this.color = str3;
                this.ticketAvailability = str4;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null concertResult");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        List<ConcertResult> list;
        List<Album> list2;
        String str;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConcertEntityModel)) {
            return false;
        }
        ConcertEntityModel concertEntityModel = (ConcertEntityModel) obj;
        if (this.concertResult.equals(concertEntityModel.getConcertResult()) && this.artists.equals(concertEntityModel.getArtists()) && ((list = this.upcomingConcerts) != null ? list.equals(concertEntityModel.getUpcomingConcerts()) : concertEntityModel.getUpcomingConcerts() == null) && ((list2 = this.albumsForConcert) != null ? list2.equals(concertEntityModel.getAlbumsForConcert()) : concertEntityModel.getAlbumsForConcert() == null) && ((str = this.userLocation) != null ? str.equals(concertEntityModel.getUserLocation()) : concertEntityModel.getUserLocation() == null) && ((str2 = this.upcomingConcertsSource) != null ? str2.equals(concertEntityModel.getUpcomingConcertsSource()) : concertEntityModel.getUpcomingConcertsSource() == null) && ((str3 = this.color) != null ? str3.equals(concertEntityModel.getColor()) : concertEntityModel.getColor() == null)) {
            String str4 = this.ticketAvailability;
            if (str4 == null) {
                if (concertEntityModel.getTicketAvailability() == null) {
                    return true;
                }
            } else if (str4.equals(concertEntityModel.getTicketAvailability())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("albums")
    public List<Album> getAlbumsForConcert() {
        return this.albumsForConcert;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return this.artists;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("color")
    public String getColor() {
        return this.color;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("concert")
    public ConcertResult getConcertResult() {
        return this.concertResult;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("ticketAvailability")
    public String getTicketAvailability() {
        return this.ticketAvailability;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("upcomingConcerts")
    public List<ConcertResult> getUpcomingConcerts() {
        return this.upcomingConcerts;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("upcomingConcertsSource")
    public String getUpcomingConcertsSource() {
        return this.upcomingConcertsSource;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertEntityModel
    @JsonProperty("userLocation")
    public String getUserLocation() {
        return this.userLocation;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((this.concertResult.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode()) * 1000003;
        List<ConcertResult> list = this.upcomingConcerts;
        int i = 0;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<Album> list2 = this.albumsForConcert;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str = this.userLocation;
        int hashCode4 = (hashCode3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.upcomingConcertsSource;
        int hashCode5 = (hashCode4 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.color;
        int hashCode6 = (hashCode5 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.ticketAvailability;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode6 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ConcertEntityModel{concertResult=");
        V0.append(this.concertResult);
        V0.append(", artists=");
        V0.append(this.artists);
        V0.append(", upcomingConcerts=");
        V0.append(this.upcomingConcerts);
        V0.append(", albumsForConcert=");
        V0.append(this.albumsForConcert);
        V0.append(", userLocation=");
        V0.append(this.userLocation);
        V0.append(", upcomingConcertsSource=");
        V0.append(this.upcomingConcertsSource);
        V0.append(", color=");
        V0.append(this.color);
        V0.append(", ticketAvailability=");
        return je.I0(V0, this.ticketAvailability, "}");
    }
}
