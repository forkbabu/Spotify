package com.spotify.music.features.connectui.picker.frictionlessjoin;

import io.reactivex.s;
import io.reactivex.y;
import java.util.concurrent.TimeUnit;

public final class h implements j {
    private final y a;

    public h(y yVar) {
        kotlin.jvm.internal.h.e(yVar, "scheduler");
        this.a = yVar;
    }

    @Override // com.spotify.music.features.connectui.picker.frictionlessjoin.j
    public s<Long> a() {
        s<Long> G0 = s.h0(5, TimeUnit.SECONDS, this.a).G0(0L);
        kotlin.jvm.internal.h.d(G0, "Observable.interval(\n   …ith(FIRST_EMISSION_INDEX)");
        return G0;
    }
}
