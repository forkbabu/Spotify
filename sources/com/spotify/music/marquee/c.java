package com.spotify.music.marquee;

import com.spotify.cosmos.router.Response;
import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.l;

public final /* synthetic */ class c implements l {
    public final /* synthetic */ MarqueeService a;

    public /* synthetic */ c(MarqueeService marqueeService) {
        this.a = marqueeService;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Response response = (Response) obj;
        return this.a.c.d(AdSlot.MARQUEE.slot_id, "slot_enabled", "true");
    }
}
