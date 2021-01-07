package com.spotify.music.marquee.trigger;

import com.spotify.music.marquee.trigger.f0;
import io.reactivex.functions.g;

public final /* synthetic */ class l implements g {
    public final /* synthetic */ ujb a;

    public /* synthetic */ l(ujb ujb) {
        this.a = ujb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        this.a.b(((f0.b) obj).a());
    }
}
