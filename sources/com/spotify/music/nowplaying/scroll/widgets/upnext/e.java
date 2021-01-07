package com.spotify.music.nowplaying.scroll.widgets.upnext;

import io.reactivex.functions.g;
import kotlin.jvm.internal.h;

/* access modifiers changed from: package-private */
public final class e<T> implements g<Boolean> {
    final /* synthetic */ i a;

    e(i iVar) {
        this.a = iVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // io.reactivex.functions.g
    public void accept(Boolean bool) {
        Boolean bool2 = bool;
        i iVar = this.a;
        h.d(bool2, "it");
        iVar.d = bool2.booleanValue();
    }
}
