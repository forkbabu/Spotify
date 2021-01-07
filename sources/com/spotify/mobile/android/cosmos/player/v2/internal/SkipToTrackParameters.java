package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.appprotocol.model.AppProtocol;

public class SkipToTrackParameters implements JacksonModel {
    @JsonProperty("logging_params")
    public final LoggingParameters loggingParams;
    @JsonProperty("options")
    public PlayOptions playOptions;
    @JsonProperty(AppProtocol.TrackData.TYPE_TRACK)
    public PlayerTrack track;

    public SkipToTrackParameters(cqe cqe) {
        this.loggingParams = LoggingParameters.createWithCustomTimestamp(cqe.d());
    }
}
