package com.spotify.music.connection;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface k {
    @PUT("sp://offline/v1/connection")
    z<OfflineState> a(@Body OfflineState offlineState);

    @SUB("sp://offline/v1/connection")
    s<OfflineState> b();
}
