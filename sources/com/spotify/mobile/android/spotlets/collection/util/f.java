package com.spotify.mobile.android.spotlets.collection.util;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.mobile.android.spotlets.collection.util.CollectionStateProvider;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface f {
    @SUB("sp://core-collection/unstable/contains")
    s<CollectionStateProvider.Response> a(@Body CollectionStateProvider.ContainsRequest containsRequest);

    @POST("sp://core-collection/unstable/contains")
    z<CollectionStateProvider.Response> b(@Body CollectionStateProvider.ContainsRequest containsRequest);
}
