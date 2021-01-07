package com.spotify.offline;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.DELETE;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface e {
    @DELETE("sp://offline/v1/resources?uri={uri}")
    a a(@Path("uri") String str);

    @SUB("sp://offline/v1/resources?filteredStateUpdates={filterStateUpdates}")
    @Headers({"accept: application/vnd.api+json"})
    s<hrd> b(@Path("filterStateUpdates") String str);

    @GET("sp://offline/v1/resources?filteredStateUpdates=false")
    @Headers({"accept: application/vnd.api+json"})
    z<hrd> c();
}
