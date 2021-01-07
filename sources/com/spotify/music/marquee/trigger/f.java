package com.spotify.music.marquee.trigger;

import com.spotify.music.features.ads.model.AdSlotEvent;
import com.spotify.music.marquee.trigger.h0;
import io.reactivex.functions.l;

public final /* synthetic */ class f implements l {
    public static final /* synthetic */ f a = new f();

    private /* synthetic */ f() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        AdSlotEvent adSlotEvent = (AdSlotEvent) obj;
        if (adSlotEvent.getAd().id() == null || AdSlotEvent.Event.AVAILABLE != adSlotEvent.getEvent()) {
            return new h0.b("no marquee returned");
        }
        return new h0.c(adSlotEvent);
    }
}
