package com.spotify.libs.connect.volume;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.s;

@CosmosService
public interface j {
    @SUB("sp://connect/v1/on_enabling_local_playback")
    s<String> a();
}
