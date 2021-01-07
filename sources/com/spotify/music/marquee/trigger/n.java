package com.spotify.music.marquee.trigger;

import com.spotify.music.features.ads.api.b;
import com.spotify.music.marquee.trigger.f0;
import io.reactivex.functions.g;

public final /* synthetic */ class n implements g {
    public final /* synthetic */ b a;

    public /* synthetic */ n(b bVar) {
        this.a = bVar;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b("errored", ((f0.d) obj).a());
    }
}
