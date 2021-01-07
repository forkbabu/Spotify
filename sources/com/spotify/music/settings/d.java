package com.spotify.music.settings;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.PUT;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.cosmos.router.Response;
import io.reactivex.s;
import io.reactivex.z;

@CosmosService
public interface d {
    @SUB("sp://settings/v1/values")
    s<SettingsState> a();

    @PUT("sp://settings/v1/values/{key}")
    z<Response> b(@Path("key") String str, @Body String str2);
}
