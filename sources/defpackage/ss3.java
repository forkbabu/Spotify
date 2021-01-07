package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Body;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.ads.model.Event;
import com.spotify.music.features.ads.rx.model.RewardAdsRequestBody;
import io.reactivex.s;

@CosmosService
/* renamed from: ss3  reason: default package */
public interface ss3 {
    @SUB("sp://ads/v1/events/started")
    s<Event> a(@Body RewardAdsRequestBody rewardAdsRequestBody);
}
