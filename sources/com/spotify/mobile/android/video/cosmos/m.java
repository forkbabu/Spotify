package com.spotify.mobile.android.video.cosmos;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.video.model.PlayerError;
import com.spotify.mobile.android.video.model.PlayerState;
import com.spotify.mobile.android.video.model.VideoPlayerCommand;
import io.reactivex.a;
import io.reactivex.s;

@CosmosService
public interface m {
    @SUB("sp://videoplayer/v1/commands")
    s<VideoPlayerCommand> a();

    @POST("sp://videoplayer/v1/error")
    a b(@Body PlayerError playerError);

    @POST("sp://videoplayer/v1/advance")
    a c(@Body VideoPlayerAdvanceReason videoPlayerAdvanceReason);

    @POST("sp://videoplayer/v1/state")
    a d(@Body PlayerState playerState);
}
