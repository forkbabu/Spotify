package com.spotify.music.features.settings;

import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.rx.w;
import com.spotify.mobile.android.util.f0;
import com.spotify.music.features.ads.model.Ad;
import io.reactivex.a;
import io.reactivex.s;
import io.reactivex.z;

public class s0 {
    private final w a;
    private final f0 b;

    s0(w wVar, f0 f0Var) {
        this.a = wVar;
        this.b = f0Var;
    }

    public z<Boolean> a() {
        return this.a.c("publish-activity").j0(e.a).N0(1).B0();
    }

    public a b(boolean z) {
        s<Response> a2 = this.b.a("publish-activity", z ? "1" : Ad.DEFAULT_SKIPPABLE_AD_DELAY);
        a2.getClass();
        return new io.reactivex.internal.operators.observable.z(a2);
    }
}
