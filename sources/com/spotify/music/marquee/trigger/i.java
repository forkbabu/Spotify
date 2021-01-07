package com.spotify.music.marquee.trigger;

import io.reactivex.functions.n;

public final /* synthetic */ class i implements n {
    public static final /* synthetic */ i a = new i();

    private /* synthetic */ i() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        S s = ((u3) obj).b;
        return s != null && s.booleanValue();
    }
}
