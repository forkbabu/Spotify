package com.spotify.collection.endpoints.track.json;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import kotlin.jvm.internal.h;

@JsonIgnoreProperties(ignoreUnknown = true)
public final class TrackPlayStateModel implements JacksonModel {
    private final String playabilityRestriction;

    public TrackPlayStateModel(@JsonProperty("playabilityRestriction") String str) {
        h.e(str, "playabilityRestriction");
        this.playabilityRestriction = str;
    }

    public static /* synthetic */ TrackPlayStateModel copy$default(TrackPlayStateModel trackPlayStateModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = trackPlayStateModel.playabilityRestriction;
        }
        return trackPlayStateModel.copy(str);
    }

    public final String component1() {
        return this.playabilityRestriction;
    }

    public final TrackPlayStateModel copy(@JsonProperty("playabilityRestriction") String str) {
        h.e(str, "playabilityRestriction");
        return new TrackPlayStateModel(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof TrackPlayStateModel) && h.a(this.playabilityRestriction, ((TrackPlayStateModel) obj).playabilityRestriction);
        }
        return true;
    }

    public final String getPlayabilityRestriction() {
        return this.playabilityRestriction;
    }

    public int hashCode() {
        String str = this.playabilityRestriction;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return je.I0(je.V0("TrackPlayStateModel(playabilityRestriction="), this.playabilityRestriction, ")");
    }
}
