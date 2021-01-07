package com.spotify.music.features.eventshub.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.eventshub.model.$AutoValue_Artist  reason: invalid class name */
abstract class C$AutoValue_Artist extends Artist {
    private final String getImageUri;
    private final Integer getMonthlyListener;
    private final String getName;
    private final String getUri;
    private final boolean hasAffinity;

    C$AutoValue_Artist(String str, String str2, String str3, boolean z, Integer num) {
        if (str != null) {
            this.getUri = str;
            this.getName = str2;
            this.getImageUri = str3;
            this.hasAffinity = z;
            this.getMonthlyListener = num;
            return;
        }
        throw new NullPointerException("Null getUri");
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Artist)) {
            return false;
        }
        Artist artist = (Artist) obj;
        if (this.getUri.equals(artist.getUri()) && ((str = this.getName) != null ? str.equals(artist.getName()) : artist.getName() == null) && ((str2 = this.getImageUri) != null ? str2.equals(artist.getImageUri()) : artist.getImageUri() == null) && this.hasAffinity == artist.hasAffinity()) {
            Integer num = this.getMonthlyListener;
            if (num == null) {
                if (artist.getMonthlyListener() == null) {
                    return true;
                }
            } else if (num.equals(artist.getMonthlyListener())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.spotify.music.features.eventshub.model.Artist
    @JsonProperty("imageUri")
    public String getImageUri() {
        return this.getImageUri;
    }

    @Override // com.spotify.music.features.eventshub.model.Artist
    @JsonProperty("monthlyListeners")
    public Integer getMonthlyListener() {
        return this.getMonthlyListener;
    }

    @Override // com.spotify.music.features.eventshub.model.Artist
    @JsonProperty("name")
    public String getName() {
        return this.getName;
    }

    @Override // com.spotify.music.features.eventshub.model.Artist
    @JsonProperty("uri")
    public String getUri() {
        return this.getUri;
    }

    @Override // com.spotify.music.features.eventshub.model.Artist
    @JsonProperty("hasAffinity")
    public boolean hasAffinity() {
        return this.hasAffinity;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int hashCode = (this.getUri.hashCode() ^ 1000003) * 1000003;
        String str = this.getName;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.getImageUri;
        int hashCode3 = (((hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003) ^ (this.hasAffinity ? 1231 : 1237)) * 1000003;
        Integer num = this.getMonthlyListener;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 ^ i;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Artist{getUri=");
        V0.append(this.getUri);
        V0.append(", getName=");
        V0.append(this.getName);
        V0.append(", getImageUri=");
        V0.append(this.getImageUri);
        V0.append(", hasAffinity=");
        V0.append(this.hasAffinity);
        V0.append(", getMonthlyListener=");
        V0.append(this.getMonthlyListener);
        V0.append("}");
        return V0.toString();
    }
}
