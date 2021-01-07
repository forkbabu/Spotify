package com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou;

import com.spotify.base.java.logging.Logger;
import com.spotify.music.nowplaying.scroll.widgets.podcastmoreforyou.network.h;

/* access modifiers changed from: package-private */
public final class g<T> implements io.reactivex.functions.g<h> {
    final /* synthetic */ h a;

    g(h hVar) {
        this.a = hVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(h hVar) {
        h hVar2 = hVar;
        if (hVar2 instanceof h.b) {
            j jVar = this.a.b;
            if (jVar != null) {
                jVar.a(((h.b) hVar2).a());
            }
        } else if (hVar2 instanceof h.a) {
            Logger.d(((h.a) hVar2).a(), new Object[0]);
        }
    }
}
