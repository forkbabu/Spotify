package com.spotify.music.features.ads;

import com.spotify.music.features.ads.api.SlotApi;
import com.spotify.music.features.ads.rules.AdRules;
import io.reactivex.s;

public final class o1 implements fjf<n1> {
    private final wlf<SlotApi> a;
    private final wlf<AdRules> b;
    private final wlf<s<Boolean>> c;

    public o1(wlf<SlotApi> wlf, wlf<AdRules> wlf2, wlf<s<Boolean>> wlf3) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
    }

    @Override // defpackage.wlf
    public Object get() {
        return new n1(this.a.get(), this.b.get(), this.c.get());
    }
}
