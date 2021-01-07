package com.spotify.mobile.android.service.session;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.s;

@CosmosService
public interface h {
    @SUB("sp://orbitsession/v1/server-time")
    s<ServerTime> a();
}
