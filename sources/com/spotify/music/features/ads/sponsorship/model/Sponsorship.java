package com.spotify.music.features.ads.sponsorship.model;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.util.LinkType;
import com.spotify.mobile.android.util.l0;

@JsonIgnoreProperties(ignoreUnknown = true)
public abstract class Sponsorship implements JacksonModel, Parcelable {
    public boolean mViewedDuringSession;

    @JsonCreator
    public static Sponsorship create(@JsonProperty("startTime") long j, @JsonProperty("endTime") long j2, @JsonProperty("spotifyUri") String str) {
        return new AutoValue_Sponsorship(Long.valueOf(j), Long.valueOf(j2), str);
    }

    public void displayedDuringSession() {
        this.mViewedDuringSession = true;
    }

    @JsonProperty("endTime")
    public abstract Long endTime();

    public boolean isEqual(String str) {
        l0 z = l0.z(uri());
        l0 z2 = l0.z(str);
        LinkType q = z.q();
        LinkType linkType = LinkType.DUMMY;
        if (q == linkType || z2.q() == linkType || z.q() != z2.q() || !z.k().equals(z2.k())) {
            return false;
        }
        return true;
    }

    @JsonProperty("startTime")
    public abstract Long startTime();

    @JsonProperty("spotifyUri")
    public abstract String uri();

    public boolean wasDisplayedDuringSession() {
        return this.mViewedDuringSession;
    }
}
