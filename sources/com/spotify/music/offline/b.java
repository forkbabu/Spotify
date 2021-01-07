package com.spotify.music.offline;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.s;

@CosmosService
public interface b {
    @SUB("sp://offline/v1/error")
    s<OfflineErrorResponse> a();
}
