package defpackage;

import com.spotify.mobile.android.ui.contextmenu.b4;
import com.spotify.music.libs.viewuri.c;
import com.spotify.music.podcast.episode.util.h;

/* renamed from: nsc  reason: default package */
public final class nsc implements fjf<b4<msc>> {
    private final wlf<h32> a;
    private final wlf<c> b;
    private final wlf<fm9> c;
    private final wlf<com.spotify.android.flags.c> d;
    private final wlf<ifd> e;
    private final wlf<Boolean> f;
    private final wlf<Boolean> g;
    private final wlf<h> h;
    private final wlf<tsc> i;
    private final wlf<Boolean> j;

    public nsc(wlf<h32> wlf, wlf<c> wlf2, wlf<fm9> wlf3, wlf<com.spotify.android.flags.c> wlf4, wlf<ifd> wlf5, wlf<Boolean> wlf6, wlf<Boolean> wlf7, wlf<h> wlf8, wlf<tsc> wlf9, wlf<Boolean> wlf10) {
        this.a = wlf;
        this.b = wlf2;
        this.c = wlf3;
        this.d = wlf4;
        this.e = wlf5;
        this.f = wlf6;
        this.g = wlf7;
        this.h = wlf8;
        this.i = wlf9;
        this.j = wlf10;
    }

    public static nsc a(wlf<h32> wlf, wlf<c> wlf2, wlf<fm9> wlf3, wlf<com.spotify.android.flags.c> wlf4, wlf<ifd> wlf5, wlf<Boolean> wlf6, wlf<Boolean> wlf7, wlf<h> wlf8, wlf<tsc> wlf9, wlf<Boolean> wlf10) {
        return new nsc(wlf, wlf2, wlf3, wlf4, wlf5, wlf6, wlf7, wlf8, wlf9, wlf10);
    }

    @Override // defpackage.wlf
    public Object get() {
        h32 h32 = this.a.get();
        c cVar = this.b.get();
        fm9 fm9 = this.c.get();
        com.spotify.android.flags.c cVar2 = this.d.get();
        ifd ifd = this.e.get();
        return new lsc(fm9, cVar2, h32, cVar, this.f.get().booleanValue(), this.g.get().booleanValue(), this.h.get(), ifd, this.j.get().booleanValue(), this.i.get());
    }
}
