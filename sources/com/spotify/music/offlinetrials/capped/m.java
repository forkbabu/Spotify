package com.spotify.music.offlinetrials.capped;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.s;

@CosmosService
public interface m {
    @SUB("sp://offline-capping/v1/updates")
    s<String> a();
}
