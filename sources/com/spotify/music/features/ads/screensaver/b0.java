package com.spotify.music.features.ads.screensaver;

import com.google.common.base.Optional;
import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

public final /* synthetic */ class b0 implements l {
    public static final /* synthetic */ b0 a = new b0();

    private /* synthetic */ b0() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return (AdSlotEvent) ((Optional) obj).get();
    }
}
