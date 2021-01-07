package com.spotify.music.marquee.trigger;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.n;

public final /* synthetic */ class e implements n {
    public static final /* synthetic */ e a = new e();

    private /* synthetic */ e() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        return ((AdSlotEvent) obj) != null;
    }
}
