package com.spotify.mobile.android.cosmos.player.v2;

import android.os.Parcelable;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
@Deprecated
public abstract class PlayerOptions implements JacksonModel, Parcelable {
    @JsonCreator
    public static PlayerOptions create(@JsonProperty("shuffling_context") boolean z, @JsonProperty("repeating_context") boolean z2, @JsonProperty("repeating_track") boolean z3) {
        return new AutoValue_PlayerOptions(z, z2, z3);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlayerOptions)) {
            return false;
        }
        PlayerOptions playerOptions = (PlayerOptions) obj;
        return shufflingContext() == playerOptions.shufflingContext() && repeatingContext() == playerOptions.repeatingContext() && repeatingTrack() == playerOptions.repeatingTrack();
    }

    @Override // java.lang.Object
    public int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(shufflingContext()), Boolean.valueOf(repeatingTrack()), Boolean.valueOf(repeatingTrack())});
    }

    @JsonProperty("repeating_context")
    public abstract boolean repeatingContext();

    @JsonProperty("repeating_track")
    public abstract boolean repeatingTrack();

    @JsonProperty("shuffling_context")
    public abstract boolean shufflingContext();
}
