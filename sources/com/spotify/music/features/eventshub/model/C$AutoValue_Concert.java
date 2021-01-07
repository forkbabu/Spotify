package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_Concert  reason: invalid class name */
abstract class C$AutoValue_Concert extends Concert {
    private final List<Artist> artists;
    private final String category;
    private final String dateString;
    private final boolean festival;
    private final String id;
    private final String location;
    private final List<ConcertPartner> partnerConcerts;
    private final List<ConcertTicketing> ticketing;
    private final String title;
    private final String venue;

    C$AutoValue_Concert(String str, String str2, String str3, String str4, String str5, List<Artist> list, boolean z, List<ConcertPartner> list2, List<ConcertTicketing> list3, String str6) {
        this.id = str;
        this.dateString = str2;
        this.title = str3;
        this.location = str4;
        this.venue = str5;
        if (list != null) {
            this.artists = list;
            this.festival = z;
            this.partnerConcerts = list2;
            this.ticketing = list3;
            this.category = str6;
            return;
        }
        throw new NullPointerException("Null artists");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        List<ConcertPartner> list;
        List<ConcertTicketing> list2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Concert)) {
            return false;
        }
        Concert concert = (Concert) obj;
        String str = this.id;
        if (str != null ? str.equals(concert.getId()) : concert.getId() == null) {
            String str2 = this.dateString;
            if (str2 != null ? str2.equals(concert.getDateString()) : concert.getDateString() == null) {
                String str3 = this.title;
                if (str3 != null ? str3.equals(concert.getTitle()) : concert.getTitle() == null) {
                    String str4 = this.location;
                    if (str4 != null ? str4.equals(concert.getLocation()) : concert.getLocation() == null) {
                        String str5 = this.venue;
                        if (str5 != null ? str5.equals(concert.getVenue()) : concert.getVenue() == null) {
                            if (this.artists.equals(concert.getArtists()) && this.festival == concert.isFestival() && ((list = this.partnerConcerts) != null ? list.equals(concert.getPartnerConcerts()) : concert.getPartnerConcerts() == null) && ((list2 = this.ticketing) != null ? list2.equals(concert.getTicketing()) : concert.getTicketing() == null)) {
                                String str6 = this.category;
                                if (str6 == null) {
                                    if (concert.getCategory() == null) {
                                        return true;
                                    }
                                } else if (str6.equals(concert.getCategory())) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("artists")
    public List<Artist> getArtists() {
        return this.artists;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("category")
    public String getCategory() {
        return this.category;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("date")
    public String getDateString() {
        return this.dateString;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("partnerConcerts")
    public List<ConcertPartner> getPartnerConcerts() {
        return this.partnerConcerts;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("ticketing")
    public List<ConcertTicketing> getTicketing() {
        return this.ticketing;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("venue")
    public String getVenue() {
        return this.venue;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.dateString;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.title;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.location;
        int hashCode4 = (hashCode3 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.venue;
        int hashCode5 = (((((hashCode4 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003) ^ this.artists.hashCode()) * 1000003) ^ (this.festival ? 1231 : 1237)) * 1000003;
        List<ConcertPartner> list = this.partnerConcerts;
        int hashCode6 = (hashCode5 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<ConcertTicketing> list2 = this.ticketing;
        int hashCode7 = (hashCode6 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        String str6 = this.category;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 ^ i;
    }

    @Override // com.spotify.music.features.eventshub.model.Concert
    @JsonProperty("festival")
    public boolean isFestival() {
        return this.festival;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Concert{id=");
        V0.append(this.id);
        V0.append(", dateString=");
        V0.append(this.dateString);
        V0.append(", title=");
        V0.append(this.title);
        V0.append(", location=");
        V0.append(this.location);
        V0.append(", venue=");
        V0.append(this.venue);
        V0.append(", artists=");
        V0.append(this.artists);
        V0.append(", festival=");
        V0.append(this.festival);
        V0.append(", partnerConcerts=");
        V0.append(this.partnerConcerts);
        V0.append(", ticketing=");
        V0.append(this.ticketing);
        V0.append(", category=");
        return je.I0(V0, this.category, "}");
    }
}
