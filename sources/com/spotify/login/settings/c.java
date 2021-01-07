package com.spotify.login.settings;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.Headers;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface c {
    @Headers({"force-request: true"})
    @PUT("sp://settings/v1/values/offline_mode")
    z<Response> a(@Body String str);

    @SUB("sp://settings/v1/values")
    @Headers({"force-request: true"})
    s<SettingsResponse> b();
}
