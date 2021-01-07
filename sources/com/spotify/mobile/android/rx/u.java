package com.spotify.mobile.android.rx;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface u {
    @PUT("sp://product-state/v1/values/{key}")
    z<Response> a(@Path("key") String str, @Body String str2);

    @SUB("sp://product-state/v1/values")
    s<ProductStateValuesResponse> b();
}
