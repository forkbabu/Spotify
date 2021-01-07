package com.spotify.mobile.android.video.endvideo;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.router.Response;
import io.reactivex.z;

@CosmosService
public interface j {
    @POST("sp://logging/v3/create_pending_message")
    z<PendingMessageResponse> a(@Body LogParameters logParameters);

    @POST("sp://logging/v3/update_pending_message")
    z<Response> b(@Body LogParameters logParameters);

    @POST("sp://logging/v3/send_pending_message")
    z<Response> c(@Body LogParameters logParameters);
}
