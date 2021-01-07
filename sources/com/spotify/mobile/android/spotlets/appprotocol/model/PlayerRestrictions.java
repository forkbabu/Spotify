package com.spotify.mobile.android.spotlets.appprotocol.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
public abstract class PlayerRestrictions implements JacksonModel {
    public static final PlayerRestrictions DEFAULT = create(false, false, false, false, false, false);

    @JsonCreator
    public static PlayerRestrictions create(@JsonProperty("can_skip_next") boolean z, @JsonProperty("can_skip_prev") boolean z2, @JsonProperty("can_repeat_track") boolean z3, @JsonProperty("can_repeat_context") boolean z4, @JsonProperty("can_toggle_shuffle") boolean z5, @JsonProperty("can_seek") boolean z6) {
        return new AutoValue_PlayerRestrictions(z, z2, z3, z4, z5, z6);
    }

    @JsonProperty("can_repeat_context")
    public abstract boolean canRepeatContext();

    @JsonProperty("can_repeat_track")
    public abstract boolean canRepeatTrack();

    @JsonProperty("can_seek")
    public abstract boolean canSeek();

    @JsonProperty("can_skip_next")
    public abstract boolean canSkipNext();

    @JsonProperty("can_skip_prev")
    public abstract boolean canSkipPrev();

    @JsonProperty("can_toggle_shuffle")
    public abstract boolean canToggleShuffle();
}
