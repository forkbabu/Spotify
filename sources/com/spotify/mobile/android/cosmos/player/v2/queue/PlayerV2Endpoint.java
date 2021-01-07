package com.spotify.mobile.android.cosmos.player.v2.queue;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.JacksonModel;
import com.spotify.mobile.android.cosmos.player.v2.PlayerQueue;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.mobile.android.cosmos.player.v2.internal.SetQueueParameters;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface PlayerV2Endpoint {
    @DELETE("sp://player/v2/main/session/{session}")
    z<Response> deleteSession(@Path("session") String str);

    @POST("sp://player/v2/main/pause")
    z<Response> postPause(@Body JacksonModel jacksonModel);

    @POST("sp://player/v2/main/play")
    z<Response> postPlay(@Body JacksonModel jacksonModel);

    @POST("sp://player/v2/main/resume")
    z<Response> postResume(@Body JacksonModel jacksonModel);

    @POST("sp://player/v2/main/seek_to")
    z<Response> postSeekTo(@Body JacksonModel jacksonModel);

    @POST("sp://player/v2/main/session")
    z<Response> postSession(@Body JacksonModel jacksonModel);

    @POST("sp://player/v2/main/session/{session}/play")
    z<Response> postSessionPlay(@Path("session") String str, @Body LoggingParameters loggingParameters);

    @POST("sp://player/v2/main/skip_next")
    z<Response> postSkipNext(@Body JacksonModel jacksonModel);

    @POST("sp://player/v2/main/skip_prev")
    z<Response> postSkipPrev(@Body JacksonModel jacksonModel);

    @PUT("sp://player/v2/main/queue")
    z<Response> putQueueParams(@Body SetQueueParameters setQueueParameters);

    @SUB("sp://player/v2/main/queue")
    s<PlayerQueue> subscribeQueue();
}
