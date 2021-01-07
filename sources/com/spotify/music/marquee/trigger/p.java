package com.spotify.music.marquee.trigger;

import com.spotify.music.marquee.trigger.f0;
import io.reactivex.functions.g;

public final /* synthetic */ class p implements g {
    public final /* synthetic */ ujb a;

    public /* synthetic */ p(ujb ujb) {
        this.a = ujb;
    }

    @Override // io.reactivex.functions.g
    public final void accept(Object obj) {
        f0.a aVar = (f0.a) obj;
        this.a.a();
    }
}
