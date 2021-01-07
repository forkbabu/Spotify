package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network.h;
import io.reactivex.functions.l;

/* access modifiers changed from: package-private */
public final class f<T, R> implements l<String, tpf<? extends h>> {
    final /* synthetic */ h a;

    f(h hVar) {
        this.a = hVar;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.l
    public tpf<? extends h> apply(String str) {
        String str2 = str;
        kotlin.jvm.internal.h.e(str2, "it");
        return this.a.e.a(str2).N();
    }
}
