package com.spotify.music.features.ads.sponsorship.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/* renamed from: com.spotify.music.features.ads.sponsorship.model.$AutoValue_Sponsorship  reason: invalid class name */
abstract class C$AutoValue_Sponsorship extends Sponsorship {
    private final Long endTime;
    private final Long startTime;
    private final String uri;

    C$AutoValue_Sponsorship(Long l, Long l2, String str) {
        if (l != null) {
            this.startTime = l;
            if (l2 != null) {
                this.endTime = l2;
                if (str != null) {
                    this.uri = str;
                    return;
                }
                throw new NullPointerException("Null uri");
            }
            throw new NullPointerException("Null endTime");
        }
        throw new NullPointerException("Null startTime");
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.Sponsorship
    @JsonProperty("endTime")
    public Long endTime() {
        return this.endTime;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Sponsorship)) {
            return false;
        }
        Sponsorship sponsorship = (Sponsorship) obj;
        if (!this.startTime.equals(sponsorship.startTime()) || !this.endTime.equals(sponsorship.endTime()) || !this.uri.equals(sponsorship.uri())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.Object
    public int hashCode() {
        return ((((this.startTime.hashCode() ^ 1000003) * 1000003) ^ this.endTime.hashCode()) * 1000003) ^ this.uri.hashCode();
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.Sponsorship
    @JsonProperty("startTime")
    public Long startTime() {
        return this.startTime;
    }

    @Override // java.lang.Object
    public String toString() {
        StringBuilder V0 = je.V0("Sponsorship{startTime=");
        V0.append(this.startTime);
        V0.append(", endTime=");
        V0.append(this.endTime);
        V0.append(", uri=");
        return je.I0(V0, this.uri, "}");
    }

    @Override // com.spotify.music.features.ads.sponsorship.model.Sponsorship
    @JsonProperty("spotifyUri")
    public String uri() {
        return this.uri;
    }
}
