package com.spotify.music.features.ads.video;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;

@CosmosService
public interface s {
    @SUB("sp://videoplayer/v1/commands")
    io.reactivex.s<VideoPlayerResponse> a();
}
