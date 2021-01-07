package com.spotify.music.features.ads.screensaver;

import com.spotify.music.features.ads.model.AdSlotEvent;
import io.reactivex.functions.l;

public final /* synthetic */ class z implements l {
    public final /* synthetic */ u0 a;

    public /* synthetic */ z(u0 u0Var) {
        this.a = u0Var;
    }

    @Override // io.reactivex.functions.l
    public final Object apply(Object obj) {
        return u0.a(this.a, (AdSlotEvent) obj);
    }
}
