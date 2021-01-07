package com.spotify.libs.connect.volume;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.s;

@CosmosService
public interface k {
    @SUB("sp://playback/v1/volume")
    s<VolumeState> a();
}
