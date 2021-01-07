package com.spotify.music.nowplaying.scroll.widgets.upnext;

import io.reactivex.functions.g;
import java.util.List;

/* access modifiers changed from: package-private */
public final class h<T> implements g<List<? extends a>> {
    final /* synthetic */ i a;

    h(i iVar) {
        this.a = iVar;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: com.spotify.music.nowplaying.scroll.widgets.upnext.k */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.reactivex.functions.g
    public void accept(List<? extends a> list) {
        List<? extends a> list2 = list;
        k kVar = this.a.b;
        if (kVar != 0) {
            kotlin.jvm.internal.h.d(list2, "it");
            kVar.a(list2);
        }
    }
}
