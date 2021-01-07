package com.spotify.music.features.yourlibraryx.contextmenu;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.mobile.android.ui.contextmenu.delegates.playlist.f;
import com.spotify.mobile.android.ui.contextmenu.r3;
import com.spotify.music.libs.viewuri.c;
import defpackage.w22;
import kotlin.jvm.internal.h;

public final class b implements b4<a> {
    private final c a;
    private final l22 b;
    private final u22 c;
    private final f f;
    private final r32 n;
    private final boolean o;

    public b(c cVar, l22 l22, u22 u22, f fVar, r32 r32, boolean z) {
        h.e(cVar, "viewUri");
        h.e(l22, "albumBuilder");
        h.e(u22, "artistBuilder");
        h.e(fVar, "playlistBuilder");
        h.e(r32, "showBuilder");
        this.a = cVar;
        this.b = l22;
        this.c = u22;
        this.f = fVar;
        this.n = r32;
        this.o = z;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.spotify.mobile.android.ui.contextmenu.b4
    public r3 p0(a aVar) {
        a aVar2 = aVar;
        h.e(aVar2, "model");
        int ordinal = aVar2.b().ordinal();
        if (ordinal == 0) {
            r3 b2 = this.b.a(aVar2.c(), aVar2.a()).a(this.a).g(true).c(true).d(this.o).b();
            h.d(b2, "albumBuilder\n           …bled)\n            .fill()");
            return b2;
        } else if (ordinal == 1) {
            w22.d d = this.c.a(aVar2.c(), aVar2.a()).a(this.a).d(false);
            d.i(true);
            d.c(true);
            d.f(false);
            r3 b3 = d.b();
            h.d(b3, "artistBuilder\n          …alse)\n            .fill()");
            return b3;
        } else if (ordinal == 3) {
            r3 b4 = this.f.a(aVar2.c(), aVar2.a()).a(this.a).d(this.o).c(true).b();
            h.d(b4, "playlistBuilder\n        …true)\n            .fill()");
            return b4;
        } else if (ordinal != 4) {
            r3 r3Var = r3.b;
            h.d(r3Var, "ContextMenuDelegate.EMPTY");
            return r3Var;
        } else {
            r3 b5 = this.n.a(aVar2.c(), aVar2.a()).a(this.a).b();
            h.d(b5, "showBuilder\n            …wUri)\n            .fill()");
            return b5;
        }
    }
}
