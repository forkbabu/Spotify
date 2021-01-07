package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import io.reactivex.functions.n;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e implements n {
    private final /* synthetic */ nmf a;

    e(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.n
    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.a.invoke(obj);
        h.d(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
