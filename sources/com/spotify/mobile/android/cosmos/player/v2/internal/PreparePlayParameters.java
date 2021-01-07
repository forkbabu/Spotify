package com.spotify.mobile.android.cosmos.player.v2.internal;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PreparePlayParameters implements JacksonModel {
    @JsonProperty("context")
    public PlayerContext context;
    @JsonProperty("options")
    public PlayOptions options;
    @JsonProperty("play_origin")
    public PlayOrigin playOrigin;

    @JsonCreator
    public PreparePlayParameters(@JsonProperty("context") PlayerContext playerContext, @JsonProperty("options") PlayOptions playOptions, @JsonProperty("play_origin") PlayOrigin playOrigin2) {
        this.context = playerContext;
        this.options = playOptions;
        this.playOrigin = playOrigin2;
    }
}
