package com.spotify.music.marquee;

import com.spotify.music.features.ads.model.AdSlot;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public final /* synthetic */ MarqueeService a;

    public /* synthetic */ a(MarqueeService marqueeService) {
        this.a = marqueeService;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        Boolean bool = (Boolean) obj;
        return this.a.b.a(AdSlot.MARQUEE);
    }
}
