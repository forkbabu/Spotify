package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.GET;
import com.spotify.music.features.ads.model.AdState;
import io.reactivex.z;

@CosmosService
/* renamed from: sl3  reason: default package */
public interface sl3 {
    @GET("sp://ads/v1/state")
    z<AdState> getState();
}
