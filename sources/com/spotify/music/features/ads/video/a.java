package com.spotify.music.features.ads.video;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

public final /* synthetic */ class a implements l {
    public static final /* synthetic */ a a = new a();

    private /* synthetic */ a() {
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return ((AdSlotEvent) obj).getAd();
    }
}
