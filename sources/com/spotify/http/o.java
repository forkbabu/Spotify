package com.spotify.http;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import io.reactivex.a;
import java.util.List;

@CosmosService
public interface o {
    @PUT("sp://netstat/v1/request-info")
    a a(@Body List<RequestInfo> list);
}
