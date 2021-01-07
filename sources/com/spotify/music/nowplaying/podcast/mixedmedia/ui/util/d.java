package com.spotify.music.nowplaying.podcast.mixedmedia.ui.util;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

public final class d implements g {
    private final /* synthetic */ nmf a;

    public d(nmf nmf) {
        this.a = nmf;
    }

    @Override // io.reactivex.functions.g
    public final /* synthetic */ void accept(Object obj) {
        h.d(this.a.invoke(obj), "invoke(...)");
    }
}
