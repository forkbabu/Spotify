package com.spotify.music.features.secondaryintent.datasource;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import io.reactivex.z;

@CosmosService
public interface d {
    @GET("sp://ads/v1/ads/saved-ads")
    z<SavedAds> a();
}
