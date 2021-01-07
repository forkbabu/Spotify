package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.Path;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.s;

@CosmosService
/* renamed from: ql3  reason: default package */
public interface ql3 {
    @SUB("sp://ads/v1/formats/{formatName}")
    s<AdSlotEvent> a(@Path("formatName") String str);
}
