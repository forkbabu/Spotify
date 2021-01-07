package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_EventResult  reason: invalid class name */
abstract class C$AutoValue_EventResult extends EventResult {
    private final List<String> artists;
    private final String closingDate;
    private final List<ConcertResult> concertResults;
    private final String location;
    private final String openingDate;
    private final String source;
    private final String venue;

    C$AutoValue_EventResult(List<ConcertResult> list, List<String> list2, String str, String str2, String str3, String str4, String str5) {
        if (list != null) {
            this.concertResults = list;
            if (list2 != null) {
                this.artists = list2;
                this.source = str;
                this.openingDate = str2;
                this.closingDate = str3;
                this.venue = str4;
                this.location = str5;
                return;
            }
            throw new NullPointerException("Null artists");
        }
        throw new NullPointerException("Null concertResults");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        String str4;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof EventResult)) {
            return false;
        }
        EventResult eventResult = (EventResult) obj;
        if (this.concertResults.equals(eventResult.getConcertResults()) && this.artists.equals(eventResult.getArtists()) && ((str = this.source) != null ? str.equals(eventResult.getSource()) : eventResult.getSource() == null) && ((str2 = this.openingDate) != null ? str2.equals(eventResult.getOpeningDate()) : eventResult.getOpeningDate() == null) && ((str3 = this.closingDate) != null ? str3.equals(eventResult.getClosingDate()) : eventResult.getClosingDate() == null) && ((str4 = this.venue) != null ? str4.equals(eventResult.getVenue()) : eventResult.getVenue() == null)) {
            String str5 = this.location;
            if (str5 == null) {
                if (eventResult.getLocation() == null) {
                    return true;
                }
            } else if (str5.equals(eventResult.getLocation())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.EventResult
    @JsonProperty("artists")
    public List<String> getArtists() {
        return this.artists;
    }

    @Override // com.spotify.music.features.eventshub.model.EventResult
    @JsonProperty("closingDate")
    public String getClosingDate() {
        return this.closingDate;
    }

    @Override // com.spotify.music.features.eventshub.model.EventResult
    @JsonProperty("concerts")
    public List<ConcertResult> getConcertResults() {
        return this.concertResults;
    }

    @Override // com.spotify.music.features.eventshub.model.EventResult
    @JsonProperty("location")
    public String getLocation() {
        return this.location;
    }

    @Override // com.spotify.music.features.eventshub.model.EventResult
    @JsonProperty("openingDate")
    public String getOpeningDate() {
        return this.openingDate;
    }

    @Override // com.spotify.music.features.eventshub.model.EventResult
    @JsonProperty("source")
    public String getSource() {
        return this.source;
    }

    @Override // com.spotify.music.features.eventshub.model.EventResult
    @JsonProperty("venue")
    public String getVenue() {
        return this.venue;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (((this.concertResults.hashCode() ^ 1000003) * 1000003) ^ this.artists.hashCode()) * 1000003;
        String str = this.source;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.openingDate;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.closingDate;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.venue;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.location;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("EventResult{concertResults=");
        V0.append(this.concertResults);
        V0.append(", artists=");
        V0.append(this.artists);
        V0.append(", source=");
        V0.append(this.source);
        V0.append(", openingDate=");
        V0.append(this.openingDate);
        V0.append(", closingDate=");
        V0.append(this.closingDate);
        V0.append(", venue=");
        V0.append(this.venue);
        V0.append(", location=");
        return je.I0(V0, this.location, "}");
    }
}
