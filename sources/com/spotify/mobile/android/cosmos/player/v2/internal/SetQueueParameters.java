package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SetQueueParameters implements JacksonModel {
    @JsonProperty("next_tracks")
    public final PlayerTrack[] mNextTracks;
    @JsonProperty("options")
    public final PlayOptions mPlayOptions;
    @JsonProperty("prev_tracks")
    public final PlayerTrack[] mPrevTracks;
    @JsonProperty("revision")
    public final String mRevision;

    public SetQueueParameters(PlayerQueue playerQueue, boolean z) {
        this.mPlayOptions = new PlayOptions.Builder().overrideRestrictions(z).build();
        this.mNextTracks = playerQueue.nextTracks();
        this.mPrevTracks = playerQueue.prevTracks();
        this.mRevision = playerQueue.revision();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SetQueueParameters)) {
            return false;
        }
        SetQueueParameters setQueueParameters = (SetQueueParameters) obj;
        if (this.mRevision.equals(setQueueParameters.mRevision) && Arrays.equals(this.mNextTracks, setQueueParameters.mNextTracks) && rw.equal(this.mPlayOptions, setQueueParameters.mPlayOptions)) {
            return Arrays.equals(this.mPrevTracks, setQueueParameters.mPrevTracks);
        }
        return false;
    }

    public int hashCode() {
        return (((Arrays.hashCode(new Object[]{this.mRevision, this.mPlayOptions}) * 31) + Arrays.hashCode(this.mNextTracks)) * 31) + Arrays.hashCode(this.mPrevTracks);
    }
}
