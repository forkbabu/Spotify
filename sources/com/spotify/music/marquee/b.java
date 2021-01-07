package com.spotify.music.marquee;

import io.reactivex.functions.n;

public final /* synthetic */ class b implements n {
    public static final /* synthetic */ b a = new b();

    private /* synthetic */ b() {
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        int i = MarqueeService.q;
        return ((Boolean) obj).booleanValue();
    }
}
