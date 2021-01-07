package com.spotify.music.nowplaying.podcast.mixedmedia.ui.tracklist;

import androidx.recyclerview.widget.m;
import kotlin.jvm.internal.h;

public final class d extends m.d<e> {
    public static final d a = new d();

    private d() {
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean a(e eVar, e eVar2) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        h.e(eVar3, "oldItem");
        h.e(eVar4, "newItem");
        c c = eVar3.c();
        c c2 = eVar4.c();
        return c.k() == c2.k() && c.j() == c2.j() && c.i() == c2.i();
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // androidx.recyclerview.widget.m.d
    public boolean b(e eVar, e eVar2) {
        e eVar3 = eVar;
        e eVar4 = eVar2;
        h.e(eVar3, "oldItem");
        h.e(eVar4, "newItem");
        return eVar3.c().e() == eVar4.c().e();
    }
}
