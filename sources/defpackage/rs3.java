package defpackage;

import com.spotify.cosmos.android.cosmonaut.CosmosService;
import com.spotify.cosmos.android.cosmonaut.annotations.SUB;
import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.s;

@CosmosService
/* renamed from: rs3  reason: default package */
public interface rs3 {
    @SUB("sp://ads/v1/slots/marquee")
    s<AdSlotEvent> a();

    @SUB("sp://ads/v1/slots/sponsored-playlist")
    s<AdSlotEvent> b();

    @SUB("sp://ads/v1/slots/mobile-screensaver")
    s<AdSlotEvent> c();
}
