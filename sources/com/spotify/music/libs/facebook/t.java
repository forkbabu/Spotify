package com.spotify.music.libs.facebook;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.POST;
import com.spotify.cosmos.android.cosmonaut.annotations.Query;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import io.reactivex.a;
import io.reactivex.s;

@CosmosService
public interface t {
    @SUB("sp://core-social/v1/state")
    s<SocialState> a();

    @POST("sp://core-social/v1/set-access-token")
    a b(@Query("accessToken") String str);

    @SUB("sp://core-social/v1/events")
    s<SocialEvent> events();
}
