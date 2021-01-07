package com.spotify.music.features.ads.screensaver;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.android.schedulers.a;
import io.reactivex.s;
import io.reactivex.y;

public class u0 {
    private final zr3 a;
    private final y b;

    public u0(zr3 zr3, y yVar) {
        this.a = zr3;
        this.b = yVar;
    }

    public static s a(u0 u0Var, AdSlotEvent adSlotEvent) {
        u0Var.getClass();
        return s.i0(adSlotEvent).o0(adSlotEvent.getAd().isPreview() ? a.b() : u0Var.b);
    }

    public s<AdSlotEvent> b() {
        return this.a.c().j0(c0.a).r0(a0.a).Q(a.a).j0(b0.a).W(new z(this), false, Integer.MAX_VALUE);
    }
}
