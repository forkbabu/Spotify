package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_ConcertTicketing  reason: invalid class name */
abstract class C$AutoValue_ConcertTicketing extends ConcertTicketing {
    private final String maxPrice;
    private final String minPrice;

    C$AutoValue_ConcertTicketing(String str, String str2) {
        this.minPrice = str;
        this.maxPrice = str2;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConcertTicketing)) {
            return false;
        }
        ConcertTicketing concertTicketing = (ConcertTicketing) obj;
        String str = this.minPrice;
        if (str != null ? str.equals(concertTicketing.getMinPrice()) : concertTicketing.getMinPrice() == null) {
            String str2 = this.maxPrice;
            if (str2 == null) {
                if (concertTicketing.getMaxPrice() == null) {
                    return true;
                }
            } else if (str2.equals(concertTicketing.getMaxPrice())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertTicketing
    @JsonProperty("maxPrice")
    public String getMaxPrice() {
        return this.maxPrice;
    }

    @Override // com.spotify.music.features.eventshub.model.ConcertTicketing
    @JsonProperty("minPrice")
    public String getMinPrice() {
        return this.minPrice;
    }

    @Override // java.lang.Object
    public int hashCode() {
        String str = this.minPrice;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.maxPrice;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("ConcertTicketing{minPrice=");
        V0.append(this.minPrice);
        V0.append(", maxPrice=");
        return je.I0(V0, this.maxPrice, "}");
    }
}
