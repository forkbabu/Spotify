package com.spotify.music.newplaying.scroll.container;

import io.reactivex.functions.n;

public final /* synthetic */ class k implements n {
    public final /* synthetic */ float a;

    public /* synthetic */ k(float f) {
        this.a = f;
    }

    @Override // io.reactivex.functions.n
    public final boolean test(Object obj) {
        float f = this.a;
        int i = WidgetsContainer.c;
        return ((a0) obj).a() >= f;
    }
}
