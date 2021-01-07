package com.spotify.music.offlinetrials.limited.trackentity.endpoint;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import io.reactivex.z;

@CosmosService
public interface a {
    @GET("sp://offline/v1/resources")
    z<OfflineTracks> a(@Query("uris") String str);
}
